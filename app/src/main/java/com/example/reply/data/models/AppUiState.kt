package com.example.reply.data.models

import com.example.reply.data.EmailListDatabase

data class AppUiState(
    val gruplanmisButunMailler: Map<MailType, List<Email>>,
    val mevcutMailType: MailType = MailType.Inbox,
    val secilmisMail: Email = EmailListDatabase.defaultEmail,
    val isShowingHomepage: Boolean = true,
) {
    val tiklanincaSecilenMailListesi:
            List<Email> by lazy { gruplanmisButunMailler[mevcutMailType]!! }
    fun a() {
        println("Data class initilazi edildi")
    }
}
