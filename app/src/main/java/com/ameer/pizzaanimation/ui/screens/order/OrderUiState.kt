package com.ameer.pizzaanimation.ui.screens.order

import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.base.BaseUiState

data class OrderUiState(
    val pagerIndex: Int = 0,
    val price: String = "$17",
    val size: SizeOrderState = SizeOrderState.Small,
    val bread: List<Int> = listOf(
        R.drawable.bread_1,
        R.drawable.bread_2,
        R.drawable.bread_3,
        R.drawable.bread_4,
        R.drawable.bread_5,
    ),
    var ingredients: List<IngredientUiState> = listOf(
        IngredientUiState(
            idDrawableRes = R.drawable.ic_roccoli,
            idGroupDrawableRes = R.drawable.group_broccoli,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_mushroom,
            idGroupDrawableRes = R.drawable.group_mushroom,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_basil,
            idGroupDrawableRes = R.drawable.group_basil,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_onion,
            idGroupDrawableRes = R.drawable.group_onion,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_sausage,
            idGroupDrawableRes = R.drawable.group_sausage,
            isSelected = false
        ),
    )
) : BaseUiState


data class IngredientUiState(
    val isSelected: Boolean,
    val idDrawableRes: Int,
    val idGroupDrawableRes: Int,
)

enum class SizeOrderState {
    Small, Middle, Large,
}
