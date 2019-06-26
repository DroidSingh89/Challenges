package com.example.user.myapplication

import com.google.gson.JsonObject
import org.json.JSONObject




fun parse(response: String): Int? {

        val root: JSONObject = JSONObject(response)
        val query: JSONObject? = root.get("query") as JSONObject
        val searchinfo: JSONObject? = query?.get("searchinfo") as JSONObject
        val totalHits: Int? = searchinfo?.get("totalhits") as Int

        return totalHits
    }
