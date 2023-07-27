package com.example.layoutpractice.ui

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layoutpractice.R
import com.example.layoutpractice.adapters.WeatherDayAdapter
import com.example.layoutpractice.databinding.ActivityWeatherDayListBinding
import com.example.layoutpractice.models.HourlyWeatherModel

class WeatherDayListActivity : AppCompatActivity() {

    lateinit var binding: ActivityWeatherDayListBinding
    lateinit var adapter: WeatherDayAdapter
    lateinit var weatherList: ArrayList<HourlyWeatherModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherDayListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        weatherList = ArrayList();
        binding.dayRecycler.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        adapter = WeatherDayAdapter(applicationContext,weatherList)
        binding.dayRecycler.adapter = adapter


    }
}