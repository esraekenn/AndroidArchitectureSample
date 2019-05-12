package io.androidedu.androidarchitecturesample.datalayer.network

import io.androidedu.androidarchitecturesample.datalayer.model.WeatherResponseByCityName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 10:35          │
//└─────────────────────────────┘

interface WeatherService {

    @GET("{apiVersion}/forecast/hourly")
    fun getWeatherByCityName(

        @Path("apiVersion") apiVersion: String,
        @Query("q") cityName: String,
        @Query("appid") apiKey: String

    ): Call<WeatherResponseByCityName>
}