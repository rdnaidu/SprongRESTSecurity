
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "substring",
    "valueList"
})
public class Filter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("substring")
    private Boolean substring;
    @JsonProperty("valueList")
    private List<ValueList> valueList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("substring")
    public Boolean getSubstring() {
        return substring;
    }

    @JsonProperty("substring")
    public void setSubstring(Boolean substring) {
        this.substring = substring;
    }

    @JsonProperty("valueList")
    public List<ValueList> getValueList() {
        return valueList;
    }

    @JsonProperty("valueList")
    public void setValueList(List<ValueList> valueList) {
        this.valueList = valueList;
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
