package com.ameer.pizzaanimation.ui.screens.order

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.screens.order.composable.AppBar
import com.ameer.pizzaanimation.ui.screens.order.composable.ButtonAddToCart
import com.ameer.pizzaanimation.ui.screens.order.composable.Ingredients
import com.ameer.pizzaanimation.ui.screens.order.composable.Plates
import com.ameer.pizzaanimation.ui.screens.order.composable.SizePlateOrder
import com.ameer.pizzaanimation.ui.screens.order.composable.SpacerVertical16
import com.ameer.pizzaanimation.ui.screens.order.composable.SpacerVertical32
import com.ameer.pizzaanimation.ui.theme.space16
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OrderPizzaScreen(
    viewModel: OrderVIewModel = hiltViewModel()
) {

    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = state.pagerIndex)
    OrderPizzaContent(
        state = state,
        pagerState = pagerState,
        orderInteraction = viewModel
    )
}


@OptIn(ExperimentalPagerApi::class)
@Composable
private fun OrderPizzaContent(
    state: OrderUiState,
    pagerState: PagerState,
    orderInteraction: OrderInteraction
) {
    Column {
        AppBar("Pizza", {}, {})
        SpacerVertical32()
        Plates(
            pagerState = pagerState, state = state,
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth(),
        )
        SpacerVertical32()
        Text(
            text = state.price,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
        )
        SpacerVertical32()
        SizePlateOrder(
            state = state.size,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onSelectedSize = orderInteraction::onSelectedSizePlate
        )
        SpacerVertical16()
        Text(
            modifier = Modifier.padding(start = space16),
            text = stringResource(id = R.string.custom_your_pizza)
        )
        SpacerVertical16()
        Ingredients(
            state = state.ingredients,
            onCLick = orderInteraction::onSelectedIngredients
        )

        Spacer(modifier = Modifier.weight(1F))
        ButtonAddToCart(
            Modifier
                .align(Alignment.CenterHorizontally)
        ) {}
        Spacer(modifier = Modifier.weight(1F))
    }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }
            .collect { currentPage ->
                orderInteraction.onChangeIndexViewPage(currentPage)
            }
    }

}




