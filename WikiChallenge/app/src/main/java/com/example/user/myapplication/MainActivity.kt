package com.example.user.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    val remoteDataSource = RemoteDataSource()

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        remoteDataSource.getResponse("Android")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .map { response: String -> parse(response)}
            .subscribe { response ->  parseResponse(response)  }

    }

    private fun parseResponse(response: Int?) {

        Log.d(MainActivity::class.java.simpleName, response.toString())


    }
}
