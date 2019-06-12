package com.futureplatforms.workshopproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.futureplatform.workshop.common.Injection
import com.futureplatform.workshop.common.Weather
import com.futureplatform.workshop.common.weather.WeatherContract

class MainActivity : AppCompatActivity(), WeatherContract.View {
    private val presenter = Injection().weatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.takeView(this)
    }

    override fun showWeather(weather: Weather) {
        Log.d("Main Activity", "My weather!!!! :D")
    }
}
