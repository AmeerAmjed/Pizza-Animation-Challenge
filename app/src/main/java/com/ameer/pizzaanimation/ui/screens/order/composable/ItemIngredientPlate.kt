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
import com.ameer.pizzaanimation.ui.screens.order.OrderUiState
import com.ameer.pizzaanimation.ui.utils.getSize


@Composable
@OptIn(ExperimentalAnimationApi::class)
fun ItemIngredientPlate(state: OrderUiState, index: Int) {
    AnimatedVisibility(
        visible = state.ingredients[index].isSelected(state.pagerIndex),
        enter = scaleIn(initialScale = 10f) + fadeIn(),
        exit = fadeOut()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(

                painter = painterResource(id = state.ingredients[index].idGroupDrawableRes),
                modifier = Modifier
                    .size((state.size.getSize() - 30).dp)
                    .align(Alignment.Center),
                contentDescription = null,
            )
        }

    }
}