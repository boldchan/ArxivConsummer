package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "feed")
public class ArxivFeed {
    private String id;

    @JsonProperty("entry")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ArxivArticle> articles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ArxivArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<ArxivArticle> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ArxivFeed{" +
                "id='" + id + '\'' +
                ", articles=" + articles +
                '}';
    }
}
