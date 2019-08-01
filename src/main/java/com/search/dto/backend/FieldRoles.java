
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "campaignProductNumber",
    "deeplink",
    "description",
    "displayProductNumber",
    "imageUrl",
    "masterArticleNumber",
    "productName",
    "trackingProductNumber"
})
public class FieldRoles {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("campaignProductNumber")
    private String campaignProductNumber;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("description")
    private String description;
    @JsonProperty("displayProductNumber")
    private String displayProductNumber;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("masterArticleNumber")
    private String masterArticleNumber;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("trackingProductNumber")
    private String trackingProductNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("campaignProductNumber")
    public String getCampaignProductNumber() {
        return campaignProductNumber;
    }

    @JsonProperty("campaignProductNumber")
    public void setCampaignProductNumber(String campaignProductNumber) {
        this.campaignProductNumber = campaignProductNumber;
    }

    @JsonProperty("deeplink")
    public String getDeeplink() {
        return deeplink;
    }

    @JsonProperty("deeplink")
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("displayProductNumber")
    public String getDisplayProductNumber() {
        return displayProductNumber;
    }

    @JsonProperty("displayProductNumber")
    public void setDisplayProductNumber(String displayProductNumber) {
        this.displayProductNumber = displayProductNumber;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("masterArticleNumber")
    public String getMasterArticleNumber() {
        return masterArticleNumber;
    }

    @JsonProperty("masterArticleNumber")
    public void setMasterArticleNumber(String masterArticleNumber) {
        this.masterArticleNumber = masterArticleNumber;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("trackingProductNumber")
    public String getTrackingProductNumber() {
        return trackingProductNumber;
    }

    @JsonProperty("trackingProductNumber")
    public void setTrackingProductNumber(String trackingProductNumber) {
        this.trackingProductNumber = trackingProductNumber;
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
