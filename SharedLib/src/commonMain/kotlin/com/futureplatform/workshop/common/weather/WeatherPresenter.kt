package com.futureplatform.workshop.common.weather

class WeatherPresenter(
    private val weatherRepository: WeatherRepository
) : WeatherContract.Presenter() {

    override fun onViewTaken() {
        super.onViewTaken()

        val weather = weatherRepository.find("London")
        view?.showWeather(weather)
    }

    override fun updateMyLocation(location: String) {
        // API call

    }
}