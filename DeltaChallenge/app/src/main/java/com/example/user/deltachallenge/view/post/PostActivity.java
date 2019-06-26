package com.example.user.deltachallenge.view.post;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.deltachallenge.R;
import com.example.user.deltachallenge.model.Post;

import java.util.List;

public class PostActivity extends AppCompatActivity implements PostContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPostsUpdate(List<Post> postList) {

    }

    @Override
    public void showError(String error) {

    }
}
