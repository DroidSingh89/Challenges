package com.example.user.challenge_viewlift.data;

import com.example.user.challenge_viewlift.model.Snagfilms;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 2/5/18.
 */

public class RemoteDataSource {

    public static final String BASE_URL = "http://www.snagfilms.com/";
    public static final String DEFAULT_LIMIT = "20";

    public static Retrofit create() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static Observable<Snagfilms> getResponse(String limit) {
        RemoteService remoteService = create().create(RemoteService.class);
        return remoteService.getFilms(limit);
    }
}