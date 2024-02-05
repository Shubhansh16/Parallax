package com.example.parallax.navigation


import androidx.compose.runtime.Composable
import com.example.parallax.ui.screen.splash.SplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parallax.ui.screen.home.HomeScreen
import com.example.parallax.ui.screen.tower.TowerScreen
import com.example.parallax.utils.EnterAnimationFadeIn
import com.example.parallax.utils.EnterAnimationSlide

@Composable
fun NavigationBuilder(){
    val navigationController = rememberNavController()

    NavHost(
        navController = navigationController,
        startDestination = WatchScreen.SplashScreen.route
    ) {
        composable(route = WatchScreen.SplashScreen.route){
            EnterAnimationFadeIn(durationInMillis=1550) {
                SplashScreen(navController=navigationController)
            }
        }
        composable(route= WatchScreen.HomeScreen.route){
            EnterAnimationSlide{
                HomeScreen(navController=navigationController)
            }
        }
        composable(route =WatchScreen.TowerScreen.route){
            EnterAnimationFadeIn (durationInMillis=3050){
                TowerScreen(navController = navigationController)
            }
        }
    }
}