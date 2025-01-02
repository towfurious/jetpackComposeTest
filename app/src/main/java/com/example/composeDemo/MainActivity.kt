package com.example.composeDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.composeDemo.components.DrawerMenu
import com.example.composeDemo.components.HomeAppBar
import com.example.composeDemo.components.HomeBottomMenu
import com.example.composeDemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // First part of the demo
            // ProfilePage()
            GmailApp()
        }
    }
}

@Composable
fun GmailApp() {
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scrollState = rememberScrollState()
    val navController = rememberNavController()

    ComposeDemoTheme {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    DrawerMenu(scrollState)
                }
            },
        ) {
            Scaffold(
                topBar = { HomeAppBar(scope, drawerState) },
                content = { contentPadding ->
                    Box(modifier = Modifier.padding(contentPadding)) { /* todo content */ }
                },
                bottomBar = {
                    HomeBottomMenu(navController)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        GmailApp()
    }
}