
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentPage",
    "firstLink",
    "lastLink",
    "nextLink",
    "pageCount",
    "pageLinks",
    "previousLink",
    "resultsPerPage"
})
public class Paging {

    @JsonProperty("currentPage")
    private Integer currentPage;
    @JsonProperty("firstLink")
    private FirstLink firstLink;
    @JsonProperty("lastLink")
    private LastLink lastLink;
    @JsonProperty("nextLink")
    private NextLink nextLink;
    @JsonProperty("pageCount")
    private Integer pageCount;
    @JsonProperty("pageLinks")
    private List<PageLink> pageLinks = null;
    @JsonProperty("previousLink")
    private Object previousLink;
    @JsonProperty("resultsPerPage")
    private Integer resultsPerPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("currentPage")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("currentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("firstLink")
    public FirstLink getFirstLink() {
        return firstLink;
    }

    @JsonProperty("firstLink")
    public void setFirstLink(FirstLink firstLink) {
        this.firstLink = firstLink;
    }

    @JsonProperty("lastLink")
    public LastLink getLastLink() {
        return lastLink;
    }

    @JsonProperty("lastLink")
    public void setLastLink(LastLink lastLink) {
        this.lastLink = lastLink;
    }

    @JsonProperty("nextLink")
    public NextLink getNextLink() {
        return nextLink;
    }

    @JsonProperty("nextLink")
    public void setNextLink(NextLink nextLink) {
        this.nextLink = nextLink;
    }

    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("pageLinks")
    public List<PageLink> getPageLinks() {
        return pageLinks;
    }

    @JsonProperty("pageLinks")
    public void setPageLinks(List<PageLink> pageLinks) {
        this.pageLinks = pageLinks;
    }

    @JsonProperty("previousLink")
    public Object getPreviousLink() {
        return previousLink;
    }

    @JsonProperty("previousLink")
    public void setPreviousLink(Object previousLink) {
        this.previousLink = previousLink;
    }

    @JsonProperty("resultsPerPage")
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    @JsonProperty("resultsPerPage")
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
