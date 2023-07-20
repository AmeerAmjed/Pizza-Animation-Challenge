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
        val breadAddState = ingredient.breadAdd.toMutableList().apply {
            if (contains(_state.value.pagerIndex))
                remove(_state.value.pagerIndex)
            else add(_state.value.pagerIndex)
        }

        ingredients[id] = ingredient.copy(
            isSelected = !ingredient.isSelected,
            breadAdd = breadAddState
        )

        _state.update {
            it.copy(
                ingredients = ingredients
            )
        }
    }

    override fun onChangeIndexViewPage(index: Int) {
        _state.update {
            it.copy(
                pagerIndex = index
            )
        }
    }
}