package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class SearchParams {

    @JsonProperty("query")
    @ApiModelProperty
    private String query;

    @JsonProperty("channel")
    @ApiModelProperty
    private String channel;

    public SearchParams() {}

    public SearchParams(String channel, String query) {
        this.channel = channel;
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
