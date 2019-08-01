package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "SearchResultArticle")
public class SearchResultArticle {

    @JsonProperty("resultCount")
    @ApiModelProperty
    private int resultCount;
    @JsonProperty("searchParams")
    @ApiModelProperty
    private SearchParams searchParams;
    @JsonProperty("records")
    @ApiModelProperty
    private List<ArticleId> records = null;

    public List<ArticleId> getRecords() {
        return records;
    }

    public void setRecords(List<ArticleId> records) {
        this.records = records;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public SearchParams getSearchParams() {
        return searchParams;
    }

    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }
}