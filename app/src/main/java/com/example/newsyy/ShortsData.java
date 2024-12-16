package com.example.newsyy;
public class ShortsData {

     String url,shortsSubtitle,shortsTitle;

    public ShortsData(String url, String shortsSubtitle, String shortsTitle) {
        this.url = url;
        this.shortsSubtitle = shortsSubtitle;
        this.shortsTitle = shortsTitle;
    }

    public String geturl() {
        return url;
    }

    public String getShortsSubtitle() {
        return shortsSubtitle;
    }

    public String getShortsTitle() {
        return shortsTitle;
    }
}
