package com.example.user.viewlift_challenge.api;

import com.example.user.viewlift_challenge.model.Snagfilms;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by user on 2/14/18.
 */

public interface APIService {

    @GET("apis/films.json")
    Observable<Snagfilms> getFilms(@Query("limit") String limit);
}
