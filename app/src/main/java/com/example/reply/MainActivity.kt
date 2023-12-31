package com.example.reply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import com.example.reply.ui.HomeScreen
import com.example.reply.ui.theme.ReplyTheme
import com.example.reply.ui.utils.components.DetailAppBar
import com.example.reply.ui.utils.components.Profile
import com.example.reply.ui.utils.components.SearchBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WindowWidthSizeClass
            ReplyTheme {
                Surface {
                   DetailAppBar()
                }
            }
        }
    }
}
