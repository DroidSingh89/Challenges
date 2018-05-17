package com.example.user.challenge_viewlift.view;

import com.example.user.challenge_viewlift.model.Snagfilms;
import com.example.user.challenge_viewlift.utils.BasePresenter;
import com.example.user.challenge_viewlift.utils.BaseView;

/**
 * Created by user on 2/5/18.
 */

public interface FilmListContract {

    interface View extends BaseView {

        void onResponseReceived(Snagfilms snagfilms);

    }

    interface Presenter extends BasePresenter<View> {

        void getFilms();

    }

}
