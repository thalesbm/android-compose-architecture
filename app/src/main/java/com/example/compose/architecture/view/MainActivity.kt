package com.example.compose.architecture.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose.architecture.view.ui.ComposeArchitectureTheme
import com.example.compose.architecture.view.ui.Init
import com.example.compose.architecture.viewModel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        initViewModel()
//        initStates()

        setContent {
            ComposeArchitectureTheme {
                Init(viewModel)
            }
        }
    }

//    private fun initViewModel() {
//        val factor = MainViewModelFactory()
//        viewModel = ViewModelProviders.of(this, factor).get(MainViewModel::class.java)
//    }
//
//    private fun initStates() {
//        viewModel.viewLiveData.observe(this, Observer {
//            when (it) {
//                is MainViewModelState.LoadScreen -> {
//
//                }
//                is MainViewModelState.UpdateScreen -> {
//
//                }
//            }
//        })
//    }
}
