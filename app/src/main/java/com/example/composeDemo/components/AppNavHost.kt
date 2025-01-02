package com.example.composeDemo.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Mail") {
        composable(route = "Mail") {}
        composable(route = "Meet") {}
    }
}
