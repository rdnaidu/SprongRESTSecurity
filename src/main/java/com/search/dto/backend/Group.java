
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "detailedLinks",
    "elements",
    "filterStyle",
    "groupOrder",
    "name",
    "selectedElements",
    "selectionType",
    "showPreviewImages",
    "type",
    "unit"
})
public class Group {

    @JsonProperty("detailedLinks")
    private Integer detailedLinks;
    @JsonProperty("elements")
    private List<Element> elements = null;
    @JsonProperty("filterStyle")
    private String filterStyle;
    @JsonProperty("groupOrder")
    private Integer groupOrder;
    @JsonProperty("name")
    private String name;
    @JsonProperty("selectedElements")
    private List<SelectedElement> selectedElements = null;
    @JsonProperty("selectionType")
    private String selectionType;
    @JsonProperty("showPreviewImages")
    private Boolean showPreviewImages;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("detailedLinks")
    public Integer getDetailedLinks() {
        return detailedLinks;
    }

    @JsonProperty("detailedLinks")
    public void setDetailedLinks(Integer detailedLinks) {
        this.detailedLinks = detailedLinks;
    }

    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @JsonProperty("filterStyle")
    public String getFilterStyle() {
        return filterStyle;
    }

    @JsonProperty("filterStyle")
    public void setFilterStyle(String filterStyle) {
        this.filterStyle = filterStyle;
    }

    @JsonProperty("groupOrder")
    public Integer getGroupOrder() {
        return groupOrder;
    }

    @JsonProperty("groupOrder")
    public void setGroupOrder(Integer groupOrder) {
        this.groupOrder = groupOrder;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("selectedElements")
    public List<SelectedElement> getSelectedElements() {
        return selectedElements;
    }

    @JsonProperty("selectedElements")
    public void setSelectedElements(List<SelectedElement> selectedElements) {
        this.selectedElements = selectedElements;
    }

    @JsonProperty("selectionType")
    public String getSelectionType() {
        return selectionType;
    }

    @JsonProperty("selectionType")
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    @JsonProperty("showPreviewImages")
    public Boolean getShowPreviewImages() {
        return showPreviewImages;
    }

    @JsonProperty("showPreviewImages")
    public void setShowPreviewImages(Boolean showPreviewImages) {
        this.showPreviewImages = showPreviewImages;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
