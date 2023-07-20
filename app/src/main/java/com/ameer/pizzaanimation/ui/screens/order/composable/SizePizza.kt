package com.ameer.pizzaanimation.ui.screens.order.composable

import androidx.annotation.StringRes
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.screens.order.SizeOrderState

@Composable
fun SizePlateOrder(
    state: SizeOrderState,
    modifier: Modifier = Modifier,
    onSelectedSize: (size: SizeOrderState) -> Unit
) {
    val offsetAnimation: Dp by animateDpAsState(
        when (state) {
            SizeOrderState.Small -> 3.dp
            SizeOrderState.Middle -> 85.dp
            SizeOrderState.Large -> 168.dp
        }, spring(stiffness = Spring.StiffnessLow), label = ""
    )

    Box(
        modifier
            .width(220.dp)
            .height(60.dp)
    ) {

        Box(
            modifier = Modifier
                .size(50.dp)
                .fillMaxSize()
                .absoluteOffset(x = offsetAnimation)
                .shadow(
                    elevation = 6.dp,
                    shape = CircleShape,
                    ambientColor = Color.Black,
                    spotColor = Color.Black
                )
                .clip(CircleShape)
                .background(Color.White)


        )


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            ItemSizePlateOrder(
                idStringRes = R.string.s,
                onCLick = { onSelectedSize(SizeOrderState.Small) }
            )
            SpacerHorizontal32()

            ItemSizePlateOrder(
                idStringRes = R.string.m,
                onCLick = { onSelectedSize(SizeOrderState.Middle) }
            )

            SpacerHorizontal32()

            ItemSizePlateOrder(
                idStringRes = R.string.l,
                onCLick = { onSelectedSize(SizeOrderState.Large) }
            )

        }

    }

}


@Composable
fun ItemSizePlateOrder(
    @StringRes idStringRes: Int,
    onCLick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .clickable(
                onClick = onCLick
            )

    ) {
        Text(
            text = stringResource(id = idStringRes),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(Alignment.Center)
        )

    }
}