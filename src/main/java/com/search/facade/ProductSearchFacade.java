package com.search.facade;

import com.search.builder.SearchBuilder;
import com.search.builder.SearchBuilderFactory;
import com.search.dto.backend.SearchResponse;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;
import java.util.function.Consumer;

import static com.google.common.io.BaseEncoding.base32;
import static com.search.Constants.*;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;


/**
 * This Facade handles search requests for products.
 */
@Component
public class ProductSearchFacade {

    private final Logger logger = LoggerFactory.getLogger(ProductSearchFacade.class);

    private final RestTemplate restTemplate;

    private final SearchBuilderFactory searchBuilderFactory;

    public ProductSearchFacade(RestTemplate restTemplate, SearchBuilderFactory searchBuilderFactory) {
        this.restTemplate = restTemplate;
        this.searchBuilderFactory = searchBuilderFactory;
    }
    public SearchResponse executeSearch(String query, Map<String, String> params) {
        SearchBuilder builder = searchBuilderFactory.getInstance();
        builder
                .withQuery(query)
                .withChannelId(params.get(PARAMETER_CHANNEL_ID))
                .withCustomerId(params.get(PARAMETER_CUSTOMER_ID))
                .withSid(params.get(PARAMETER_SESSION_ID))
                .withSort(removeSortPrefix(params.get(PARAMETER_SORT)))
                .withUseAsn(true);
        parseAndApplyInteger(PARAMETER_PAGE, params.get(PARAMETER_PAGE), builder::withPage);
        parseAndApplyInteger(PARAMETER_PRODUCTS_PER_PAGE, params.get(PARAMETER_PRODUCTS_PER_PAGE), builder::withProductsPerPage);

        if (BooleanUtils.toBoolean(params.get(PARAMETER_IDS_ONLY))) {
            builder.withIdsOnly();
        }

        params.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith(PARAMETER_PREFIX_FILTER))
                .forEach(entry -> builder.withFilter(entry.getKey().replaceFirst(PARAMETER_PREFIX_FILTER_REGEX, ""), entry.getValue()));

        URI uri = builder.buildURI();

        return restTemplate.exchange(uri, HttpMethod.GET, builder.buildHttpEntity(), SearchResponse.class).getBody();
    }

    public SearchResponse searchTopsellers(Map<String, String> params) {
        SearchBuilder builder = searchBuilderFactory.getInstance();
        builder
                .withQuery(WILDCARD)
                .withChannelId(params.get(PARAMETER_CHANNEL_ID))
                .withCustomerId(params.get(PARAMETER_CUSTOMER_ID))
                .withSid(params.get(PARAMETER_SESSION_ID))
                .withSort(removeSortPrefix(params.get(PARAMETER_SORT)))
                .withFilter(PARAMETER_TYPE, "product")
                .withFilter(PARAMETER_PREFIX_NETTO + params.get(PARAMETER_CUSTOMER_ID), ">20")
                .withUseAsn(false)
                .withUseCampaigns(false)
                .withPriceTypeNetto();
        parseAndApplyInteger(PARAMETER_PRODUCTS_PER_PAGE, params.get(PARAMETER_PRODUCTS_PER_PAGE), builder::withProductsPerPage);

        URI uri = builder.buildURI();

        SearchResponse result = restTemplate.exchange(uri, HttpMethod.GET, builder.buildHttpEntity(), SearchResponse.class).getBody();
        if (result != null) {
            cleanTopsellerResult(result);
        }
        return result;

    }

    public SearchResponse searchProductsInCategory(String mainCategory, String subCategory, Map<String, String> params) {
        SearchBuilder builder = searchBuilderFactory.getInstance();
        builder
                .withQuery(WILDCARD)
                .withChannelId(params.get(PARAMETER_CHANNEL_ID))
                .withCustomerId(params.get(PARAMETER_CUSTOMER_ID))
                .withSid(params.get(PARAMETER_SESSION_ID))
                .withSort(removeSortPrefix(params.get(PARAMETER_SORT)))
                .withFilter(CATEGORY_PATH_ROOT, decodeCategory(mainCategory))
                .withCatalog(Boolean.TRUE)
                .withUseAsn(true)
                .withUseCampaigns(true)
                .withPriceTypeNetto()
                .withNoArticleNumberSearch(false);
        parseAndApplyInteger(PARAMETER_PAGE, params.get(PARAMETER_PAGE), builder::withPage);
        parseAndApplyInteger(PARAMETER_PRODUCTS_PER_PAGE, params.get(PARAMETER_PRODUCTS_PER_PAGE), builder::withProductsPerPage);


        if (BooleanUtils.toBoolean(params.get(PARAMETER_IDS_ONLY))) {
            builder.withIdsOnly();
        }

        if (subCategory != null) {
            builder.withFilter(
                    CATEGORY_PATH_ROOT + "/" + encodeSlashes(decodeCategory(mainCategory)),
                    decodeCategory(subCategory));
        }
        params.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith(PARAMETER_PREFIX_FILTER))
                .forEach(entry -> builder.withFilter(entry.getKey().replaceFirst(PARAMETER_PREFIX_FILTER_REGEX, ""), entry.getValue()));

        URI uri = builder.buildURI();
        return restTemplate.exchange(uri, HttpMethod.GET, builder.buildHttpEntity(), SearchResponse.class).getBody();
    }

    private String removeSortPrefix(String parameter) {
        if (isNotEmpty(parameter)) {
            return parameter.replaceFirst(PARAMETER_PREFIX_SORT_REGEX, "");
        }
        return null;
    }

    private void cleanTopsellerResult(SearchResponse result) {
        result.getSearchResult().setFilters(null);
        result.getSearchResult().setSortsList(null);
        result.getSearchResult().setGroups(null);
    }

    private String decodeCategory(String category) {
        return StringUtils.newStringUtf8(base32().decode(category));
    }

    private String encodeSlashes(String input) {
        return input.replaceAll("/", "%2F");
    }

    private void parseAndApplyInteger(final String key, final String value, Consumer<Integer> consumer) {
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(value)) {
            try {
                consumer.accept(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                logger.warn("Illegal, non-empty value for parameter {} found that cannot be parsed: '{}' - ignoring it.", key, value);
            }
        }
    }
}