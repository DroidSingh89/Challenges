package com.example.user.symbiovolvochallenge.view.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.user.symbiovolvochallenge.R
import com.example.user.symbiovolvochallenge.model.bean.Weather
import java.util.ArrayList

class WeatherActivity : AppCompatActivity(), WeatherContract.View {

    private lateinit var presenter: WeatherPresenter
    private var adapter: WeatherAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        presenter = WeatherPresenter()

    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
        presenter.getAllWeather(listOf("london",
                "berlin",
                "stockholm",
                "new york",
                "mountain view",
                "gothenburg"))
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView()
    }

    override fun onWeatherList(weatherList: MutableList<Weather>?) {

        val rvWeather = findViewById<RecyclerView>(R.id.rvWeather)
        adapter = WeatherAdapter(ArrayList())
        rvWeather.adapter = WeatherAdapter(weatherList)
        rvWeather.layoutManager = LinearLayoutManager(this)

    }

    override fun showError(error: String) {

        print("MYTAG" + error)
    }
}
