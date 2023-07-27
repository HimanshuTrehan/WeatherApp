package com.example.layoutpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutpractice.databinding.HourlyWeatherItemViewBinding
import com.example.layoutpractice.models.HourlyWeatherModel
class HourlyAdapter(val context: Context, var weatherDataList: List<HourlyWeatherModel>) :RecyclerView.Adapter<HourlyAdapter.WeatherViewHolder>() {

    class WeatherViewHolder(var binding: HourlyWeatherItemViewBinding) : RecyclerView.ViewHolder(binding.root)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        return  WeatherViewHolder(HourlyWeatherItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder( holder: WeatherViewHolder, position: Int) {

//        var data = weatherDataList[position]
//
//        holder.binding.tempTxt.text = data.temp


    }

    override fun getItemCount(): Int {
        return  10
    }




}