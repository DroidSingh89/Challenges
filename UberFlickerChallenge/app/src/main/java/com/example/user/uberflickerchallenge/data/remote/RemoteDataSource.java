package com.example.user.uberflickerchallenge.data.remote;

import com.example.user.uberflickerchallenge.model.Images;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 10/11/17.
 */

public class RemoteDataSource {

    public static final String BASE_URL = "https://api.flickr.com/";


    public static final String BASE_URL1 = "https://api.flickr.com/services/rest/?\n" +
            "method=flickr.photos.search&api_key=3e7cc266ae2b0e0d78e279ce8e361736&format=json&nojsonca\n" +
            "llback=1&text=kittens";


    public static final String QUERY_METHOD = "flickr.photos.search";
    public static final String QUERY_KEY = "3e7cc266ae2b0e0d78e279ce8e361736";
    public static final String QUERY_FORMAT = "json";
    public static final String QUERY_NOCALLBACK = "1";




    public static Retrofit create(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit;

    }


    public static Observable<Images> getImagesObs(String searchItem){


        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getImages(QUERY_METHOD, QUERY_KEY, QUERY_FORMAT, QUERY_NOCALLBACK, searchItem);
    }
}
