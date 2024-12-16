package com.example.newsyy;

import java.util.ArrayList;

public class MainNewsContent {

private String status;
private String totalResults;
private ArrayList<Model> articles;

    public MainNewsContent(ArrayList<Model> articles, String status, String totalResults) {
        this.articles = articles;
        this.status = status;
        this.totalResults = totalResults;
    }

    public ArrayList<Model> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Model> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }
}
