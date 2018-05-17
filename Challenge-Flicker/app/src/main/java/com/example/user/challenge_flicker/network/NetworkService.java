package com.example.user.challenge_flicker.network;

import com.example.user.challenge_flicker.model.FlickerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by user on 3/16/18.
 */

public interface NetworkService {


    //GET for flicker path
    @GET("services/feeds/photos_public.gne")
    Call<FlickerResponse> getImageList(@Query("tag") String tag, @Query("format") String format, @Query("nojsoncallback") String noJsonCallback);
}
