package com.futureplatform.workshop.common.weather

import com.futureplatform.workshop.common.Weather

interface WeatherRepository {
    fun find(location: String): Weather
}

class WeatherRepositoryImpl : WeatherRepository {

    override fun find(location: String): Weather {
        val weather = Weather(location, 17.6f)

        return weather
    }
}