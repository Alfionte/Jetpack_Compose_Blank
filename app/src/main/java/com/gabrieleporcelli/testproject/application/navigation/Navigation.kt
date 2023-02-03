package com.gabrieleporcelli.testproject.application.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.gabrieleporcelli.testproject.feature.main.domain.navigation.mainScreen

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreen.MainScreen.route,
    ) {
        mainScreen()
    }
}