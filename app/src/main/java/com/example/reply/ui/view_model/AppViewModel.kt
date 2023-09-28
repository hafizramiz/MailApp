package com.example.reply.ui.view_model

import androidx.lifecycle.ViewModel
import com.example.reply.data.EmailListDatabase
import com.example.reply.data.models.AppUiState
import com.example.reply.data.models.Email
import com.example.reply.data.models.MailType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AppViewModel : ViewModel() {
    // Baslangic state'i verdim.
    private val _uiState = MutableStateFlow(AppUiState(emptyMap()))
    val uiState: StateFlow<AppUiState> = _uiState

    init {
        // Init icersiinde baslangic AppuiState' vercem
        // Mailini tipine gore bir arama yapcam. Baslangicta inbox olanlari dondurdum.
        // Bu metot verilen parametreye gore gruplandirma yaparak ilgili degiskende key,value seklinde sakliyor.
        // Bunun return ettigini bir degiskene aliyoruz. Bu degiskenin tipi Map<key, value> seklinde oluyor.
        val gruplanmisButunMailler: Map<MailType, List<Email>> =
            EmailListDatabase.allEmails.groupBy { it.mailbox }
        println("gruplandirilmis Mailler: ${gruplanmisButunMailler[MailType.Sent]}")
        _uiState.value = AppUiState(
            gruplanmisButunMailler = gruplanmisButunMailler,
            secilmisMail = EmailListDatabase.defaultEmail
        )
    }

    fun guncelleMailTipin(mailType: MailType) {
        _uiState.update {
            it.copy(
                mevcutMailType = mailType,
                isShowingHomepage = true
            )
        }

    }
    fun updateStateOnClicked(email: Email) {
        _uiState.update {
            it.copy(
                secilmisMail = email,
                isShowingHomepage = false
            )
        }
    }


    fun changeState() {
        _uiState.update {
            it.copy(
                isShowingHomepage = true
            )
        }

    }

}