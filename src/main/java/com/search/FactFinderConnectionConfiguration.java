package com.search;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FactFinderConnectionConfiguration {

    private final String username;
    private final String password;
    private final String prefix;
    private final String postfix;
    private String baseurl;

    public FactFinderConnectionConfiguration(
            @Value("${factfinder.search.endpoint.baseurl}") final String baseurl,
            @Value("${factfinder.search.endpoint.username}") final String username,
            @Value("${factfinder.search.endpoint.password}") final String password,
            @Value("${factfinder.search.prefix}") final String prefix,
            @Value("${factfinder.search.postfix}") final String postfix) {
        this.baseurl = baseurl;
        this.username = username;
        this.password = password;
        this.prefix = prefix;
        this.postfix = postfix;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getPostfix() {
        return postfix;
    }

}
