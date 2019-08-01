package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Group {

    @JsonProperty("filterStyle")
    private String filterStyle;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("allElements")
    private List<GroupElement> allElements = null;

    public String getFilterStyle() {
        return filterStyle;
    }

    public void setFilterStyle(String filterStyle) {
        this.filterStyle = filterStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<GroupElement> getAllElements() {
        return allElements;
    }

    public void setAllElements(List<GroupElement> allElements) {
        this.allElements = allElements;
    }

    public void setSelectedElements(List<GroupElement> selectedElements) {
        if (allElements == null) {
            allElements = new ArrayList<>();
        }
        allElements.addAll(selectedElements);
    }

    public void setElements(List<GroupElement> elements) {
        if (allElements == null) {
            allElements = new ArrayList<>();
        }
        allElements.addAll(elements);
    }
}