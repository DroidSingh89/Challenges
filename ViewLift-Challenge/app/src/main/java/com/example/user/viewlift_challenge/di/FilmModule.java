package com.example.user.viewlift_challenge.di;

import com.example.user.viewlift_challenge.api.APIController;
import com.example.user.viewlift_challenge.view.filmgrid.FilmGridPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 2/14/18.
 */

@Module
public class FilmModule {

    String baseURL;

    public FilmModule(String baseURL) {
        this.baseURL = baseURL;
    }

    @Provides
    @Singleton
    FilmGridPresenter provideFilmGridPresenter(APIController apiController){
        return new FilmGridPresenter(apiController);
    }

    @Provides
    @Singleton
    APIController providersApiController() {
        return new APIController(baseURL);
    }

}
