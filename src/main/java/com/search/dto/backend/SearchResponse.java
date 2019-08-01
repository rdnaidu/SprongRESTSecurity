
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "searchResult"
})
public class SearchResponse {

    @JsonProperty("searchResult")
    private SearchResult searchResult;

    @JsonProperty("searchResult")
    public SearchResult getSearchResult() {
        return searchResult;
    }

    @JsonProperty("searchResult")
    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }


}
