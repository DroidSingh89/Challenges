package com.example.user.viewlift_challenge.di;

import com.example.user.viewlift_challenge.view.filmgrid.FilmGridActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by user on 2/14/18.
 */

@Component(modules = FilmModule.class)
@Singleton
public interface FilmComponent {
    void inject(FilmGridActivity activity);
}
