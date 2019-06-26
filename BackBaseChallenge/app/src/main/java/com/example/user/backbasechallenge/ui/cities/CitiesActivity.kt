package com.example.user.backbasechallenge.ui.cities


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.user.backbasechallenge.R
import kotlinx.android.synthetic.main.activity_cities.*
import java.util.*

class CitiesActivity : AppCompatActivity(), Cities.View {

    val adapter = CitiesAdapter(ArrayList())
    lateinit var presenter: CitiesPresenterImpl
    override fun updateCities(cities: List<City>) {
        adapter.updateList(cities)
    }

    override fun showError(error: String) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities)
        presenter = CitiesPresenterImpl(this, applicationContext)
        presenter.loadCities()

        rvCities.layoutManager = LinearLayoutManager(this)
        rvCities.adapter = adapter

        etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                presenter.searchCities(s.toString().toLowerCase())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
