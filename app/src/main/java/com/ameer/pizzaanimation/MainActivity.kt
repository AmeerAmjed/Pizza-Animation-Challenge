package com.ameer.pizzaanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ameer.pizzaanimation.ui.screens.order.OrderPizzaScreen
import com.ameer.pizzaanimation.ui.theme.PizzaAnimationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaAnimationTheme {
                // A surface container using the 'background' color from the theme
                OrderPizzaScreen()
            }
        }
    }
}

