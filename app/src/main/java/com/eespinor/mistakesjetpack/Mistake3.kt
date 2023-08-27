package com.eespinor.mistakesjetpack

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController

@Composable
fun LoginScreen(
    isLoggedIn: Boolean,
    navController:NavController
) {
    LaunchedEffect(key1=isLoggedIn){
        if (isLoggedIn){
            navController.navigate("main_screen")
        }
    }
    Box {
        //content
    }
}