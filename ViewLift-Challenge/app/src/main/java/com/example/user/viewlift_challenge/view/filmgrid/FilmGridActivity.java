package com.example.user.viewlift_challenge.view.filmgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.user.viewlift_challenge.R;
import com.example.user.viewlift_challenge.SnagFilmApplication;
import com.example.user.viewlift_challenge.model.FilmItem;

import java.util.List;

import javax.inject.Inject;

public class FilmGridActivity extends AppCompatActivity implements FilmGridContract.View{


    @Inject
    FilmGridPresenter presenter;
    private RecyclerView rvFilmView;

    private FilmGridAdapter filmGridAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SnagFilmApplication.get(this).getFilmComponent().inject(this);
        presenter.attachView(this);
        presenter.getFilms();


    }

    private void setupRecyclerView(List<FilmItem> filmItems) {
        rvFilmView = findViewById(R.id.rvFilmGrid);
        filmGridAdapter = new FilmGridAdapter(filmItems, this);
        layoutManager = new GridLayoutManager(this, 3);
        rvFilmView.setAdapter(filmGridAdapter);
        rvFilmView.setLayoutManager(layoutManager);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void onFilmsReceived(List<FilmItem> filmItems) {
        setupRecyclerView(filmItems);

    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();

    }
}
