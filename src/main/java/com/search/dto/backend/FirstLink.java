
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caption",
    "currentPage",
    "number",
    "searchParams"
})
public class FirstLink {

    @JsonProperty("caption")
    private String caption;
    @JsonProperty("currentPage")
    private Boolean currentPage;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("searchParams")
    private String searchParams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @JsonProperty("currentPage")
    public Boolean getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("currentPage")
    public void setCurrentPage(Boolean currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("searchParams")
    public String getSearchParams() {
        return searchParams;
    }

    @JsonProperty("searchParams")
    public void setSearchParams(String searchParams) {
        this.searchParams = searchParams;
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
