package com.example.weatherapp1



data class WeatherInfo(
    val cityName: String,
    val temperature: String,
    val condition: String,
    val highLow: String,
    val humidity: String,
    val wind: String
)

data class DailyForecast(
    val day: String,
    val high: String,
    val low: String,
    val condition: String
)

// Placeholder Datasets
val sampleCurrentWeather = WeatherInfo(
    cityName = "Halifax, NS",
    temperature = "22°C",
    condition = "Partly Cloudy",
    highLow = "H: 24°C • L: 14°C",
    humidity = "65%",
    wind = "12 km/h NW"
)

val sampleForecastList = listOf(
    DailyForecast("Today", "24°C", "14°C", "Partly Cloudy"),
    DailyForecast("Tuesday", "21°C", "12°C", "Sunny"),
    DailyForecast("Wednesday", "19°C", "10°C", "Rain"),
    DailyForecast("Thursday", "22°C", "13°C", "Cloudy"),
    DailyForecast("Friday", "25°C", "15°C", "Sunny"),
    DailyForecast("Saturday", "23°C", "14°C", "Sunny"),
    DailyForecast("Sunday", "20°C", "11°C", "Windy")
)