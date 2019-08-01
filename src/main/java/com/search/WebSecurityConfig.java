package com.search;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private final boolean secureManagementEndpoint;

    public WebSecurityConfig(@Value("${management.endpoints.security.enabled}") String secureEndpoint) {
        this.secureManagementEndpoint = secureEndpoint == null || BooleanUtils.toBoolean(secureEndpoint);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        if (secureManagementEndpoint) {
            http
                    .authorizeRequests()
                    .antMatchers("/actuator/**").authenticated()
            ;
        }
        http
                .authorizeRequests()
                .antMatchers( "/category", "/search/", "topseller").permitAll()
                .and()
                .httpBasic()
        ;
    }
}