package com.eespinor.mistakesjetpack

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(viewModel: MainViewModel) {
    val scope = rememberCoroutineScope()
    Box{
        Button(
            onClick = {
                scope.launch {
                    viewModel.login()
                }
            }
        ){

        }
    }

}