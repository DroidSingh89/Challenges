package com.example.user.viewlift_challenge.view.filmgrid;

import com.example.user.viewlift_challenge.model.FilmItem;
import com.example.user.viewlift_challenge.utils.BasePresenter;
import com.example.user.viewlift_challenge.utils.BaseView;

import java.util.List;

/**
 * Created by user on 2/14/18.
 */

public interface FilmGridContract {

    //    interface for View
    interface View extends BaseView {
        void onFilmsReceived(List<FilmItem> filmItems);
    }

    //    interface for Presenter
    interface Presenter extends BasePresenter<View> {
        void getFilms();
    }
}
