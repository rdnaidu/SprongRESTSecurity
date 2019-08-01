package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "SearchResult")
public class SearchResult {

    @JsonProperty("groups")
    @ApiModelProperty(notes = "List of groups")
    private List<Group> groups = null;
    @JsonProperty("records")
    @ApiModelProperty
    private List<Record> records = null;
    @JsonProperty("resultCount")
    @ApiModelProperty
    private Integer resultCount;
    @JsonProperty("sortsList")
    @ApiModelProperty
    private List<SortsList> sortsList = null;
    @JsonProperty("filters")
    @ApiModelProperty
    private Map<String, List<String>> filters = null;
    @JsonProperty("brands")
    @ApiModelProperty
    private List<Brand> brands = null;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<SortsList> getSortsList() {
        return sortsList;
    }

    public void setSortsList(List<SortsList> sortsList) {
        this.sortsList = sortsList;
    }

    public Map<String, List<String>> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, List<String>> filters) {
        this.filters = filters;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}