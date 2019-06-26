package com.example.user.backbasechallenge.common

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import com.example.user.backbasechallenge.ui.cities.City
import java.io.IOException
import java.lang.ref.WeakReference
import java.util.*
import kotlin.collections.ArrayList

fun loadFromAssets(context: WeakReference<Context?>, FILE_NAME: String): String? {

    if (context.get() != null) {
        try {
            val manager = context.get()!!.getAssets()
            val file = manager.open(FILE_NAME)
            val formArray = ByteArray(file.available())
            file.read(formArray)
            file.close()
            return String(formArray)
        } catch (ex: IOException) {
            Log.e(TAG, ex.localizedMessage, ex)
        }

    }

    return null
}

//binary search
fun search(cities: MutableList<City>, prefix: String): MutableList<City> {
    val prefixOComparator = Comparator<Any> { o1, o2 ->
        if (prefix.length > o1.toString().length)
            1
        else
            o1.toString().toLowerCase().substring(0, prefix.length).compareTo(o2.toString().toLowerCase())
    }

    val randomIndex = Collections.binarySearch<Any>(cities, prefix, prefixOComparator)

    if (randomIndex >= 0) {
        var rangeStarts = randomIndex
        var rangeEnds = randomIndex

        while (rangeStarts > -1 && cities[rangeStarts].name.toLowerCase().startsWith(prefix.toLowerCase()))
            rangeStarts--

        while (rangeEnds < cities.size && cities[rangeEnds].name.toLowerCase().startsWith(prefix.toLowerCase()))
            rangeEnds++

        return ArrayList(cities.subList(rangeStarts + 1, rangeEnds))
    } else {
        return ArrayList()
    }
}