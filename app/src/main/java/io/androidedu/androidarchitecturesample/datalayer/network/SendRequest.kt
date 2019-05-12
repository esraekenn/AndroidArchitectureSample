package io.androidedu.androidarchitecturesample.datalayer.network

import io.androidedu.androidarchitecturesample.datalayer.model.WeatherResponseByCityName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 13:00          │
//└─────────────────────────────┘

object SendRequest {

    inline fun getWeatherByCityName(
        crossinline onResponse: (call: Call<WeatherResponseByCityName>, response: Response<WeatherResponseByCityName>) -> Unit,
        crossinline onFailure: (call: Call<WeatherResponseByCityName>, t: Throwable) -> Unit
    ) {

        RetrofitClient
            .getClient()
            .create(WeatherService::class.java)
            .getWeatherByCityName(
                apiVersion = "2.5",
                cityName = "Ankara",
                apiKey = "0974f2c3965545dad807a2dfeff5a73a"
            ).enqueue(object : Callback<WeatherResponseByCityName> {
                override fun onFailure(call: Call<WeatherResponseByCityName>, t: Throwable) {

                    onFailure(call, t)
                }

                override fun onResponse(
                    call: Call<WeatherResponseByCityName>,
                    response: Response<WeatherResponseByCityName>
                ) {

                    onResponse(call, response)
                }
            })
    }
}