package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArxivAuthor {
    private String name;

    @JacksonXmlProperty(isAttribute = true, namespace = "http://arxiv.org/schemas/atom", localName = "affiliation")
    private String arxivAffiliation;

    public String getArxivAffiliation() {
        return arxivAffiliation;
    }

    public String getName() {
        return name;
    }

    public void setArxivAffiliation(String arxivAffiliation) {
        this.arxivAffiliation = arxivAffiliation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArxivAuthor{" +
                "name='" + name + '\'' +
                ", arxivAffiliation='" + arxivAffiliation + '\'' +
                '}';
    }
}
