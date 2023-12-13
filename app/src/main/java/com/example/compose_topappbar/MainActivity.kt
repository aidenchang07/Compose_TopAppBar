package com.example.compose_topappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose_topappbar.ui.screens.MainScreen
import com.example.compose_topappbar.ui.theme.Compose_TopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_TopAppBarTheme {
                MainScreen()
            }
        }
    }
}