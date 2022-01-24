package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings


sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
){
        object Home: BottomBarScreen(
            route = "home",
            title = "Home",
            icon = Icons.Default.Home
        )

    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Settings: BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )


}