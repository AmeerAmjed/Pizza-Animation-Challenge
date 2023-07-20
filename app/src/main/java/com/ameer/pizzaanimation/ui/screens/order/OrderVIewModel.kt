package com.ameer.pizzaanimation.ui.screens.order

import com.ameer.pizzaanimation.ui.base.BaseViewModel
import kotlinx.coroutines.flow.update

class OrderVIewModel : BaseViewModel<OrderUiState>(OrderUiState()), OrderInteraction {
    override fun onSelectedSizePlate(size: SizeOrderState) {
        _state.update {
            it.copy(
                size = size
            )
        }
    }

    override fun onSelectedIngredients(id: Int) {

        val ingredients = _state.value.ingredients.toMutableList()
        val ingredient = ingredients[id]
        ingredients[id] = ingredient.copy(
            isSelected = !ingredient.isSelected
        )

        _state.update {
            it.copy(
                ingredients = ingredients
            )
        }
    }
}