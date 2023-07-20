package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.pizzaanimation.ui.theme.space16
import com.ameer.pizzaanimation.ui.theme.space32
import com.ameer.pizzaanimation.ui.theme.space8


@Composable
fun SpacerVertical8() {
    Spacer(modifier = Modifier.height(space8))
}

@Composable
fun SpacerVertical16() {
    Spacer(modifier = Modifier.height(space16))
}

@Composable
fun SpacerVertical32() {
    Spacer(modifier = Modifier.height(space32))
}
