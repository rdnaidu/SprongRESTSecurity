package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Record {

    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("BrandedProductName")
    private String brandedProductName;
    @JsonProperty("isFocusArticle")
    private Boolean isFocusArticle;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("NettoPrice")
    private String nettoPrice;
    @JsonProperty("NettoOldPrice")
    private String nettoOldPrice;
    @JsonProperty("ModelPictureUrl")
    private String modelPictureUrl;
    @JsonProperty("MasterID")
    private String masterID;
    @JsonProperty("ArticleNumber")
    private String articleNumber;
    @JsonProperty("New")
    private Boolean isNew;
    @JsonProperty("Reduced")
    private Boolean reduced;
    @JsonProperty("FromPrice")
    private Boolean fromPrice;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandedProductName() {
        return brandedProductName;
    }

    public void setBrandedProductName(String brandedProductName) {
        this.brandedProductName = brandedProductName;
    }

    public Boolean getIsFocusArticle() {
        return isFocusArticle;
    }

    public void setIsFocusArticle(Boolean isFocusArticle) {
        this.isFocusArticle = isFocusArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(String nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public String getNettoOldPrice() {
        return nettoOldPrice;
    }

    public void setNettoOldPrice(String nettoOldPrice) {
        this.nettoOldPrice = nettoOldPrice;
    }

    public String getModelPictureUrl() {
        return modelPictureUrl;
    }

    public void setModelPictureUrl(String modelPictureUrl) {
        this.modelPictureUrl = modelPictureUrl;
    }

    public String getMasterID() {
        return masterID;
    }

    public void setMasterID(String masterID) {
        this.masterID = masterID;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getReduced() {
        return reduced;
    }

    public void setReduced(Boolean reduced) {
        this.reduced = reduced;
    }

    public Boolean getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(Boolean fromPrice) {
        this.fromPrice = fromPrice;
    }

}
