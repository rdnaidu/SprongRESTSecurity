package com.search.controller;

import com.search.dto.backend.SearchResponse;
import com.search.dto.frontend.SearchParams;
import com.search.dto.frontend.SearchResult;
import com.search.dto.frontend.SearchResultArticle;
import com.search.facade.ProductSearchFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.search.Constants.*;

@RestController
public class SearchController {

    private final ProductSearchFacade productSearchFacade;
    private final MapperFacade mapper;

    public SearchController(ProductSearchFacade productSearchFacade, MapperFacade mapper) {
        this.productSearchFacade = productSearchFacade;
        this.mapper = mapper;
    }

    /**
     * Searches for products matching a freetext query
     *
     * @param query  The freetext to search for
     * @param params Additional Request params
     * @return A search result with products found for the query string
     */
    @ApiOperation(value = "Consume search queries", response = SearchResult.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal server error")
    }
    )
    @GetMapping(value = "/search/{query}", produces = "application/json")
    public SearchResult search(@PathVariable String query, final @RequestParam Map<String, String> params) {
        SearchResponse factFinderResult = productSearchFacade.executeSearch(query, params);
        return mapper.map(factFinderResult.getSearchResult(), SearchResult.class);
    }

    /**
     * Retrieves Cockpit simple/complex search products based on freetext query and additional params
     *
     * @param query  The freetext to search for e.g. regal
     * @param channelId channel, e.g. kkeu_de_de
     * @param productsPerPage max number of products per page
     * @return A search result with products found for the query string
     */
    @ApiOperation(value = "Retrieves Cockpit simple/complex search products based on freetext query, params and filters",
            notes = "channelId, customerId, idsOnly, productsPerPage...",
            response = SearchResultArticle.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal server error")
    }
    )
    @GetMapping(value = "/productCockpitSearch/{query}", produces = "application/json")
    public SearchResultArticle productCockpitSearchFilterMap(@PathVariable String query,
            final @RequestParam @ApiParam(value = "FF channel, e.g. kkeu_de_DE") String channelId,
            final @RequestParam(required = false) @ApiParam(value = "Products per page") String productsPerPage
    ) {
        Map<String, String> params = new HashMap<>();
        params.put(PARAMETER_CHANNEL_ID, channelId);
        params.put(PARAMETER_CUSTOMER_ID, DEFAULT_CUSTOMER_ID);
        params.put(PARAMETER_PRODUCTS_PER_PAGE, productsPerPage);

        SearchResponse factFinderResult = productSearchFacade.executeSearch(query, params);
        final SearchResultArticle result = mapper.map(factFinderResult, SearchResultArticle.class);
        result.setSearchParams(new SearchParams(params.get(PARAMETER_CHANNEL_ID), query));
        return result;
    }
}
