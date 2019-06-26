package com.example.user.backbasechallenge.ui.cities

import java.io.Serializable

class City(val country:String, val name:String, val _id:Long, val coord: Coord): Serializable
class Coord(val lat: Double?, val lon: Double?): Serializable