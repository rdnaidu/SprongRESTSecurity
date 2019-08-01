package com.search.dto.frontend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("link")
    private String link = null;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
