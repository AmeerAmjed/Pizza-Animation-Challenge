package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.pizzaanimation.ui.screens.order.IngredientUiState


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ItemIngredientPlate(state: IngredientUiState, size: Float) {
    AnimatedVisibility(
        visible = state.isSelected,
        enter = scaleIn(initialScale = 10f) + fadeIn(),
        exit = fadeOut()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(

                painter = painterResource(id = state.idGroupDrawableRes),
                modifier = Modifier
                    .size((size - 30).dp)
                    .align(Alignment.Center),
                contentDescription = null,
            )
        }

    }
}