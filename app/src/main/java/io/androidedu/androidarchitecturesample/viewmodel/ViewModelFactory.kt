package io.androidedu.androidarchitecturesample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.androidedu.androidarchitecturesample.datalayer.repository.WeatherRepository


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 12:47          │
//└─────────────────────────────┘

class ViewModelFactory constructor(private val repository: BaseRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return if (modelClass.isAssignableFrom(WeatherViewModel::class.java)) {

            WeatherViewModel(this.repository as WeatherRepository) as T

        } else {

            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}