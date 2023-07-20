package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.pizzaanimation.ui.theme.PizzaAnimationTheme
import com.ameer.pizzaanimation.ui.theme.space16

@Composable
fun AppBar(
    title: String,
    onClickBack: () -> Unit,
    onCLickFavorite: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(space16),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {

        CustomSmallButton(
            imageVector = Icons.Default.ArrowBack,
            background = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground,
            shape = CircleShape,
            onClick = onClickBack
        )
        Text(text = title)
        CustomSmallButton(
            imageVector = Icons.Default.Favorite,
            background = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground,
            shape = CircleShape,
            onClick = onCLickFavorite
        )

    }
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    PizzaAnimationTheme {
        AppBar("Pizza", {}, {})
    }
}