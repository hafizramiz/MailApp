package com.example.reply.data.models

import androidx.annotation.DrawableRes

// Kullanici modellerini olusturudum.
data class User(
    val id: Long =1,
    val userName:String,
    val userSurname:String,
    val userMail:String,
    @DrawableRes val userPicture: Int
)
