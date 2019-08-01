package com.search.builder;

import org.springframework.http.HttpEntity;

import java.net.URI;

public interface SearchBuilder {
    SearchBuilder withQuery(final String query);

    SearchBuilder withChannelId(final String channelId);

    SearchBuilder withSid(final String sid);

    SearchBuilder withCustomerId(final String customerId);

    SearchBuilder withProductsPerPage(final int productsPerPage);

    SearchBuilder withPage(final int page);

    SearchBuilder withIdsOnly();

    SearchBuilder withNoArticleNumberSearch(final boolean noArticleNumberSearch);

    SearchBuilder withSort(final String sort);

    SearchBuilder withFilter(final String name, final String value);

    SearchBuilder withUseAsn(final boolean useAsn);

    SearchBuilder withUseCampaigns(final boolean useCampaigns);

    SearchBuilder withPriceTypeNetto();

    SearchBuilder withCatalog(final boolean catalog);

    URI buildURI();

    <T> HttpEntity<T> buildHttpEntity();
}
