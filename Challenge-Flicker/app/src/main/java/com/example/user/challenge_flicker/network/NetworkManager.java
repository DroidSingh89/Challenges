package com.example.user.challenge_flicker.network;

import com.example.user.challenge_flicker.model.FlickerResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 3/16/18.
 */

public class NetworkManager {

    String baseUrl;

    public NetworkManager(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    private Retrofit createClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public Call<FlickerResponse> getResponse(String query) {
        return  createClient()
                .create(NetworkService.class)
                .getImageList(query, "json", "1");
    }


}
