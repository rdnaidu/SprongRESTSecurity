
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "disableCache",
    "generateAdvisorTree",
    "idsOnly",
    "useAsn",
    "useAso",
    "useCampaigns",
    "useFoundWords",
    "useKeywords",
    "usePersonalization",
    "useSemanticEnhancer"
})
public class SearchControlParams {

    @JsonProperty("disableCache")
    private Boolean disableCache;
    @JsonProperty("generateAdvisorTree")
    private Boolean generateAdvisorTree;
    @JsonProperty("idsOnly")
    private Boolean idsOnly;
    @JsonProperty("useAsn")
    private Boolean useAsn;
    @JsonProperty("useAso")
    private Boolean useAso;
    @JsonProperty("useCampaigns")
    private Boolean useCampaigns;
    @JsonProperty("useFoundWords")
    private Boolean useFoundWords;
    @JsonProperty("useKeywords")
    private Boolean useKeywords;
    @JsonProperty("usePersonalization")
    private Boolean usePersonalization;
    @JsonProperty("useSemanticEnhancer")
    private Boolean useSemanticEnhancer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("disableCache")
    public Boolean getDisableCache() {
        return disableCache;
    }

    @JsonProperty("disableCache")
    public void setDisableCache(Boolean disableCache) {
        this.disableCache = disableCache;
    }

    @JsonProperty("generateAdvisorTree")
    public Boolean getGenerateAdvisorTree() {
        return generateAdvisorTree;
    }

    @JsonProperty("generateAdvisorTree")
    public void setGenerateAdvisorTree(Boolean generateAdvisorTree) {
        this.generateAdvisorTree = generateAdvisorTree;
    }

    @JsonProperty("idsOnly")
    public Boolean getIdsOnly() {
        return idsOnly;
    }

    @JsonProperty("idsOnly")
    public void setIdsOnly(Boolean idsOnly) {
        this.idsOnly = idsOnly;
    }

    @JsonProperty("useAsn")
    public Boolean getUseAsn() {
        return useAsn;
    }

    @JsonProperty("useAsn")
    public void setUseAsn(Boolean useAsn) {
        this.useAsn = useAsn;
    }

    @JsonProperty("useAso")
    public Boolean getUseAso() {
        return useAso;
    }

    @JsonProperty("useAso")
    public void setUseAso(Boolean useAso) {
        this.useAso = useAso;
    }

    @JsonProperty("useCampaigns")
    public Boolean getUseCampaigns() {
        return useCampaigns;
    }

    @JsonProperty("useCampaigns")
    public void setUseCampaigns(Boolean useCampaigns) {
        this.useCampaigns = useCampaigns;
    }

    @JsonProperty("useFoundWords")
    public Boolean getUseFoundWords() {
        return useFoundWords;
    }

    @JsonProperty("useFoundWords")
    public void setUseFoundWords(Boolean useFoundWords) {
        this.useFoundWords = useFoundWords;
    }

    @JsonProperty("useKeywords")
    public Boolean getUseKeywords() {
        return useKeywords;
    }

    @JsonProperty("useKeywords")
    public void setUseKeywords(Boolean useKeywords) {
        this.useKeywords = useKeywords;
    }

    @JsonProperty("usePersonalization")
    public Boolean getUsePersonalization() {
        return usePersonalization;
    }

    @JsonProperty("usePersonalization")
    public void setUsePersonalization(Boolean usePersonalization) {
        this.usePersonalization = usePersonalization;
    }

    @JsonProperty("useSemanticEnhancer")
    public Boolean getUseSemanticEnhancer() {
        return useSemanticEnhancer;
    }

    @JsonProperty("useSemanticEnhancer")
    public void setUseSemanticEnhancer(Boolean useSemanticEnhancer) {
        this.useSemanticEnhancer = useSemanticEnhancer;
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
