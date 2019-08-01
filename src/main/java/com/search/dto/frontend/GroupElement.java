package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GroupElement {

    @JsonProperty("name")
    private String name;
    @JsonProperty("recordCount")
    private Integer recordCount;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("code")
    private String code;
    @JsonProperty("absoluteMaxValue")
    private Integer absoluteMaxValue;
    @JsonProperty("absoluteMinValue")
    private Integer absoluteMinValue;
    @JsonProperty("selectedMaxValue")
    private Integer selectedMaxValue;
    @JsonProperty("selectedMinValue")
    private Integer selectedMinValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAbsoluteMaxValue() {
        return absoluteMaxValue;
    }

    public void setAbsoluteMaxValue(Integer absoluteMaxValue) {
        this.absoluteMaxValue = absoluteMaxValue;
    }

    public Integer getAbsoluteMinValue() {
        return absoluteMinValue;
    }

    public void setAbsoluteMinValue(Integer absoluteMinValue) {
        this.absoluteMinValue = absoluteMinValue;
    }

    public Integer getSelectedMaxValue() {
        return selectedMaxValue;
    }

    public void setSelectedMaxValue(Integer selectedMaxValue) {
        this.selectedMaxValue = selectedMaxValue;
    }

    public Integer getSelectedMinValue() {
        return selectedMinValue;
    }

    public void setSelectedMinValue(Integer selectedMinValue) {
        this.selectedMinValue = selectedMinValue;
    }

}