package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.pizzaanimation.ui.theme.space32
import com.ameer.pizzaanimation.ui.theme.space4
import com.ameer.pizzaanimation.ui.theme.space8


@Composable
fun SpacerHorizontal4() {
    Spacer(modifier = Modifier.width(space4))
}

@Composable
fun SpacerHorizontal8() {
    Spacer(modifier = Modifier.width(space8))
}

@Composable
fun SpacerHorizontal32() {
    Spacer(modifier = Modifier.width(space32))
}


