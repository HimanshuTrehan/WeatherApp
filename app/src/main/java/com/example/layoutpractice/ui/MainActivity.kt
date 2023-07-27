package com.example.layoutpractice.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.layoutpractice.adapters.HourlyAdapter
import com.example.layoutpractice.databinding.ActivityMainBinding
import com.example.layoutpractice.models.HourlyWeatherModel

class MainActivity : AppCompatActivity() {



    lateinit var binding: ActivityMainBinding
    lateinit var adapter: HourlyAdapter
    lateinit var weatherList: ArrayList<HourlyWeatherModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        weatherList = ArrayList()
        addDataToList()
        setUpViews()


    }

    private fun addDataToList() {
        weatherList.add(HourlyWeatherModel("10:00 am","sd","e3w"))

    }

    private fun setUpViews() {
        binding.recycler.visibility = VISIBLE
        binding.recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        adapter = HourlyAdapter(applicationContext, weatherList)
        binding.recycler.adapter = adapter
        binding.next.setOnClickListener {
            val intent = Intent(this,WeatherDayListActivity::class.java)
            startActivity(intent)
        }
    }
}