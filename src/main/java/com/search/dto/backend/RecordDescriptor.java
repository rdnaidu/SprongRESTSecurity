
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "foundWords",
    "id",
    "keywords",
    "position",
    "record",
    "searchSimilarity",
    "simiMalusAdd"
})
public class RecordDescriptor {

    @JsonProperty("foundWords")
    private List<Object> foundWords = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("keywords")
    private List<Object> keywords = null;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("record")
    private Record record;
    @JsonProperty("searchSimilarity")
    private Double searchSimilarity;
    @JsonProperty("simiMalusAdd")
    private Integer simiMalusAdd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("foundWords")
    public List<Object> getFoundWords() {
        return foundWords;
    }

    @JsonProperty("foundWords")
    public void setFoundWords(List<Object> foundWords) {
        this.foundWords = foundWords;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("keywords")
    public List<Object> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("record")
    public Record getRecord() {
        return record;
    }

    @JsonProperty("record")
    public void setRecord(Record record) {
        this.record = record;
    }

    @JsonProperty("searchSimilarity")
    public Double getSearchSimilarity() {
        return searchSimilarity;
    }

    @JsonProperty("searchSimilarity")
    public void setSearchSimilarity(Double searchSimilarity) {
        this.searchSimilarity = searchSimilarity;
    }

    @JsonProperty("simiMalusAdd")
    public Integer getSimiMalusAdd() {
        return simiMalusAdd;
    }

    @JsonProperty("simiMalusAdd")
    public void setSimiMalusAdd(Integer simiMalusAdd) {
        this.simiMalusAdd = simiMalusAdd;
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
