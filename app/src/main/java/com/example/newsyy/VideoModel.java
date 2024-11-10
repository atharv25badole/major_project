package com.example.newsyy;

public class VideoModel {
    private String title;
    private String path;

    public VideoModel(String title, String path) {
        this.title = title;
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }
}
