package com.search.builder;

import com.search.FactFinderConnectionConfiguration;
import org.springframework.stereotype.Component;

@Component
public class SearchBuilderFactory {
    private final FactFinderConnectionConfiguration config;

    public SearchBuilderFactory(FactFinderConnectionConfiguration config) {
        this.config = config;
    }

    public SearchBuilder getInstance() {
        return new SearchBuilderJsonApi(config);
    }
}
