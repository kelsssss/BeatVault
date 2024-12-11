package com.example.beatvault.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen (
    val route: String,
    val label: String,
    val icon: ImageVector,
){
    object Home: BottomBarScreen(
        route = "home",
        label = "Все треки",
        icon = Icons.Default.Home
    )
    object YourTracks: BottomBarScreen(
        route = "your tracks",
        label = "Ваши треки",
        icon = Icons.Default.Favorite
    )
}