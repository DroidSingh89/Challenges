package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Images {

    @SerializedName("image")
    private List<ImageItem> image;

    public void setImage(List<ImageItem> image) {
        this.image = image;
    }

    public List<ImageItem> getImage() {
        return image;
    }

    @Override
    public String toString() {
        return
                "Images{" +
                        "image = '" + image + '\'' +
                        "}";
    }
}