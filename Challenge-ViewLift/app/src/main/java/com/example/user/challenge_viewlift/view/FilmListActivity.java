package com.example.user.challenge_viewlift.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.user.challenge_viewlift.R;
import com.example.user.challenge_viewlift.di.DaggerFilmComponent;
import com.example.user.challenge_viewlift.model.Snagfilms;

import javax.inject.Inject;

public class FilmListActivity extends AppCompatActivity implements FilmListContract.View{


    @Inject
    FilmListPresenter presenter;
    private RecyclerView rvFilms;
    private RecyclerView.LayoutManager layoutManager;
    private FilmListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerFilmComponent.create().inject(this);
        presenter.attachView(this);
        presenter.getFilms();

        rvFilms = findViewById(R.id.rvFilms);

    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResponseReceived(Snagfilms snagfilms) {

        layoutManager = new GridLayoutManager(this, 3);
        adapter = new FilmListAdapter(snagfilms.getFilms().getFilm(), this);
        rvFilms.setLayoutManager(layoutManager);
        rvFilms.setAdapter(adapter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }
}
