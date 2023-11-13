package com.example.weatheralex.data

data class WeatherModel(
    val city : String,
    val time : String,
    var currentTemp : String,
    val condition : String,
    val icon : String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
