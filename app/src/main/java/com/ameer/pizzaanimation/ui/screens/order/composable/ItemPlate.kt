package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.screens.order.SizeOrderState
import com.ameer.pizzaanimation.ui.theme.PizzaAnimationTheme
import com.ameer.pizzaanimation.ui.utils.getSize

@Composable
fun ItemPlate(
    @DrawableRes imageDrawable: Int,
    sizeOrderState: SizeOrderState
) {
    val rotation = remember { Animatable(0F) }

    Image(
        modifier = Modifier
            .rotate(rotation.value)
            .size(sizeOrderState.getSize().dp),
        painter = painterResource(id = imageDrawable),
        contentDescription = null
    )

    LaunchedEffect(sizeOrderState) {
        rotation.animateTo(sizeOrderState.getSize())
    }

}


@Preview
@Composable
fun ItemPlatePreview() {
    PizzaAnimationTheme {
        ItemPlate(
            R.drawable.bread_4,
            SizeOrderState.Middle
        )
    }
}