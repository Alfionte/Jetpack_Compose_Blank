package com.gabrieleporcelli.testproject.application.navigation


sealed interface NavScreen {
    val route: String

    object MainScreen : NavScreen {
        override val route = "main_screen"
    }
}