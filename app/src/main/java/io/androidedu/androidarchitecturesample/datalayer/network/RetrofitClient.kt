package io.androidedu.androidarchitecturesample.datalayer.network

import io.androidedu.androidarchitecturesample.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-11 - 12:03          │
//└─────────────────────────────┘

class RetrofitClient {

    companion object {

        fun getClient(): Retrofit {

            return Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}