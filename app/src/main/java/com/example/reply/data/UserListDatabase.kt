package com.example.reply.data

import android.accounts.Account
import com.example.reply.R
import com.example.reply.data.models.User

// Veri kaynagini hazirladim.
object UserListDatabase {
    val defaultAccount = User(-1, "-1", "-1", "-1", R.drawable.hafiz)

    val userAccount =
        User(
            id = 1,
            userName = "Alan",
            userSurname = "Turing",
            userMail ="turing@gmail.com",
            userPicture =R.drawable.avatar10
        )

     val allUserList = listOf(
        User(
            id = 4L,
            userName = "Ety",
            userSurname = "Gordan",
            userMail ="ety@gmail.com",
            userPicture =R.drawable.avatar9
        ),
        User(
            id = 5L,
            userName = "Bella",
            userSurname = "Aaron",
            userMail ="bella@gmail.com",
            userPicture =R.drawable.avatar10
        ),
        User(
            id = 6L,
            userName = "Jaxson",
            userSurname = "Jacob",
            userMail ="Jacob@gmail.com",
            userPicture =R.drawable.avatar8
        ),
        User(
            id = 7L,
            userName = "Oliver",
            userSurname = "Aaron",
            userMail ="Aaron@gmail.com",
            userPicture =R.drawable.avatar7
        ),

        User(
            id = 8L,
            userName = "Ety",
            userSurname = "Gordan",
            userMail ="ety@gmail.com",
            userPicture =R.drawable.avatar6
        ),
        User(
            id = 9L,
            userName = "Bella",
            userSurname = "Aaron",
            userMail ="bella@gmail.com",
            userPicture =R.drawable.avatar5
        ),
        User(
            id = 10L,
            userName = "Jaxson",
            userSurname = "Jacob",
            userMail ="Jacob@gmail.com",
            userPicture =R.drawable.avatar4
        ),
        User(
            id = 7L,
            userName = "Oliver",
            userSurname = "Aaron",
            userMail ="Aaron@gmail.com",
            userPicture =R.drawable.avatar3
        ),
        User(
            id = 4L,
            userName = "Ety",
            userSurname = "Gordan",
            userMail ="ety@gmail.com",
            userPicture =R.drawable.avatar2
        ),
        User(
            id = 5L,
            userName = "Bella",
            userSurname = "Aaron",
            userMail ="bella@gmail.com",
            userPicture =R.drawable.avatar1
        ),
        User(
            id = 6L,
            userName = "Jaxson",
            userSurname = "Jacob",
            userMail ="Jacob@gmail.com",
            userPicture =R.drawable.avatar8
        ),
        User(
            id = 7L,
            userName = "Oliver",
            userSurname = "Aaron",
            userMail ="Aaron@gmail.com",
            userPicture =R.drawable.avatar7
        ),

    )

    fun getContactAccountById(accountId: Long): User {
        return allUserList.firstOrNull { it.id == accountId }
            ?: allUserList.first()
    }

}