package com.example.reply.data

import com.example.reply.R
import com.example.reply.data.models.Email
import com.example.reply.data.models.MailType
import com.example.reply.data.models.User

object EmailListDatabase {

    val allEmails = listOf(
        Email(
            id = 0L,
            sender = UserListDatabase.allUserList[0],
            subject = "Package shipped!",
            body = "E mail Body1",
            createdAt = "2 minutes ago"
        ),
        Email(
            id = 1L,
            sender = UserListDatabase.allUserList[1],
            subject = "Appointment this weekend",
            body = "If we do get a chance to get together, remind me to tell you about Kim.\n" +
                    "        She stopped over at the house to say hey to the kids and told me all about her trip to\n" +
                    "        Mexico.\\n\\nTalk to you soon",
            createdAt = "52 mins ago",
            mailbox = MailType.Drafts
        ),
        Email(
            2L,
            sender = UserListDatabase.allUserList[2],
            subject = "Hi from Azerbaijan",
            body = "Hi friends,\\n\\nI was at the grocery store on Sunday night.. when I ran into Genie Williams!\n" +
                    "        I almost didn\\'t recognize her afer 20 years!\\n\\nAnyway, it turns out she is on the\n" +
                    "        organizing committee for the high school reunion this fall. I don\\'t know if you were\n" +
                    "        planning on going or not, but she could definitely use our help in trying to track down lots\n" +
                    "        of missing alums.\\n\\nIf you can make it, we\\'re doing a little phone-tree party at her place\n" +
                    "        next Saturday, hoping that if we can find one person,",
            createdAt = "1 hour ago"
        ),
        Email(
            3L,
            UserListDatabase.allUserList[3],
            subject = "About Dialog",
            body = "Hi friends,\\n\\nI was at the grocery store on Sunday night.. when I ran into Genie Williams!\n" +
                    "        I almost didn\\'t recognize her afer 20 years!\\n\\nAnyway, it turns out she is on the\n" +
                    "        organizing committee for the high school reunion this fall. I don\\'t know if you were\n" +
                    "        planning on going or not, but she could definitely use our help in trying to track down lots\n" +
                    "        of missing alums.\\n\\nIf you can make it, we\\'re doing a little phone-tree party at her place\n" +
                    "        next Saturday, hoping that if we can find one person, thee more will...",
            createdAt = "2 mins ago",
            mailbox = MailType.Sent,
        ),
        Email(
            id = 4L,
            sender = UserListDatabase.allUserList[4],
            subject = "Trip plan",
            body = "Thought we might be able to go over some details about our upcoming vacation.\\n\\nI\\'ve been\n" +
                    "        doing a bit of research and have come across a few paces in Northern Brazil that I think we\n" +
                    "        should check out. One, the north has some of the most predictable wind on the planet. I\\'d\n" +
                    "        love to get out on the ocean and kitesurf for a couple of days if we\\'re going to be\n" +
                    "        anywhere near or around Taiba. I hear it\\'s beautiful there and if you\\'re up for it, I\\'d\n" +
                    "        love to go. Other than that, I haven\\'t spent too much time looking into places along our\n" +
                    "        road trip route. I\\'m assuming we can find places to stay and things to do as we drive and\n" +
                    "        find places we think look interesting. But... I know you\\'re more of a planner, so if you\n" +
                    "        have ideas or places in mind, lets jot some ideas down!\\n\\nMaybe we can jump on the phone\n" +
                    "        later today if you have a second.",
            createdAt = "5 seconds ago"
        ),
        Email(
            id = 5L,
            sender = UserListDatabase.allUserList[5],
            subject = "Update your plan",
            body = "No body",
            createdAt = "2 hours ago",
        ),
        Email(
            id = 6L,
            sender = UserListDatabase.allUserList[6],
            subject = "Recipe to try",
            body = "We should make this pie recipe tonight! The filling is very quick to put\n" +
                    "        together.",
            createdAt = "3 hours ago",
            mailbox = MailType.Inbox
        ),
        Email(
            id = 7L,
            sender = UserListDatabase.allUserList[7],
            subject = "Recipe to try",
            body = "Your update, 0.1.1, is now live on the Play Store and available for your alpha users to\n" +
                    "        start testing.\\n\\nYour alpha testers will be automatically notified. If you\\'d rather send\n" +
                    "        them a link directly, go to your Google Play Console and follow the instructions for\n" +
                    "        obtaining an open alpha testing link.",
            createdAt = "3 hours ago",
            mailbox = MailType.Sent
        ),
        Email(
            id = 8L,
            sender = UserListDatabase.allUserList[8],
            subject = "Your updating about app",
            body = "Your alpha testers will be automatically notified. If you\\'d rather send\n" +
                    "        them a link directly, go to your Google Play Console and follow the instructions for\n" +
                    "        obtaining an open alpha testing link.",
            createdAt = "5 hours ago",
            mailbox = MailType.Drafts

        ),
        Email(
            id = 9L,
            sender = UserListDatabase.allUserList[9],
            subject = "About My Resume",
            body = "I sent my resume with this mail",
            createdAt = " 5 min ago"
        ),
        Email(
            id = 10L,
            sender = UserListDatabase.allUserList[10],
            subject = " Try to use Figma",
            body = "Whether you\\'re an experienced hiker or\n" +
                    "        just looking to get outside for the afternoon, there\\'s a segment that suits you.",
            createdAt = "7 hours ago"
        ),
        Email(
            id = 11L,
            sender = UserListDatabase.allUserList[11],
            subject = "Congurlations",
            body = "You have been selected to this bootcamp",
            createdAt = " 8 mins ago",
            mailbox = MailType.Spam
        )
    )


    val defaultEmail = Email(
        id = -1,
        sender = UserListDatabase.defaultAccount,
    )
}