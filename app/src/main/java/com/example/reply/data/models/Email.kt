package com.example.reply.data.models

import android.content.IntentSender
import android.os.IBinder.DeathRecipient
import androidx.annotation.StringRes

data class Email(
    val id:Long,
    val sender: User,
     val subject: String="",
   val body: String = "",
    var mailbox: MailType = MailType.Inbox,
     var createdAt: String = ""
)