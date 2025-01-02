package com.example.composeDemo.components

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composeDemo.model.BottomNavigationItem


@Composable
fun HomeBottomMenu(navController: NavHostController) {
    val items = listOf(
        BottomNavigationItem.Mail,
        BottomNavigationItem.Meet
    )
    NavigationBar(Modifier.background(color = Color.White), containerColor = Color.White) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach {
            NavigationBarItem(
                label = { Text(text = it.title) },
                alwaysShowLabel = true,
                selected = currentDestination?.hierarchy?.any {destination ->
                    destination.route == destination.route
                } == true,
                onClick = { navController.navigate(it.title) },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) })
        }

        AppNavHost(navController = navController)
    }
}

