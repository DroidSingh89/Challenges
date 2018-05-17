package com.example.user.uberflickerchallenge.view.imagelist;

import com.example.user.uberflickerchallenge.BasePresenter;
import com.example.user.uberflickerchallenge.BaseView;
import com.example.user.uberflickerchallenge.model.Photo;

import java.util.List;

/**
 * Created by user on 10/11/17.
 */

public interface ImageListContract {

    interface View extends BaseView{

        void updateImages(List<Photo> photos);

    }


    interface Presenter extends BasePresenter<View>{

        void getPhotos(String searchItem);

    }

}
