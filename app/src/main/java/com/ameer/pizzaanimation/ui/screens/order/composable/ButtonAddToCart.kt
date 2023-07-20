package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.theme.ColorButton


@Composable
fun ButtonAddToCart(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit,
) {
    Button(
        modifier = modifier,
        onClick = onCLick,
        colors = ButtonDefaults.buttonColors(
            containerColor = ColorButton,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(5.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = ""
            )
            SpacerHorizontal4()
            Text(
                text = stringResource(id = R.string.add_to_cart),
                color = Color.White
            )
        }
    }
}