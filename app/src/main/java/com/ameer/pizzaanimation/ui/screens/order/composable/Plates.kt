package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.screens.order.OrderUiState
import com.ameer.pizzaanimation.ui.utils.getSize
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState


@OptIn(ExperimentalPagerApi::class, ExperimentalPagerApi::class)
@Composable
fun Plates(
    modifier: Modifier = Modifier,
    state: OrderUiState,
    pagerState: PagerState,
) {

    Box(
        modifier = modifier,
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.plate),
            contentDescription = null
        )

        HorizontalPager(
            count = state.bread.size,
            state = pagerState,
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) { page ->

            ItemPlate(
                imageDrawable = state.bread[page],
                sizeOrderState = state.size,
            )

        }

        state.ingredients.forEach {
            ItemIngredientPlate(
                it, size = state.size.getSize(),
            )
        }

    }

}
