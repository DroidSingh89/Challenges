package com.example.user.backbasechallenge.ui.cities

import android.content.Context
import com.example.user.backbasechallenge.common.loadFromAssets
import org.json.JSONArray
import org.json.JSONObject
import java.lang.ref.WeakReference

class CitiesModelImpl(context: Context?) : Cities.Model {

    var context: WeakReference<Context?> = WeakReference(context)

    override fun getCities(): List<City> {

        return parseFromJson()
    }

    fun parseFromJson(): List<City> {

        val citiesJson = loadFromAssets(context, "cities.json")

        val citiesList = ArrayList<City>()

        val citiesArray = JSONArray(citiesJson)
        for (i in 0 until citiesArray.length()) {

            val cityObj: JSONObject = citiesArray[i] as JSONObject
            val cityCoordObj: JSONObject? = cityObj.getJSONObject("coord")
            val cityCoord= Coord(cityCoordObj?.getDouble("lat"), cityCoordObj?.getDouble("lon"))
            val city = City(cityObj.getString("country"), cityObj.getString("name"), cityObj.getLong("_id"), cityCoord)
            citiesList.add(city)
        }
        return citiesList

    }


}