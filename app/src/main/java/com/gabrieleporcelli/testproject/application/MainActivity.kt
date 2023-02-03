package com.gabrieleporcelli.testproject.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gabrieleporcelli.testproject.application.navigation.Navigation
import com.gabrieleporcelli.testproject.application.theme.TestProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestProjectTheme {
                Navigation()
            }
        }
    }
}