package com.example.user.challenge_viewlift.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

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