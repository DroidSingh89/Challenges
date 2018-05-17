package com.example.user.challenge_viewlift.di;

import com.example.user.challenge_viewlift.view.FilmListActivity;

import dagger.Component;

/**
 * Created by user on 2/5/18.
 */

@Component(modules = FilmModule.class)
public interface FilmComponent {

    void inject(FilmListActivity filmListActivity);
}
