package com.ameer.pizzaanimation.ui.screens.order

import com.ameer.pizzaanimation.R
import com.ameer.pizzaanimation.ui.base.BaseUiState

data class OrderUiState(
    val price: String = "$17",
    val size: SizeOrderState = SizeOrderState.Small,
    val bread: List<Int> = listOf(R.drawable.bread_4, R.drawable.bread_4, R.drawable.bread_4),

    val option: List<Int> = listOf(R.drawable.ic_roccoli, R.drawable.bread_4, R.drawable.bread_4),
    var ingredients: List<IngredientUiState> = listOf(
        IngredientUiState(
            idDrawableRes = R.drawable.ic_roccoli,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_mushroom,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_basil,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_onion,
            isSelected = false
        ),
        IngredientUiState(
            idDrawableRes = R.drawable.ic_sausage,
            isSelected = false
        ),
    )
) : BaseUiState


data class IngredientUiState(
    val isSelected: Boolean,
    val idDrawableRes: Int,
)

enum class SizeOrderState {
    Small, Middle, Large,
}