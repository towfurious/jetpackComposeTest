package com.example.composeDemo.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheetDefaults.properties
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.composeDemo.model.Account
import com.example.composeDemo.model.accountList
import com.example.composedemo.R

@Composable
fun AccoutnsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false},
        properties = DialogProperties(dismissOnClickOutside = false)) {
        DialogUI(openDialog = openDialog)
    }
}

@Composable
fun DialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>) {
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(16.dp)
        ) {
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {openDialog.value = false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(
                    painter = painterResource(id = R.drawable.google_logo), contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                        .clip(CircleShape)
                )
            }
            AccountItem(account = accountList[0])

            Row(
                modifier.fillMaxWidth(), horizontalArrangement = SpaceEvenly
            ) {
                Card(
                    modifier.requiredHeight(40.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = Center
                    )
                }
                Spacer(modifier.width(10.dp))
            }

            HorizontalDivider(modifier.padding(top = 16.dp))

            Column {
                accountList.forEach { item ->
                    AccountItem(account = item)
                }
            }

            AddAccount(icon = Icons.Default.PersonAddAlt, "Add Another Account")
            AddAccount(icon = Icons.Outlined.ManageAccounts, "Manage Accounts on this device")

            HorizontalDivider(modifier.padding(top = 16.dp, bottom = 16.dp))
            Row(modifier.fillMaxWidth(), horizontalArrangement = SpaceEvenly, content = {
                Text(text = "Privacy Policy")
                Text(text = "Terms Of Service")
            })
        }
    }
}

@Composable
fun AccountItem(account: Account) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        if (account.icon != null) {
            Image(
                painter = painterResource(id = account.icon),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color = Gray)
            )
            Column(
                modifier = Modifier
                    .weight(2.0f)
                    .padding(start = 16.dp, bottom = 16.dp)
            ) {
                Text(text = account.title, fontWeight = FontWeight.SemiBold)
                Text(text = account.email)
            }
            Text(text = "${account.unreadMails}+", modifier = Modifier.padding(end = 16.dp))
        } else {
            Card(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(40.dp)
                    .clip(CircleShape)
            ) {
                Text(
                    text = account.title[0].toString(),
                    modifier = Modifier
                        .padding(8.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
            Column(
                modifier = Modifier
                    .weight(2.0f)
                    .padding(start = 16.dp, bottom = 16.dp)
            ) {
                Text(text = account.title, fontWeight = FontWeight.SemiBold)
                Text(text = account.email)
            }
            Text(text = "${account.unreadMails}", modifier = Modifier.padding(end = 16.dp))
        }

    }
}

@Composable
fun AddAccount(icon: ImageVector, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
    ) {
        IconButton(onClick = {}) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 8.dp, start = 8.dp))
    }
}


@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun DialogUIPreview() {
    DialogUI(openDialog = mutableStateOf(false))
}