package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class ArticleId {

    @JsonProperty("id")
    @ApiModelProperty
    String id;

    public ArticleId() { }

    public ArticleId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
