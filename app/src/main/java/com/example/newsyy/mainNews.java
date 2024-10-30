package com.example.newsyy;

import java.util.ArrayList;

public class mainNews {

    private String status;
    private String totalResult;
    private ArrayList<modelClass> articles;

    public mainNews(String status, String totalResult, ArrayList<modelClass> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<modelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<modelClass> articles) {
        this.articles = articles;
    }
}
