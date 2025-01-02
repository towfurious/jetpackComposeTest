package com.example.composeDemo.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(
    val icon: ImageVector,
    val title: String,

    ) {
    object Mail : BottomNavigationItem(
        icon = Icons.Outlined.Mail,
        title = "Mail"
    )
    object Meet : BottomNavigationItem(
        icon = Icons.Outlined.Mail,
        title = "Meet"
    )
}