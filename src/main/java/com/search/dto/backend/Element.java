
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "associatedFieldName",
    "clusterLevel",
    "name",
    "previewImageURL",
    "recordCount",
    "searchParams",
    "selected",
    "absoluteMaxValue",
    "absoluteMinValue",
    "selectedMaxValue",
    "selectedMinValue"
})
public class Element {

    @JsonProperty("associatedFieldName")
    private String associatedFieldName;
    @JsonProperty("clusterLevel")
    private Integer clusterLevel;
    @JsonProperty("name")
    private String name;
    @JsonProperty("previewImageURL")
    private Object previewImageURL;
    @JsonProperty("recordCount")
    private Integer recordCount;
    @JsonProperty("searchParams")
    private String searchParams;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("absoluteMaxValue")
    private Double absoluteMaxValue;
    @JsonProperty("absoluteMinValue")
    private Double absoluteMinValue;
    @JsonProperty("selectedMaxValue")
    private Double selectedMaxValue;
    @JsonProperty("selectedMinValue")
    private Double selectedMinValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("associatedFieldName")
    public String getAssociatedFieldName() {
        return associatedFieldName;
    }

    @JsonProperty("associatedFieldName")
    public void setAssociatedFieldName(String associatedFieldName) {
        this.associatedFieldName = associatedFieldName;
    }

    @JsonProperty("clusterLevel")
    public Integer getClusterLevel() {
        return clusterLevel;
    }

    @JsonProperty("clusterLevel")
    public void setClusterLevel(Integer clusterLevel) {
        this.clusterLevel = clusterLevel;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("previewImageURL")
    public Object getPreviewImageURL() {
        return previewImageURL;
    }

    @JsonProperty("previewImageURL")
    public void setPreviewImageURL(Object previewImageURL) {
        this.previewImageURL = previewImageURL;
    }

    @JsonProperty("recordCount")
    public Integer getRecordCount() {
        return recordCount;
    }

    @JsonProperty("recordCount")
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
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

    @JsonProperty("absoluteMaxValue")
    public Double getAbsoluteMaxValue() {
        return absoluteMaxValue;
    }

    @JsonProperty("absoluteMaxValue")
    public void setAbsoluteMaxValue(Double absoluteMaxValue) {
        this.absoluteMaxValue = absoluteMaxValue;
    }

    @JsonProperty("absoluteMinValue")
    public Double getAbsoluteMinValue() {
        return absoluteMinValue;
    }

    @JsonProperty("absoluteMinValue")
    public void setAbsoluteMinValue(Double absoluteMinValue) {
        this.absoluteMinValue = absoluteMinValue;
    }

    @JsonProperty("selectedMaxValue")
    public Double getSelectedMaxValue() {
        return selectedMaxValue;
    }

    @JsonProperty("selectedMaxValue")
    public void setSelectedMaxValue(Double selectedMaxValue) {
        this.selectedMaxValue = selectedMaxValue;
    }

    @JsonProperty("selectedMinValue")
    public Double getSelectedMinValue() {
        return selectedMinValue;
    }

    @JsonProperty("selectedMinValue")
    public void setSelectedMinValue(Double selectedMinValue) {
        this.selectedMinValue = selectedMinValue;
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
