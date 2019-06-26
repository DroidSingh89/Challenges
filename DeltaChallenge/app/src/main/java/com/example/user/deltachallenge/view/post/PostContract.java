package com.example.user.deltachallenge.view.post;

import com.example.user.deltachallenge.model.Post;
import com.example.user.deltachallenge.view.base.BasePresenter;
import com.example.user.deltachallenge.view.base.BaseView;

import java.util.List;

public interface PostContract {

    interface View extends BaseView {

        void onPostsUpdate(List<Post> postList);

    }

    interface Presenter extends BasePresenter<View> {

        void getPosts();
    }

}
