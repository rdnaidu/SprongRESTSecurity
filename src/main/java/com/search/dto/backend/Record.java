
package com.search.dto.backend;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllAvailableColors",
    "ArticleNumber",
    "AvgRating",
    "BasePriceBaseValue",
    "BasePriceTotalValue",
    "BasePriceUnit",
    "Brand",
    "BrandedProductName",
    "BruttoOldPrice",
    "BruttoPrice",
    "Categories",
    "CategoryPath",
    "CategoryPath_lvl0",
    "CategoryPath_lvl1",
    "CategoryPath_lvl2",
    "CategoryPath_lvl3",
    "ClassificationData",
    "ClassificationData_values",
    "ContentPages",
    "DQAttributes",
    "DeliveryTime",
    "Description",
    "ExcludedCustomerList",
    "FFAfterSearchReorder",
    "FFAutomaticSearchOptimization",
    "FFCheckoutCount",
    "FFCliplisterQuality",
    "FoundArticleIds",
    "FromPrice",
    "GTIN",
    "GaeArticleNumber",
    "Keywords",
    "MasterID",
    "ModelPictureUrl",
    "Name",
    "NettoOldPrice",
    "NettoPrice",
    "New",
    "NoAsnClassificationData",
    "NumberOfReviews",
    "OrderAmountInfo",
    "PictureUrl",
    "PreviewText",
    "PrintCatalogPage",
    "ProducerNumber",
    "ProductBenefits",
    "Reduced",
    "ReferencePages",
    "Services",
    "StockLevel",
    "Text",
    "Title",
    "Type",
    "Url",
    "__ORIG_POSITION__",
    "ecotax",
    "isFocusArticle",
    "isWebOnly",
    "pictogram"
})
public class Record {

    @JsonProperty("AllAvailableColors")
    private String allAvailableColors;
    @JsonProperty("ArticleNumber")
    private String articleNumber;
    @JsonProperty("AvgRating")
    private String avgRating;
    @JsonProperty("BasePriceBaseValue")
    private String basePriceBaseValue;
    @JsonProperty("BasePriceTotalValue")
    private String basePriceTotalValue;
    @JsonProperty("BasePriceUnit")
    private String basePriceUnit;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("BrandedProductName")
    private String brandedProductName;
    @JsonProperty("BruttoOldPrice")
    private String bruttoOldPrice;
    @JsonProperty("BruttoPrice")
    private String bruttoPrice;
    @JsonProperty("Categories")
    private String categories;
    @JsonProperty("CategoryPath")
    private String categoryPath;
    @JsonProperty("CategoryPath_lvl0")
    private String categoryPathLvl0;
    @JsonProperty("CategoryPath_lvl1")
    private String categoryPathLvl1;
    @JsonProperty("CategoryPath_lvl2")
    private String categoryPathLvl2;
    @JsonProperty("CategoryPath_lvl3")
    private String categoryPathLvl3;
    @JsonProperty("ClassificationData")
    private String classificationData;
    @JsonProperty("ClassificationData_values")
    private String classificationDataValues;
    @JsonProperty("ContentPages")
    private String contentPages;
    @JsonProperty("DQAttributes")
    private String dQAttributes;
    @JsonProperty("DeliveryTime")
    private String deliveryTime;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ExcludedCustomerList")
    private String excludedCustomerList;
    @JsonProperty("FFAfterSearchReorder")
    private String fFAfterSearchReorder;
    @JsonProperty("FFAutomaticSearchOptimization")
    private String fFAutomaticSearchOptimization;
    @JsonProperty("FFCheckoutCount")
    private String fFCheckoutCount;
    @JsonProperty("FFCliplisterQuality")
    private String fFCliplisterQuality;
    @JsonProperty("FoundArticleIds")
    private String foundArticleIds;
    @JsonProperty("FromPrice")
    private String fromPrice;
    @JsonProperty("GTIN")
    private String gTIN;
    @JsonProperty("GaeArticleNumber")
    private String gaeArticleNumber;
    @JsonProperty("Keywords")
    private String keywords;
    @JsonProperty("MasterID")
    private String masterID;
    @JsonProperty("ModelPictureUrl")
    private String modelPictureUrl;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("NettoOldPrice")
    private String nettoOldPrice;
    @JsonProperty("NettoPrice")
    private String nettoPrice;
    @JsonProperty("New")
    private String newValue;
    @JsonProperty("NoAsnClassificationData")
    private String noAsnClassificationData;
    @JsonProperty("NumberOfReviews")
    private String numberOfReviews;
    @JsonProperty("OrderAmountInfo")
    private String orderAmountInfo;
    @JsonProperty("PictureUrl")
    private String pictureUrl;
    @JsonProperty("PreviewText")
    private String previewText;
    @JsonProperty("PrintCatalogPage")
    private String printCatalogPage;
    @JsonProperty("ProducerNumber")
    private String producerNumber;
    @JsonProperty("ProductBenefits")
    private String productBenefits;
    @JsonProperty("Reduced")
    private String reduced;
    @JsonProperty("ReferencePages")
    private String referencePages;
    @JsonProperty("Services")
    private String services;
    @JsonProperty("StockLevel")
    private String stockLevel;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("__ORIG_POSITION__")
    private String oRIGPOSITION;
    @JsonProperty("ecotax")
    private String ecotax;
    @JsonProperty("isFocusArticle")
    private String isFocusArticle;
    @JsonProperty("isWebOnly")
    private String isWebOnly;
    @JsonProperty("pictogram")
    private String pictogram;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("AllAvailableColors")
    public String getAllAvailableColors() {
        return allAvailableColors;
    }

    @JsonProperty("AllAvailableColors")
    public void setAllAvailableColors(String allAvailableColors) {
        this.allAvailableColors = allAvailableColors;
    }

    @JsonProperty("ArticleNumber")
    public String getArticleNumber() {
        return articleNumber;
    }

    @JsonProperty("ArticleNumber")
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    @JsonProperty("AvgRating")
    public String getAvgRating() {
        return avgRating;
    }

    @JsonProperty("AvgRating")
    public void setAvgRating(String avgRating) {
        this.avgRating = avgRating;
    }

    @JsonProperty("BasePriceBaseValue")
    public String getBasePriceBaseValue() {
        return basePriceBaseValue;
    }

    @JsonProperty("BasePriceBaseValue")
    public void setBasePriceBaseValue(String basePriceBaseValue) {
        this.basePriceBaseValue = basePriceBaseValue;
    }

    @JsonProperty("BasePriceTotalValue")
    public String getBasePriceTotalValue() {
        return basePriceTotalValue;
    }

    @JsonProperty("BasePriceTotalValue")
    public void setBasePriceTotalValue(String basePriceTotalValue) {
        this.basePriceTotalValue = basePriceTotalValue;
    }

    @JsonProperty("BasePriceUnit")
    public String getBasePriceUnit() {
        return basePriceUnit;
    }

    @JsonProperty("BasePriceUnit")
    public void setBasePriceUnit(String basePriceUnit) {
        this.basePriceUnit = basePriceUnit;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("BrandedProductName")
    public String getBrandedProductName() {
        return brandedProductName;
    }

    @JsonProperty("BrandedProductName")
    public void setBrandedProductName(String brandedProductName) {
        this.brandedProductName = brandedProductName;
    }

    @JsonProperty("BruttoOldPrice")
    public String getBruttoOldPrice() {
        return bruttoOldPrice;
    }

    @JsonProperty("BruttoOldPrice")
    public void setBruttoOldPrice(String bruttoOldPrice) {
        this.bruttoOldPrice = bruttoOldPrice;
    }

    @JsonProperty("BruttoPrice")
    public String getBruttoPrice() {
        return bruttoPrice;
    }

    @JsonProperty("BruttoPrice")
    public void setBruttoPrice(String bruttoPrice) {
        this.bruttoPrice = bruttoPrice;
    }

    @JsonProperty("Categories")
    public String getCategories() {
        return categories;
    }

    @JsonProperty("Categories")
    public void setCategories(String categories) {
        this.categories = categories;
    }

    @JsonProperty("CategoryPath")
    public String getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("CategoryPath")
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("CategoryPath_lvl0")
    public String getCategoryPathLvl0() {
        return categoryPathLvl0;
    }

    @JsonProperty("CategoryPath_lvl0")
    public void setCategoryPathLvl0(String categoryPathLvl0) {
        this.categoryPathLvl0 = categoryPathLvl0;
    }

    @JsonProperty("CategoryPath_lvl1")
    public String getCategoryPathLvl1() {
        return categoryPathLvl1;
    }

    @JsonProperty("CategoryPath_lvl1")
    public void setCategoryPathLvl1(String categoryPathLvl1) {
        this.categoryPathLvl1 = categoryPathLvl1;
    }

    @JsonProperty("CategoryPath_lvl2")
    public String getCategoryPathLvl2() {
        return categoryPathLvl2;
    }

    @JsonProperty("CategoryPath_lvl2")
    public void setCategoryPathLvl2(String categoryPathLvl2) {
        this.categoryPathLvl2 = categoryPathLvl2;
    }

    @JsonProperty("CategoryPath_lvl3")
    public String getCategoryPathLvl3() {
        return categoryPathLvl3;
    }

    @JsonProperty("CategoryPath_lvl3")
    public void setCategoryPathLvl3(String categoryPathLvl3) {
        this.categoryPathLvl3 = categoryPathLvl3;
    }

    @JsonProperty("ClassificationData")
    public String getClassificationData() {
        return classificationData;
    }

    @JsonProperty("ClassificationData")
    public void setClassificationData(String classificationData) {
        this.classificationData = classificationData;
    }

    @JsonProperty("ClassificationData_values")
    public String getClassificationDataValues() {
        return classificationDataValues;
    }

    @JsonProperty("ClassificationData_values")
    public void setClassificationDataValues(String classificationDataValues) {
        this.classificationDataValues = classificationDataValues;
    }

    @JsonProperty("ContentPages")
    public String getContentPages() {
        return contentPages;
    }

    @JsonProperty("ContentPages")
    public void setContentPages(String contentPages) {
        this.contentPages = contentPages;
    }

    @JsonProperty("DQAttributes")
    public String getDQAttributes() {
        return dQAttributes;
    }

    @JsonProperty("DQAttributes")
    public void setDQAttributes(String dQAttributes) {
        this.dQAttributes = dQAttributes;
    }

    @JsonProperty("DeliveryTime")
    public String getDeliveryTime() {
        return deliveryTime;
    }

    @JsonProperty("DeliveryTime")
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ExcludedCustomerList")
    public String getExcludedCustomerList() {
        return excludedCustomerList;
    }

    @JsonProperty("ExcludedCustomerList")
    public void setExcludedCustomerList(String excludedCustomerList) {
        this.excludedCustomerList = excludedCustomerList;
    }

    @JsonProperty("FFAfterSearchReorder")
    public String getFFAfterSearchReorder() {
        return fFAfterSearchReorder;
    }

    @JsonProperty("FFAfterSearchReorder")
    public void setFFAfterSearchReorder(String fFAfterSearchReorder) {
        this.fFAfterSearchReorder = fFAfterSearchReorder;
    }

    @JsonProperty("FFAutomaticSearchOptimization")
    public String getFFAutomaticSearchOptimization() {
        return fFAutomaticSearchOptimization;
    }

    @JsonProperty("FFAutomaticSearchOptimization")
    public void setFFAutomaticSearchOptimization(String fFAutomaticSearchOptimization) {
        this.fFAutomaticSearchOptimization = fFAutomaticSearchOptimization;
    }

    @JsonProperty("FFCheckoutCount")
    public String getFFCheckoutCount() {
        return fFCheckoutCount;
    }

    @JsonProperty("FFCheckoutCount")
    public void setFFCheckoutCount(String fFCheckoutCount) {
        this.fFCheckoutCount = fFCheckoutCount;
    }

    @JsonProperty("FFCliplisterQuality")
    public String getFFCliplisterQuality() {
        return fFCliplisterQuality;
    }

    @JsonProperty("FFCliplisterQuality")
    public void setFFCliplisterQuality(String fFCliplisterQuality) {
        this.fFCliplisterQuality = fFCliplisterQuality;
    }

    @JsonProperty("FoundArticleIds")
    public String getFoundArticleIds() {
        return foundArticleIds;
    }

    @JsonProperty("FoundArticleIds")
    public void setFoundArticleIds(String foundArticleIds) {
        this.foundArticleIds = foundArticleIds;
    }

    @JsonProperty("FromPrice")
    public String getFromPrice() {
        return fromPrice;
    }

    @JsonProperty("FromPrice")
    public void setFromPrice(String fromPrice) {
        this.fromPrice = fromPrice;
    }

    @JsonProperty("GTIN")
    public String getGTIN() {
        return gTIN;
    }

    @JsonProperty("GTIN")
    public void setGTIN(String gTIN) {
        this.gTIN = gTIN;
    }

    @JsonProperty("GaeArticleNumber")
    public String getGaeArticleNumber() {
        return gaeArticleNumber;
    }

    @JsonProperty("GaeArticleNumber")
    public void setGaeArticleNumber(String gaeArticleNumber) {
        this.gaeArticleNumber = gaeArticleNumber;
    }

    @JsonProperty("Keywords")
    public String getKeywords() {
        return keywords;
    }

    @JsonProperty("Keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("MasterID")
    public String getMasterID() {
        return masterID;
    }

    @JsonProperty("MasterID")
    public void setMasterID(String masterID) {
        this.masterID = masterID;
    }

    @JsonProperty("ModelPictureUrl")
    public String getModelPictureUrl() {
        return modelPictureUrl;
    }

    @JsonProperty("ModelPictureUrl")
    public void setModelPictureUrl(String modelPictureUrl) {
        this.modelPictureUrl = modelPictureUrl;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("NettoOldPrice")
    public String getNettoOldPrice() {
        return nettoOldPrice;
    }

    @JsonProperty("NettoOldPrice")
    public void setNettoOldPrice(String nettoOldPrice) {
        this.nettoOldPrice = nettoOldPrice;
    }

    @JsonProperty("NettoPrice")
    public String getNettoPrice() {
        return nettoPrice;
    }

    @JsonProperty("NettoPrice")
    public void setNettoPrice(String nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    @JsonProperty("New")
    public String getNew() {
        return newValue;
    }

    @JsonProperty("New")
    public void setNew(String newValue) {
        this.newValue = newValue;
    }

    @JsonProperty("NoAsnClassificationData")
    public String getNoAsnClassificationData() {
        return noAsnClassificationData;
    }

    @JsonProperty("NoAsnClassificationData")
    public void setNoAsnClassificationData(String noAsnClassificationData) {
        this.noAsnClassificationData = noAsnClassificationData;
    }

    @JsonProperty("NumberOfReviews")
    public String getNumberOfReviews() {
        return numberOfReviews;
    }

    @JsonProperty("NumberOfReviews")
    public void setNumberOfReviews(String numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @JsonProperty("OrderAmountInfo")
    public String getOrderAmountInfo() {
        return orderAmountInfo;
    }

    @JsonProperty("OrderAmountInfo")
    public void setOrderAmountInfo(String orderAmountInfo) {
        this.orderAmountInfo = orderAmountInfo;
    }

    @JsonProperty("PictureUrl")
    public String getPictureUrl() {
        return pictureUrl;
    }

    @JsonProperty("PictureUrl")
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @JsonProperty("PreviewText")
    public String getPreviewText() {
        return previewText;
    }

    @JsonProperty("PreviewText")
    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    @JsonProperty("PrintCatalogPage")
    public String getPrintCatalogPage() {
        return printCatalogPage;
    }

    @JsonProperty("PrintCatalogPage")
    public void setPrintCatalogPage(String printCatalogPage) {
        this.printCatalogPage = printCatalogPage;
    }

    @JsonProperty("ProducerNumber")
    public String getProducerNumber() {
        return producerNumber;
    }

    @JsonProperty("ProducerNumber")
    public void setProducerNumber(String producerNumber) {
        this.producerNumber = producerNumber;
    }

    @JsonProperty("ProductBenefits")
    public String getProductBenefits() {
        return productBenefits;
    }

    @JsonProperty("ProductBenefits")
    public void setProductBenefits(String productBenefits) {
        this.productBenefits = productBenefits;
    }

    @JsonProperty("Reduced")
    public String getReduced() {
        return reduced;
    }

    @JsonProperty("Reduced")
    public void setReduced(String reduced) {
        this.reduced = reduced;
    }

    @JsonProperty("ReferencePages")
    public String getReferencePages() {
        return referencePages;
    }

    @JsonProperty("ReferencePages")
    public void setReferencePages(String referencePages) {
        this.referencePages = referencePages;
    }

    @JsonProperty("Services")
    public String getServices() {
        return services;
    }

    @JsonProperty("Services")
    public void setServices(String services) {
        this.services = services;
    }

    @JsonProperty("StockLevel")
    public String getStockLevel() {
        return stockLevel;
    }

    @JsonProperty("StockLevel")
    public void setStockLevel(String stockLevel) {
        this.stockLevel = stockLevel;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("Url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("__ORIG_POSITION__")
    public String getORIGPOSITION() {
        return oRIGPOSITION;
    }

    @JsonProperty("__ORIG_POSITION__")
    public void setORIGPOSITION(String oRIGPOSITION) {
        this.oRIGPOSITION = oRIGPOSITION;
    }

    @JsonProperty("ecotax")
    public String getEcotax() {
        return ecotax;
    }

    @JsonProperty("ecotax")
    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }

    @JsonProperty("isFocusArticle")
    public String getIsFocusArticle() {
        return isFocusArticle;
    }

    @JsonProperty("isFocusArticle")
    public void setIsFocusArticle(String isFocusArticle) {
        this.isFocusArticle = isFocusArticle;
    }

    @JsonProperty("isWebOnly")
    public String getIsWebOnly() {
        return isWebOnly;
    }

    @JsonProperty("isWebOnly")
    public void setIsWebOnly(String isWebOnly) {
        this.isWebOnly = isWebOnly;
    }

    @JsonProperty("pictogram")
    public String getPictogram() {
        return pictogram;
    }

    @JsonProperty("pictogram")
    public void setPictogram(String pictogram) {
        this.pictogram = pictogram;
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
