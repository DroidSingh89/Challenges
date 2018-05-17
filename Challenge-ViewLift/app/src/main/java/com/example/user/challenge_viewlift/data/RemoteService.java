package com.example.user.challenge_viewlift.data;

import com.example.user.challenge_viewlift.model.Snagfilms;

import io.reactivex.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by user on 2/5/18.
 */

public interface RemoteService {

    @GET("apis/films.json")
    Observable<Snagfilms> getFilms(@Query("limit") String limit);

}
