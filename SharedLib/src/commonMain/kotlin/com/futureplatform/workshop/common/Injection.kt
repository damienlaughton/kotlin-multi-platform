package com.futureplatform.workshop.common

import com.futureplatform.workshop.common.weather.WeatherPresenter
import com.futureplatform.workshop.common.weather.WeatherRepository
import com.futureplatform.workshop.common.weather.WeatherRepositoryImpl

class Injection {
    val weatherRepository: WeatherRepository = WeatherRepositoryImpl()

    fun weatherPresenter(): WeatherPresenter = WeatherPresenter(weatherRepository)
}