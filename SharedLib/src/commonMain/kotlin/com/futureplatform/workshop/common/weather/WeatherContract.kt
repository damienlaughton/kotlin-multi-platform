package com.futureplatform.workshop.common.weather

import com.futureplatform.workshop.common.BasePresenter
import com.futureplatform.workshop.common.BaseView
import com.futureplatform.workshop.common.Weather

interface WeatherContract {
    interface View : BaseView {
        fun showWeather(weather: Weather)
    }

    abstract class Presenter : BasePresenter<View>() {
        abstract fun updateMyLocation(location: String)
    }
}
