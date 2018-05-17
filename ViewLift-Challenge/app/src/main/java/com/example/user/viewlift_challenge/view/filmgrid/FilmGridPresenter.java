package com.example.user.viewlift_challenge.view.filmgrid;

import com.example.user.viewlift_challenge.api.APIController;
import com.example.user.viewlift_challenge.model.Snagfilms;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 2/14/18.
 */

public class FilmGridPresenter implements FilmGridContract.Presenter{

    FilmGridContract.View view;
    APIController apiController;

    @Inject
    public FilmGridPresenter(APIController apiController) {
        this.apiController = apiController;
    }


    @Override
    public void attachView(FilmGridContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void getFilms() {

        apiController.getFilms("30")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Snagfilms>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Snagfilms snagfilms) {

                        view.onFilmsReceived(snagfilms.getFilms().getFilm());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
