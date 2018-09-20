package com.example.user.symbiovolvochallenge.model.bean.consolidatedweather


import com.google.gson.annotations.SerializedName


class SourcesItem {

    @SerializedName("crawl_rate")
    var crawlRate: Int = 0

    @SerializedName("title")
    var title: String? = null

    @SerializedName("slug")
    var slug: String? = null

    @SerializedName("url")
    var url: String? = null

    override fun toString(): String {
        return "SourcesItem{" +
                "crawl_rate = '" + crawlRate + '\''.toString() +
                ",title = '" + title + '\''.toString() +
                ",slug = '" + slug + '\''.toString() +
                ",url = '" + url + '\''.toString() +
                "}"
    }
}