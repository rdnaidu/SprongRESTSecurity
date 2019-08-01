package com.search.controller;

import com.search.dto.backend.SearchResponse;
import com.search.dto.frontend.SearchResult;
import com.search.facade.ProductSearchFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/category/products")
public class CategoryController {

    private final ProductSearchFacade productSearchFacade;
    private final MapperFacade mapper;

    public CategoryController(ProductSearchFacade productSearchFacade, MapperFacade mapper) {
        this.productSearchFacade = productSearchFacade;
        this.mapper = mapper;
    }

    /**
     * Searches for products in a category
     *
     * @param mainCategory The main category which is uses to narrow down the search (Encoded in Base32)
     * @param subCategory  The main subcategory which is uses to narrow down the search (Encoded in Base32)
     * @param params       Additional Request params
     * @return A search result containing the products of a category
     */
    @ApiOperation(value = "Get all subcategories form main category", response = SearchResult.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal server error")
    }
    )
    @RequestMapping(value = "/{mainCategory}/subcategory/{subCategory}", method = RequestMethod.GET, produces = "application/json")
    public SearchResult getProductsInCategory(final @PathVariable String mainCategory,
                                              final @PathVariable String subCategory,
                                              final @RequestParam Map<String, String> params) {

        SearchResponse factFinderResponse = productSearchFacade.searchProductsInCategory(mainCategory, subCategory, params);

        return mapper.map(factFinderResponse.getSearchResult(), SearchResult.class);
    }

    /**
     * Searches for products in a category
     *
     * @param mainCategory The main category which is uses to narrow down the search (Encoded in Base32)
     * @param params       Additional Request params
     * @return A search result containing the products of a category
     */
    @ApiOperation(value = "Get all main category information's", response = SearchResult.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal server error")
    }
    )
    @RequestMapping(value = "{mainCategory}", method = RequestMethod.GET, produces = "application/json")
    public SearchResult getProductsInCategory(final @PathVariable String mainCategory,
                                              final @RequestParam Map<String, String> params) {
        SearchResponse factFinderResponse = productSearchFacade.searchProductsInCategory(mainCategory, null, params);
        return mapper.map(factFinderResponse.getSearchResult(), SearchResult.class);
    }

}
