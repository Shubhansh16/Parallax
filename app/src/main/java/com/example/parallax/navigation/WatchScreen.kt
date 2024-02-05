package com.example.parallax.navigation

sealed class WatchScreen(val route:String) {
    object SplashScreen:WatchScreen("splash_screen")
    object HomeScreen:WatchScreen("home_screen")
    object TowerScreen:WatchScreen("tower_screen")

}