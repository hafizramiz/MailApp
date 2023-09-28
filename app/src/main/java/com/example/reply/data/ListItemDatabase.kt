package com.example.reply.data

import com.example.reply.data.models.ListItemModel
import com.example.reply.data.models.MailType

object ListItemDatabase {

    val allListItems = listOf<ListItemModel>(
        ListItemModel(mailType = MailType.Inbox,email=EmailListDatabase.allEmails[11],user=UserListDatabase.allUserList[0]),
        ListItemModel(mailType = MailType.Drafts,email=EmailListDatabase.allEmails[10],user=UserListDatabase.allUserList[1]),
        ListItemModel(mailType = MailType.Sent,email=EmailListDatabase.allEmails[9],user=UserListDatabase.allUserList[2]),
        ListItemModel(mailType = MailType.Drafts,email=EmailListDatabase.allEmails[8],user=UserListDatabase.allUserList[3]),
        ListItemModel(mailType = MailType.Spam,email=EmailListDatabase.allEmails[7],user=UserListDatabase.allUserList[4]),
        ListItemModel(mailType = MailType.Drafts,email=EmailListDatabase.allEmails[6],user=UserListDatabase.allUserList[5]),
        ListItemModel(mailType = MailType.Sent,email=EmailListDatabase.allEmails[5],user=UserListDatabase.allUserList[6]),
        ListItemModel(mailType = MailType.Spam,email=EmailListDatabase.allEmails[4],user=UserListDatabase.allUserList[7]),
        ListItemModel(mailType = MailType.Sent,email=EmailListDatabase.allEmails[3],user=UserListDatabase.allUserList[8]),
        ListItemModel(mailType = MailType.Drafts,email=EmailListDatabase.allEmails[2],user=UserListDatabase.allUserList[9]),
        ListItemModel(mailType = MailType.Inbox,email=EmailListDatabase.allEmails[1],user=UserListDatabase.allUserList[10]),
        ListItemModel(mailType = MailType.Inbox,email=EmailListDatabase.allEmails[0],user=UserListDatabase.allUserList[11]),
    )

}