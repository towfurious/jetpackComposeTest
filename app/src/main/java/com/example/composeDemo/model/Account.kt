package com.example.composeDemo.model

data class Account(
    val icon: Int? = null,
    val title: String,
    val email: String,
    val unreadMails: Int?
)
