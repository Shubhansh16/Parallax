package com.example.parallax.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
    primary = VividOrange,
    primaryVariant = DragonFire,
    secondary = AmericanBronze
)

private val LightColorPalette = lightColors(
    primary = VividOrange,
    primaryVariant = DragonFire,
    secondary = AmericanBronze

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ParallaxTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        typography =Typography,
        content = content
    )
}