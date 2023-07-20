package com.ameer.pizzaanimation.ui.screens.order

interface OrderInteraction {
    fun onSelectedSizePlate(size: SizeOrderState)
    fun onSelectedIngredients(id: Int)

}