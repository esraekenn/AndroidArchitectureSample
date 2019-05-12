package io.androidedu.androidarchitecturesample.datalayer.repository

import androidx.lifecycle.MutableLiveData
import io.androidedu.androidarchitecturesample.datalayer.model.WeatherItem
import io.androidedu.androidarchitecturesample.datalayer.network.SendRequest
import io.androidedu.androidarchitecturesample.viewmodel.BaseRepository


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 11:36          │
//└─────────────────────────────┘

class WeatherRepository : BaseRepository() {

    var weather: MutableLiveData<List<WeatherItem>> = MutableLiveData()

    init {

        sendRequest()
    }

    fun sendRequest() {

        SendRequest.getWeatherByCityName({ _, response ->

            weather.postValue(response.body()!!.list[0]!!.weather)

        }, { _, _ ->


        })
    }
}