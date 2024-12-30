package com.example.composeDemo.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AllInbox
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.Drafts
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.NewLabel
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Snooze
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Tag
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {
    object AllInboxes : DrawerMenuData(
        icon = Icons.Default.AllInbox,
        title = "All inboxes"
    )

    object Inbox : DrawerMenuData(
        icon = Icons.Default.Inbox,
        title = "Inbox"
    )

    object Primary : DrawerMenuData(
        icon = Icons.Default.Mail,
        title = "Primary"
    )

    object Social : DrawerMenuData(
        icon = Icons.Default.Person,
        title = "Social"
    )

    object Promotions : DrawerMenuData(
        icon = Icons.Default.Tag,
        title = "Promotions"
    )
    object Starred : DrawerMenuData(
        icon = Icons.Default.Star,
        title = "Starred"
    )
    object Snoozed : DrawerMenuData(
        icon = Icons.Default.Snooze,
        title = "Snoozed"
    )
    object Important : DrawerMenuData(
        icon = Icons.Default.NewLabel,
        title = "Important"
    )
    object Sent : DrawerMenuData(
        icon = Icons.Default.Send,
        title = "Sent"
    )
    object Schedule : DrawerMenuData(
        icon = Icons.Default.Schedule,
        title = "Scheduled"
    )

    object Draft : DrawerMenuData(
        icon = Icons.Default.Drafts,
        title = "Drafts"
    )

    object AllMail : DrawerMenuData(
        icon = Icons.Default.Mail,
        title = "All Mail"
    )

    object Calendar : DrawerMenuData(
        icon = Icons.Default.CalendarMonth,
        title = "Calendar"
    )

    object Contacts : DrawerMenuData(
        icon = Icons.Default.Contacts,
        title = "Contacts"
    )

    object Setting : DrawerMenuData(
        icon = Icons.Default.Settings,
        title = "Setting"
    )

    object Help : DrawerMenuData(
        icon = Icons.Default.Help,
        title = "Help & FeedBack"
    )

    object Divider : DrawerMenuData(
        isDivider = true
    )

    object HeaderOne : DrawerMenuData(
        isHeader = true,
        title = "All Labels"
    )

    object HeaderTwo : DrawerMenuData(
        isHeader = true,
        title = "Apps"
    )
}

