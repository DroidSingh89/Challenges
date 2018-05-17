package com.example.user.uberflickerchallenge.view.imagelist;

import android.util.Log;

import com.example.user.uberflickerchallenge.data.remote.RemoteDataSource;
import com.example.user.uberflickerchallenge.model.Images;
import com.example.user.uberflickerchallenge.model.Photo;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 10/11/17.
 */

public class ImageListPresenter implements ImageListContract.Presenter{

    private static final String TAG = "ImageListPresenter";
    ImageListContract.View view;
    List<Photo> photoList = new ArrayList<>();




    @Override
    public void attachView(ImageListContract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {

        this.view = null;


    }

    @Override
    public void getPhotos(String searchItem) {

        Observable<Images> imagesObservable = RemoteDataSource.getImagesObs(searchItem);


        Observer<Images> imagesObserver = new Observer<Images>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

                Log.d(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(@NonNull Images images) {
                Log.d(TAG, "onNext: " + images.getStat() + images.getPhotos().getPhoto().size());
                photoList.addAll(images.getPhotos().getPhoto());

            }

            @Override
            public void onError(@NonNull Throwable e) {

                Log.d(TAG, "onError: " + e.toString());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
                view.updateImages(photoList);

            }
        };

        imagesObservable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(imagesObserver);


    }
}
