package com.example.user.uberflickerchallenge;

/**
 * Created by user on 10/11/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);
    void detachView();


}
