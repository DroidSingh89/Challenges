package com.example.user.uberflickerchallenge.di.Imagelist;

import com.example.user.uberflickerchallenge.view.imagelist.ImageList;

import dagger.Component;

/**
 * Created by user on 10/11/17.
 */

@Component(modules = ImageListModule.class)
public interface ImageListComponent {


    void inject(ImageList imageList);

}
