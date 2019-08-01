package com.search.builder;

import com.search.FactFinderConnectionConfiguration;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.search.Constants.*;

class SearchBuilderJsonApi implements SearchBuilder {

    private FactFinderConnectionConfiguration config;
    private UriComponentsBuilder uriComponentsBuilder;

    SearchBuilderJsonApi(final FactFinderConnectionConfiguration config) {
        this.config = config;

        uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(config.getBaseurl())
                .pathSegment("Search.ff")
                .queryParam(PARAMETER_FORMAT, "json")
                .queryParam("version", "6.8");
    }

    @Override
    public SearchBuilder withQuery(final String query) {
        uriComponentsBuilder.queryParam(PARAMETER_QUERY, query);
        return this;
    }

    @Override
    public SearchBuilder withChannelId(final String channelId) {
        if (StringUtils.isEmpty(channelId)) {
            throw new IllegalArgumentException("channelId may not be null or empty");
        }
        uriComponentsBuilder.queryParam(PARAMETER_CHANNEL, channelId);
        return this;
    }

    @Override
    public SearchBuilder withSid(final String sid) {
        if (StringUtils.isNotEmpty(sid)) {
            uriComponentsBuilder.queryParam(PARAMETER_SID, sid);
        }
        return this;
    }

    @Override
    public SearchBuilder withCustomerId(final String customerId) {
        if (StringUtils.isEmpty(customerId)) {
            throw new IllegalArgumentException("customerId may not be null or empty");
        }
        uriComponentsBuilder.queryParam(PARAMETER_CUSTOMER_ID, customerId);
        return this;
    }

    @Override
    public SearchBuilder withProductsPerPage(final int productsPerPage) {
        uriComponentsBuilder.queryParam(PARAMETER_PRODUCTS_PER_PAGE, productsPerPage);
        return this;
    }

    @Override
    public SearchBuilder withPage(final int page) {
        uriComponentsBuilder.queryParam(PARAMETER_PAGE, page);
        return this;
    }

    @Override
    public SearchBuilder withIdsOnly() {
        uriComponentsBuilder.queryParam(PARAMETER_IDS_ONLY, true);
        return this;
    }

    @Override
    public SearchBuilder withNoArticleNumberSearch(final boolean noArticleNumberSearch) {
        uriComponentsBuilder.queryParam(PARAMETER_NO_ARTICLE_NUMBER_SEARCH, noArticleNumberSearch);
        return this;
    }

    @Override
    public SearchBuilder withSort(final String sort) {
        if (StringUtils.isEmpty(sort)) {
            return this;
        }
        String[] split = sort.split("=");
        if (split.length != 2) {
            throw new IllegalArgumentException("sort has an illegal format");
        }
        uriComponentsBuilder.queryParam(PARAMETER_PREFIX_SORT + split[0], split[1]);
        return this;
    }

    @Override
    public SearchBuilder withFilter(final String name, final String value) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("filter name may not be null or empty");
        }
        if (StringUtils.isEmpty(value)) {
            throw new IllegalArgumentException("filter value may not be null or empty");
        }
        uriComponentsBuilder.queryParam(PARAMETER_PREFIX_FILTER + name, value);

        return this;
    }

    @Override
    public SearchBuilder withUseAsn(final boolean useAsn) {
        uriComponentsBuilder.queryParam(PARAMETER_USE_ASN, useAsn);
        return this;
    }

    @Override
    public SearchBuilder withUseCampaigns(final boolean useCampaigns) {
        uriComponentsBuilder.queryParam(PARAMETER_USE_CAMPAIGNS, useCampaigns);
        return this;
    }

    @Override
    public SearchBuilder withPriceTypeNetto() {
        uriComponentsBuilder.queryParam(PARAMETER_PRICE_TYPE, PRICETYPE_NETTO);
        return this;
    }

    @Override
    public SearchBuilder withCatalog(final boolean catalog) {
        uriComponentsBuilder.queryParam(PARAMETER_CATALOG, catalog);
        return this;
    }

    String getApiKey(final long timestamp) {
        return String.format("%s:%s:%s",
                config.getUsername(),
                md5(config.getPrefix() + timestamp + md5(config.getPassword()) + config.getPostfix()),
                timestamp);
    }

    private String md5(final String toMd5) {
        return DigestUtils.md5Hex(toMd5);
    }

    @Override
    public <T> HttpEntity<T> buildHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.AUTHORIZATION, getApiKey(System.currentTimeMillis()));
        return new HttpEntity<>(headers);
    }

    @Override
    public URI buildURI() {
        return uriComponentsBuilder.build().encode().toUri();
    }
}
