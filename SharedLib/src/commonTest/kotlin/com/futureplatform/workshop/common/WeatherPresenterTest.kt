package com.futureplatform.workshop.common

import com.futureplatform.workshop.common.weather.WeatherContract
import com.futureplatform.workshop.common.weather.WeatherPresenter
import com.futureplatform.workshop.common.weather.WeatherRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import kotlin.test.BeforeTest
import kotlin.test.Test

class WeatherPresenterTest {
    @MockK
    private lateinit var repository: WeatherRepository
    // Swift -> private var repository: WeatherRepository!

    @RelaxedMockK
    private lateinit var view: WeatherContract.View

    @BeforeTest
    fun beforeEveryTest() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `View taken and weather shown`() {
        val fakeWeather = Weather("Test", 0f)

        every { repository.find(any()) } returns fakeWeather

        val presenter = WeatherPresenter(repository)

        // When the view is taken
        presenter.takeView(view)

        // Then the repository is called with London as location
        verify { repository.find("London") }

        // And Then the returned weather is shown on the view
        verify { view.showWeather(fakeWeather) }
    }
}