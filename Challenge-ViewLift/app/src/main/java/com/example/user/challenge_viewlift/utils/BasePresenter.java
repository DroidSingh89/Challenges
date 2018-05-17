package com.example.user.challenge_viewlift.utils;

/**
 * Created by user on 2/5/18.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V View);

    void detachView();
}
