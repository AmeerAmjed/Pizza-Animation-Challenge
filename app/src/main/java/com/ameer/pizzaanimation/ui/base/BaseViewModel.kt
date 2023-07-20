package com.ameer.pizzaanimation.ui.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface BaseUiState
abstract class BaseViewModel<UiState : BaseUiState>(state: UiState) : ViewModel() {

    protected val _state = MutableStateFlow(state)
    val state = _state.asStateFlow()

}