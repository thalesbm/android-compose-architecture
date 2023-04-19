package com.example.compose.architecture.viewModel

sealed class MainViewModelState {

    data class LoadScreen(val title: String) : MainViewModelState()

    data class UpdateScreen(val title: String) : MainViewModelState()
}
