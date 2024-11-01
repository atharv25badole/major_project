package com.example.newsyy;

import android.graphics.Bitmap;

public class ProModelClass {

    private String name,email;
    private Bitmap image;

    public ProModelClass(String email, Bitmap image, String name) {
        this.email = email;
        this.image = image;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
