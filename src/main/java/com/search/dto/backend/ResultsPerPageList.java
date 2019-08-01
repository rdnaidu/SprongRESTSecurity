
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "default",
    "searchParams",
    "selected",
    "value"
})
public class ResultsPerPageList {

    @JsonProperty("default")
    private Boolean defaultValue;
    @JsonProperty("searchParams")
    private String searchParams;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("value")
    private Integer value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("default")
    public Boolean getDefault() {
        return defaultValue;
    }

    @JsonProperty("default")
    public void setDefault(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonProperty("searchParams")
    public String getSearchParams() {
        return searchParams;
    }

    @JsonProperty("searchParams")
    public void setSearchParams(String searchParams) {
        this.searchParams = searchParams;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
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
