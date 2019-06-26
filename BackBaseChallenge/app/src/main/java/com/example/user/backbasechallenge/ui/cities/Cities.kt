package com.example.user.backbasechallenge.ui.cities

interface Cities {

    interface Model{
        fun getCities(): List<City>

    }

    interface View{

        fun updateCities(cities: List<City>)
        fun showError(error: String)

    }

    interface Presenter{

        fun loadCities()
        fun searchCities(criteria: String)
    }
}