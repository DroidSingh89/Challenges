package com.example.user.deltachallenge.view.post;

public class PostPresenter implements PostContract.Presenter {


    PostContract.View view;

    @Override
    public void getPosts() {

    }

    @Override
    public void attachView(PostContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;

    }
}
