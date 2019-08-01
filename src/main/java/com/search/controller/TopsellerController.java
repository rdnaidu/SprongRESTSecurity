package com.search.controller;

import com.search.dto.backend.SearchResponse;
import com.search.dto.frontend.SearchResult;
import com.search.facade.ProductSearchFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TopsellerController {

    private final ProductSearchFacade productSearchFacade;
    private final MapperFacade mapper;

    public TopsellerController(ProductSearchFacade productSearchFacade, MapperFacade mapper) {
        this.productSearchFacade = productSearchFacade;
        this.mapper = mapper;
    }

    /**
     * Searches for topseller products
     *
     * @param params Additional Request params
     * @return A search result containing the current topsellers
     */
    @ApiOperation(value = "Searches for topseller products", response = SearchResult.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal server error")
    }
    )
    @RequestMapping(value = "/topseller", produces = "application/json", method = RequestMethod.GET)
    public SearchResult getTopsellers(final @RequestParam Map<String, String> params) {
        SearchResponse factFinderResponse = productSearchFacade.searchTopsellers(params);
        return mapper.map(factFinderResponse.getSearchResult(), SearchResult.class);
    }

}
