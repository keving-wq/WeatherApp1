package com.example.weatherapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp1.ui.theme.WeatherApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherApp1Theme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "current_weather") {
                    composable("current_weather") {
                        CurrentWeatherScreen(
                            weather = sampleCurrentWeather,
                            onNavigateToForecast = {
                                navController.navigate("forecast")
                            }
                        )
                    }
                    composable("forecast") {
                        ForecastScreen(
                            forecasts = sampleForecastList,
                            onBackClick = {
                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}