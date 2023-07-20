package com.ameer.pizzaanimation.ui.utils

import com.ameer.pizzaanimation.ui.screens.order.SizeOrderState

fun SizeOrderState.getSize(): Float = when (this) {
    SizeOrderState.Small -> 150F
    SizeOrderState.Middle -> 180F
    SizeOrderState.Large -> 220F
}
