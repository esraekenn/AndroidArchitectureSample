package io.androidedu.androidarchitecturesample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.androidedu.androidarchitecturesample.datalayer.model.WeatherItem
import io.androidedu.androidarchitecturesample.datalayer.repository.WeatherRepository


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 11:30          │
//└─────────────────────────────┘

class WeatherViewModel(weatherRepository: WeatherRepository) : ViewModel() {

    val weather: MutableLiveData<List<WeatherItem>> = weatherRepository.weather
}