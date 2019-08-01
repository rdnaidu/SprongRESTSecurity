package com.search.mapping;

import com.search.dto.backend.Element;
import com.search.dto.backend.SearchResponse;
import com.search.dto.backend.SelectedElement;
import com.search.dto.frontend.Record;
import com.search.dto.frontend.SearchResult;
import com.search.dto.frontend.SearchResultArticle;
import com.search.dto.frontend.SortsList;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MapperFacadeFactory extends AbstractFactoryBean<MapperFacade> {

    private static final String PRICE_CONVERTER = "priceConverter";
    private static final String MODEL_PICTURE_URL_CONVERTER = "modelPictureUrlConverter";
    private static final String SORT_ITEM_DESCRIPTION_CONVERTER = "sortItemDescriptionConverter";

    @Override
    public Class<?> getObjectType() {
        return MapperFacade.class;
    }

    @Override
    protected MapperFacade createInstance() {
        DefaultMapperFactory factory = new DefaultMapperFactory.Builder().build();

        factory.getConverterFactory()
                .registerConverter(SORT_ITEM_DESCRIPTION_CONVERTER, new SortItemDescriptionConverter());

        factory.getConverterFactory()
                .registerConverter(MODEL_PICTURE_URL_CONVERTER, new ModelPictureUrlConverter());

        factory.getConverterFactory()
                .registerConverter(PRICE_CONVERTER, new PriceConverter());

        Mapper<SearchResponse, SearchResultArticle> searchResultArticleMapper = new SearchResultArticleCustomMapper();
        Mapper<com.search.dto.backend.SearchResult, SearchResult> searchResultMapper = new SearchResultCustomMapper();

        factory.classMap(SearchResponse.class, SearchResultArticle.class)
                .byDefault()
                .customize(searchResultArticleMapper)
                .register();

        factory.classMap(com.search.dto.backend.SearchResult.class, SearchResult.class)
                .byDefault()
                .customize(searchResultMapper)
                .register();

        factory.classMap(Element.class, com.search.dto.frontend.GroupElement.class)
                .field("associatedFieldName", "code")
                .exclude("searchParams")
                .exclude("clusterLevel")
                .exclude("previewImageURL")
                .byDefault()
                .register();

        factory.classMap(SelectedElement.class, com.search.dto.frontend.GroupElement.class)
                .field("associatedFieldName", "code")
                .exclude("searchParams")
                .exclude("clusterLevel")
                .exclude("previewImageURL")
                .byDefault()
                .register();

        factory.classMap(com.search.dto.backend.RecordDescriptor.class, Record.class)
                .field("record.articleNumber", "articleNumber")
                .field("record.brandedProductName", "brandedProductName")
                .field("record.brand", "brand")
                .field("record.name", "name")
                .field("record.fromPrice", "fromPrice")
                .field("record.isFocusArticle", "isFocusArticle")
                .field("record.masterID", "masterID")
                .fieldMap("record.modelPictureUrl", "modelPictureUrl")
                .converter(MODEL_PICTURE_URL_CONVERTER).add()
                .fieldMap("record.nettoOldPrice", "nettoOldPrice")
                .converter(PRICE_CONVERTER).add()
                .fieldMap("record.nettoPrice", "nettoPrice")
                .converter(PRICE_CONVERTER).add()
                .field("record.new", "isNew")
                .field("record.reduced", "reduced")
                .field("record.title", "title")
                .register();

        factory.classMap(com.search.dto.backend.SortsList.class, SortsList.class)
                .fieldMap("description", "description")
                .converter(SORT_ITEM_DESCRIPTION_CONVERTER).add()
                .field("name", "name")
                .field("order", "order").register();

        return factory.getMapperFacade();
    }


}
