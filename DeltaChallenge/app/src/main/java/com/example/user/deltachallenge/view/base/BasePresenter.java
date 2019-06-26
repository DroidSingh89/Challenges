package com.example.user.deltachallenge.view.base;

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
