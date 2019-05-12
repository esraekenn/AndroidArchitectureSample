package io.androidedu.androidarchitecturesample

import io.androidedu.androidarchitecturesample.datalayer.repository.WeatherRepository


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 12:52          │
//└─────────────────────────────┘

object DependencyUtil {

    fun getWeatherRepository(): WeatherRepository = WeatherRepository()
}