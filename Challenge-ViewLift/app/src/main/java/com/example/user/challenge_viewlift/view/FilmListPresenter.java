package com.example.user.challenge_viewlift.view;

import com.example.user.challenge_viewlift.data.RemoteDataSource;
import com.example.user.challenge_viewlift.model.Snagfilms;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 2/5/18.
 */

public class FilmListPresenter implements FilmListContract.Presenter {

    FilmListContract.View view;

    @Override
    public void attachView(FilmListContract.View view) {
        this.view = view;

    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void getFilms() {

        RemoteDataSource.getResponse(RemoteDataSource.DEFAULT_LIMIT)
                .observeOn(AndroidSchedulers.mainThread())//receive the results on the main thread
                .subscribeOn(Schedulers.io())//make the call on the worker thread
                .subscribe(new Observer<Snagfilms>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Snagfilms snagfilms) {

                        view.onResponseReceived(snagfilms);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showError(e.toString());
                    }

                    @Override
                    public void onComplete() {


                    }
                });


    }
}
