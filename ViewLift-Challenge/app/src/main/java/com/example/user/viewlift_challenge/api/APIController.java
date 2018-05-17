package com.example.user.viewlift_challenge.api;

import com.example.user.viewlift_challenge.model.Snagfilms;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 2/14/18.
 */

public class APIController {

    String BaseURL;

    public APIController(String baseURL) {
        BaseURL = baseURL;
    }

    public Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public Observable<Snagfilms> getFilms(String limit){
        APIService apiService = createRetrofit().create(APIService.class);
        return apiService.getFilms(limit);
    }

}
