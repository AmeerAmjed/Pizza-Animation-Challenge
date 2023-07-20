package com.ameer.pizzaanimation.ui.screens.order.composable


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.pizzaanimation.ui.screens.order.IngredientUiState
import com.ameer.pizzaanimation.ui.screens.order.OrderUiState
import com.ameer.pizzaanimation.ui.theme.space16
import com.ameer.pizzaanimation.ui.theme.space8

@Composable
fun Ingredients(
    state: List<IngredientUiState>,
    onCLick: (id: Int) -> Unit,
) {

    LazyRow(
        contentPadding = PaddingValues(space16),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(space8)
    ) {
        items(count = state.size) { index ->
            ItemIngredients(
                state = state[index],
                onCLick = onCLick,
                index = index
            )
        }
    }
}

@Composable
fun ItemIngredients(
    modifier: Modifier = Modifier,
    state: IngredientUiState,
    onCLick: (id: Int) -> Unit,
    index: Int,
) {
    var background =
        if (state.isSelected) Color.Green.copy(.2F) else MaterialTheme.colorScheme.background
    Button(
        onClick = { onCLick(index) },
        modifier = modifier
            .size(72.dp)
            .clip(CircleShape),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = background
        )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape),
            painter = painterResource(id = state.idDrawableRes),
            contentDescription = null
        )
    }
}