package com.example.user.challenge_viewlift.di;

import com.example.user.challenge_viewlift.view.FilmListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 2/5/18.
 */

@Module
public class FilmModule {

    @Provides
    FilmListPresenter providesFilmPresenter() {
        return new FilmListPresenter();
    }

}
