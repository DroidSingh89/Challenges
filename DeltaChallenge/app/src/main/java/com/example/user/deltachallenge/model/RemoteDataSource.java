package com.example.user.deltachallenge.model;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RemoteDataSource {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final String PATH_POST = "posts";


    private Retrofit createInstance() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    private Observable<List<Post>> getPostObservable() {

        return createInstance().create(APIService.class).getPosts();

    }


    public void getPosts(final DataCallback callback) {

        getPostObservable()
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Post> postList) {

                        callback.onSuccess(postList);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onFailure(e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }


    interface APIService {

        @GET(PATH_POST)
        Observable<List<Post>> getPosts();
    }

    interface DataCallback{

        void onSuccess(List<Post> postList);

        void onFailure(String error);
    }






}
