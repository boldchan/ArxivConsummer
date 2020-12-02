package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArxivArticle {
    private String id;
    private String updated;
    private String published;
    private String title;
    private String summary;

    @JacksonXmlProperty(isAttribute = true, localName = "author")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ArxivAuthor> authors;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdated() {
        return updated;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublished() {
        return published;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setAuthors(List<ArxivAuthor> authors) {
        this.authors = authors;
    }

    public List<ArxivAuthor> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "ArxivArticle{" +
                "id='" + id + '\'' +
                ", updated='" + updated + '\'' +
                ", published='" + published + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", authors=" + authors +
                '}';
    }
}
