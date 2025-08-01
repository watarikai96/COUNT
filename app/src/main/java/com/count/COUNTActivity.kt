package com.count

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.count.ui.screen.COUNTScreen
import com.count.ui.theme.QuietCraftTheme

class COUNTActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuietCraftTheme {
                    // Main screens composable(s) go here!
                    COUNTScreen()
            }
        }
    }
}