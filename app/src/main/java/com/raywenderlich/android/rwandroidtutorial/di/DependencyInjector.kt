package com.raywenderlich.android.rwandroidtutorial.di

import com.raywenderlich.android.rwandroidtutorial.weather.model.WeatherRepository

interface DependencyInjector {
    fun weatherRepository() : WeatherRepository
}