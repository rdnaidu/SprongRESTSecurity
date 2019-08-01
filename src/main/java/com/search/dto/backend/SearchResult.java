
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "breadCrumbTrailItems",
    "campaigns",
    "channel",
    "fieldRoles",
    "filters",
    "groups",
    "paging",
    "records",
    "resultArticleNumberStatus",
    "resultCount",
    "resultStatus",
    "resultsPerPageList",
    "searchControlParams",
    "searchParams",
    "searchTime",
    "simiFirstRecord",
    "simiLastRecord",
    "singleWordResults",
    "sortsList",
    "timedOut"
})
public class SearchResult {

    @JsonProperty("breadCrumbTrailItems")
    private List<BreadCrumbTrailItem> breadCrumbTrailItems = null;
    @JsonProperty("campaigns")
    private List<Object> campaigns = null;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("fieldRoles")
    private FieldRoles fieldRoles;
    @JsonProperty("filters")
    private List<Filter> filters = null;
    @JsonProperty("groups")
    private List<Group> groups = null;
    @JsonProperty("paging")
    private Paging paging;
    @JsonProperty("records")
    private List<RecordDescriptor> records = null;
    @JsonProperty("resultArticleNumberStatus")
    private String resultArticleNumberStatus;
    @JsonProperty("resultCount")
    private Integer resultCount;
    @JsonProperty("resultStatus")
    private String resultStatus;
    @JsonProperty("resultsPerPageList")
    private List<ResultsPerPageList> resultsPerPageList = null;
    @JsonProperty("searchControlParams")
    private SearchControlParams searchControlParams;
    @JsonProperty("searchParams")
    private String searchParams;
    @JsonProperty("searchTime")
    private Integer searchTime;
    @JsonProperty("simiFirstRecord")
    private Integer simiFirstRecord;
    @JsonProperty("simiLastRecord")
    private Integer simiLastRecord;
    @JsonProperty("singleWordResults")
    private Object singleWordResults;
    @JsonProperty("sortsList")
    private List<SortsList> sortsList = null;
    @JsonProperty("timedOut")
    private Boolean timedOut;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("breadCrumbTrailItems")
    public List<BreadCrumbTrailItem> getBreadCrumbTrailItems() {
        return breadCrumbTrailItems;
    }

    @JsonProperty("breadCrumbTrailItems")
    public void setBreadCrumbTrailItems(List<BreadCrumbTrailItem> breadCrumbTrailItems) {
        this.breadCrumbTrailItems = breadCrumbTrailItems;
    }

    @JsonProperty("campaigns")
    public List<Object> getCampaigns() {
        return campaigns;
    }

    @JsonProperty("campaigns")
    public void setCampaigns(List<Object> campaigns) {
        this.campaigns = campaigns;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("fieldRoles")
    public FieldRoles getFieldRoles() {
        return fieldRoles;
    }

    @JsonProperty("fieldRoles")
    public void setFieldRoles(FieldRoles fieldRoles) {
        this.fieldRoles = fieldRoles;
    }

    @JsonProperty("filters")
    public List<Filter> getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @JsonProperty("records")
    public List<RecordDescriptor> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<RecordDescriptor> records) {
        this.records = records;
    }

    @JsonProperty("resultArticleNumberStatus")
    public String getResultArticleNumberStatus() {
        return resultArticleNumberStatus;
    }

    @JsonProperty("resultArticleNumberStatus")
    public void setResultArticleNumberStatus(String resultArticleNumberStatus) {
        this.resultArticleNumberStatus = resultArticleNumberStatus;
    }

    @JsonProperty("resultCount")
    public Integer getResultCount() {
        return resultCount;
    }

    @JsonProperty("resultCount")
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    @JsonProperty("resultStatus")
    public String getResultStatus() {
        return resultStatus;
    }

    @JsonProperty("resultStatus")
    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    @JsonProperty("resultsPerPageList")
    public List<ResultsPerPageList> getResultsPerPageList() {
        return resultsPerPageList;
    }

    @JsonProperty("resultsPerPageList")
    public void setResultsPerPageList(List<ResultsPerPageList> resultsPerPageList) {
        this.resultsPerPageList = resultsPerPageList;
    }

    @JsonProperty("searchControlParams")
    public SearchControlParams getSearchControlParams() {
        return searchControlParams;
    }

    @JsonProperty("searchControlParams")
    public void setSearchControlParams(SearchControlParams searchControlParams) {
        this.searchControlParams = searchControlParams;
    }

    @JsonProperty("searchParams")
    public String getSearchParams() {
        return searchParams;
    }

    @JsonProperty("searchParams")
    public void setSearchParams(String searchParams) {
        this.searchParams = searchParams;
    }

    @JsonProperty("searchTime")
    public Integer getSearchTime() {
        return searchTime;
    }

    @JsonProperty("searchTime")
    public void setSearchTime(Integer searchTime) {
        this.searchTime = searchTime;
    }

    @JsonProperty("simiFirstRecord")
    public Integer getSimiFirstRecord() {
        return simiFirstRecord;
    }

    @JsonProperty("simiFirstRecord")
    public void setSimiFirstRecord(Integer simiFirstRecord) {
        this.simiFirstRecord = simiFirstRecord;
    }

    @JsonProperty("simiLastRecord")
    public Integer getSimiLastRecord() {
        return simiLastRecord;
    }

    @JsonProperty("simiLastRecord")
    public void setSimiLastRecord(Integer simiLastRecord) {
        this.simiLastRecord = simiLastRecord;
    }

    @JsonProperty("singleWordResults")
    public Object getSingleWordResults() {
        return singleWordResults;
    }

    @JsonProperty("singleWordResults")
    public void setSingleWordResults(Object singleWordResults) {
        this.singleWordResults = singleWordResults;
    }

    @JsonProperty("sortsList")
    public List<SortsList> getSortsList() {
        return sortsList;
    }

    @JsonProperty("sortsList")
    public void setSortsList(List<SortsList> sortsList) {
        this.sortsList = sortsList;
    }

    @JsonProperty("timedOut")
    public Boolean getTimedOut() {
        return timedOut;
    }

    @JsonProperty("timedOut")
    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
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
