package com.example.reply.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reply.R

import com.example.reply.data.models.MailType
import com.example.reply.ui.utils.components.ScrollableList
import com.example.reply.ui.view_model.AppViewModel

// Navigation Rail  buyuk ekranlrda  bottom nav bar yerine
// sol tarafta alt alta gosterme seklidir.
// Bide persisten/permanet navigation drawer var bu da sol tarafta Ayni navigation rail gibi
// sadece daha buyuk ve icon isimlerinin de yer aldigi bir gosterim sekli.Daha da buyuk ekranlarda
//bu kullanilir.

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    val appViewModel: AppViewModel = viewModel()
    val appUiState = appViewModel.uiState.collectAsState().value

    val navigationItemContentList = listOf(
        NavigationItemContent(
            mailboxType = MailType.Inbox,
            icon = Icons.Default.MailOutline,
            text = "stringResource(id = R.string.tab_inbox)"
        ),
        NavigationItemContent(
            mailboxType = MailType.Sent,
            icon = Icons.Default.Send,
            text = "stringResource(id = R.string.tab_sent)"
        ),
        NavigationItemContent(
            mailboxType = MailType.Drafts,
            icon = Icons.Default.Add,
            text = "stringResource(id = R.string.tab_drafts)"
        ),
        NavigationItemContent(
            mailboxType = MailType.Spam,
            icon = Icons.Default.List,
            text = "stringResource(id = R.string.tab_spam)"
        )
    )

        if (appUiState.isShowingHomepage) {
            Box(modifier = modifier) {
                Row(modifier = Modifier.fillMaxSize()) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(MaterialTheme.colorScheme.inverseOnSurface)
                    ) {
                        ScrollableList(
                            appUiState=appUiState,
                            modifier = Modifier
                                .weight(1f)
                                .padding(
                                    horizontal = dimensionResource(R.dimen.email_list_only_horizontal_padding)
                                ),
                            onEmailCardPressed = {

                                appViewModel.updateStateOnClicked(email = it)
                            }
                        )
                        ReplyBottomNavigationBar(
                            currentTab = appUiState.mevcutMailType,
                            onTabPressed = {
                                appViewModel.guncelleMailTipin(it)
                                println(it)
                            },
                            navigationItemContentList = navigationItemContentList,
                        )
                    }
                }
            }
        } else {
            ReplyDetailsScreen(
                appUiState = appUiState, onBackPressed = {
appViewModel.changeState();
                })
        }

}




@Composable
private fun ReplyBottomNavigationBar(
    currentTab: MailType,
    onTabPressed: ((MailType) -> Unit),
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        for (navItem in navigationItemContentList) {
            NavigationBarItem(
                selected = currentTab == navItem.mailboxType,
                onClick = { onTabPressed(navItem.mailboxType) },
                icon = {
                    Icon(
                        imageVector = navItem.icon,
                        contentDescription = navItem.text
                    )
                }
            )
        }
    }
}


private data class NavigationItemContent(
    val mailboxType: MailType,
    val icon: ImageVector,
    val text: String
)