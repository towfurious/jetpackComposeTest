package com.example.composeDemo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeDemo.model.DrawerMenuData

@Composable
fun DrawerMenu(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Inbox,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting,
        DrawerMenuData.Help
    )

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Mail", color = Color.Black,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    HorizontalDivider(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp))
                }

                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp, top = 8.dp)
                    )
                }

                else -> {
                    MailDrawerItem(item = item)
                }
            }

        }
    }
}

@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}