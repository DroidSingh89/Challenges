package com.example.user.viewlift_challenge.utils;

/**
 * Created by user on 2/14/18.
 */

public interface BasePresenter<V extends BaseView>{

    void attachView(V view);

    void detachView();

}
