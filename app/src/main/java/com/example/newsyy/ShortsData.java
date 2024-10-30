//package com.example.newsyy;
//
//public class ShortsData {
//
//    private String shortsPath,shortsUser,shortsTitle;
//    private int shortsImage;
//
//    public String getShortsPath() {
//        return shortsPath;
//    }
//
//    public String getShortsUser() {
//        return shortsUser;
//    }
//
//    public String getShortsTitle() {
//        return shortsTitle;
//    }
//
//    public int getShortsImage() {
//        return shortsImage;
//    }
//
//    public ShortsData(String shortsPath, String shortsUser, String shortsTitle, int shortsImage) {
//        this.shortsPath = shortsPath;
//        this.shortsUser = shortsUser;
//        this.shortsTitle = shortsTitle;
//        this.shortsImage = shortsImage;
//    }
//}


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
