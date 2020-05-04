package com.raywenderlich.android.rwandroidtutorial.di

import com.raywenderlich.android.rwandroidtutorial.weather.model.WeatherRepository
import com.raywenderlich.android.rwandroidtutorial.weather.model.WeatherRepositoryImpl

class DependencyInjectorImpl : DependencyInjector {
    override fun weatherRepository(): WeatherRepository {
        return WeatherRepositoryImpl()
    }
}