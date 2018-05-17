package com.example.user.uberflickerchallenge.view.imagelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.example.user.uberflickerchallenge.R;
import com.example.user.uberflickerchallenge.di.Imagelist.DaggerImageListComponent;
import com.example.user.uberflickerchallenge.model.Photo;
import com.example.user.uberflickerchallenge.model.Photos;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ImageList extends AppCompatActivity implements ImageListContract.View {


    private RecyclerView rvImageList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    ImageListAdapter imageListAdapter;
    List<Photo> photoList;

    @Inject
    ImageListPresenter presenter;
    private EditText etSearchItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDaggerComponent();

        rvImageList = findViewById(R.id.rvImageList);
        etSearchItem = findViewById(R.id.etSearchItem);

        presenter.attachView(this);

        layoutManager = new GridLayoutManager(this, 3);
        itemAnimator = new DefaultItemAnimator();
        rvImageList.setLayoutManager(layoutManager);
        rvImageList.setItemAnimator(itemAnimator);

        presenter.getPhotos("kitten");


    }

    private void setupDaggerComponent() {
        DaggerImageListComponent.create().inject(this);
    }

    @Override
    public void showError(String s) {

    }

    @Override
    public void updateImages(List<Photo> photos) {

        photoList = new ArrayList<>();
        photoList = photos;
        imageListAdapter = new ImageListAdapter(photoList);
        rvImageList.setAdapter(imageListAdapter);


    }

    public void searchItem(View view) {

        presenter.getPhotos(etSearchItem.getText().toString());
    }
}
