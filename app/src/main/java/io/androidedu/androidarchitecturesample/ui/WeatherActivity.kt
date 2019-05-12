package io.androidedu.androidarchitecturesample.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.androidedu.androidarchitecturesample.DependencyUtil
import io.androidedu.androidarchitecturesample.R
import io.androidedu.androidarchitecturesample.viewmodel.ViewModelFactory
import io.androidedu.androidarchitecturesample.viewmodel.WeatherViewModel
import kotlinx.android.synthetic.main.activity_main.*

class WeatherActivity : AppCompatActivity() {

    private val weatherRepository by lazy { DependencyUtil.getWeatherRepository() }
    private val weatherViewModel: WeatherViewModel by lazy {

        ViewModelProviders.of(
            this,
            ViewModelFactory(weatherRepository)
        ).get(WeatherViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherViewModel.weather.observe(this, Observer { weather ->

            Toast.makeText(this, weather[0].description, Toast.LENGTH_SHORT).show()
        })

        txtHello.setOnClickListener {


            weatherRepository.sendRequest()
        }

    }
}
