package com.example.user.challenge_viewlift.ui.videolist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.user.challenge_viewlift.R
import com.example.user.challenge_viewlift.RemoteDataSource

class VideoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RemoteDataSource().execute { rss ->
            rss?.channel?.items?.forEach { item ->
                Log.d(VideoListActivity::class.java.simpleName, "onCreate: ${item.content?.url}")
            }
        }
    }
}
