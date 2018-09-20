package com.example.user.symbiovolvochallenge.view.base

interface BasePresenter<V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}
