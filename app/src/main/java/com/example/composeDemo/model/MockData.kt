package com.example.composeDemo.model

import com.example.composedemo.R

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:00"
    ),
    MailData(
        mailId = 3,
        userName = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "19:50"
    ),
    MailData(
        mailId = 4,
        userName = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "19:45"
    ),
    MailData(
        mailId = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "19:30"
    ),
    MailData(
        mailId = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "19:30"
    ),
    MailData(
        mailId = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "19:28"
    ),
    MailData(
        mailId = 8,
        userName = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timeStamp = "19:20"
    ),
    MailData(
        mailId = 9,
        userName = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "19:10"
    ),
    MailData(
        mailId = 10,
        userName = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timeStamp = "20:10"
    )
)

val accountList = listOf(
    Account(icon = R.drawable.spider, title = "Spider", email = "spider@mail.com", unreadMails = 99),
    Account(title = "Rick Sanches", email = "awesomerick@mail.com", unreadMails = 8),
    Account(title = "Morty Smith", email = "mortyrocks@mail.com", unreadMails = 1)
)