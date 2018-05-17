package com.example.user.uberflickerchallenge.data.remote;

import com.example.user.uberflickerchallenge.model.Images;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by user on 10/11/17.
 */

public interface RemoteService {


    public static final String QUERY_PARAM_METHOD = "method";
    public static final String QUERY_PARAM_KEY = "api_key";
    public static final String QUERY_PARAM_FORMAT = "format";
    public static final String QUERY_PARAM_NOCALLBACK = "nojsoncallback";
    public static final String QUERY_PARAM_TEXT = "text";

    @GET("services/rest")
    Observable<Images> getImages(@Query("method") String method,
                                 @Query("api_key") String key,
                                 @Query("format") String format,
                                 @Query("nojsoncallback") String callback,
                                 @Query("text") String text
    );

    @GET()
    Observable<Images> getImagesSimple();

}
