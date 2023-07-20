package com.ameer.pizzaanimation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val LightColorScheme = lightColorScheme(
    primary = Color.Black,
    onPrimary = Color.White,


    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF1C1B1F),
    /* Other default colors to override

    surface = Color(0xFFFFFBFE),

    onSecondary = Color.White,
    onTertiary = Color.White,

    onSurface = Color(0xFF1C1B1F),
    */
)


@Composable
fun PizzaAnimationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {


    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}