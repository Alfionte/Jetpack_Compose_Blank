package com.gabrieleporcelli.testproject.feature.main.domain.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.gabrieleporcelli.testproject.application.navigation.NavScreen

fun NavGraphBuilder.mainScreen() {
    composable(NavScreen.MainScreen.route) {
       // Add MainScreen here
    }
}