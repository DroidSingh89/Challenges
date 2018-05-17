package com.example.user.viewlift_challenge;

import android.app.Application;
import android.content.Context;

import com.example.user.viewlift_challenge.di.DaggerFilmComponent;
import com.example.user.viewlift_challenge.di.FilmModule;

/**
 * Created by user on 2/14/18.
 */

public class SnagFilmApplication extends Application {

    String baseURL = "http://www.snagfilms.com/";

    DaggerFilmComponent filmComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    filmComponent = (DaggerFilmComponent) DaggerFilmComponent.builder()
                .filmModule(new FilmModule(baseURL))
                .build();

    }

    public static SnagFilmApplication get(Context context){
        return (SnagFilmApplication) context.getApplicationContext();
    }

    public DaggerFilmComponent getFilmComponent() {
        return filmComponent;
    }
}
