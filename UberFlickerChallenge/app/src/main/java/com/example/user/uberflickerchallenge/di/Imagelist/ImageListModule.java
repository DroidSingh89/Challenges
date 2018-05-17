package com.example.user.uberflickerchallenge.di.Imagelist;

import com.example.user.uberflickerchallenge.view.imagelist.ImageListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 10/11/17.
 */

@Module
public class ImageListModule {


    @Provides
    ImageListPresenter providesImageListPresenter(){
        return new ImageListPresenter();
    }


}
