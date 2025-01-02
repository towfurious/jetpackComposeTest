package com.example.composeDemo.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MailFab(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(onClick = { /*TODO*/}, content = {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
            Text(text = "Compose", color = Color.Black, fontSize = 16.sp)
        }, elevation = FloatingActionButtonDefaults.elevation(8.dp))

    } else{
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }
    }
}