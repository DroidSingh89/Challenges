package com.example.user.backbasechallenge.ui.cities

import android.content.Context
import java.lang.ref.WeakReference

class CitiesPresenterImpl(val view: Cities.View, context: Context) : Cities.Presenter {

    private lateinit var citiesList: List<City>
    private val weakView: WeakReference<Cities.View> = WeakReference(view)
    var citiesView: Cities.View
    var model: Cities.Model = CitiesModelImpl(context)

    init {
        citiesView = weakView.get()!!
    }

    override fun loadCities() {
        citiesList = model.getCities()
        citiesView.updateCities(citiesList)
    }

    override fun searchCities(criteria: String) {

        if (criteria.isEmpty()) view.updateCities(citiesList)
        else {
            val newList = citiesList.toMutableList()
            citiesView.updateCities(newList.filter { it.name.toLowerCase().startsWith(criteria) })
        }

    }
}