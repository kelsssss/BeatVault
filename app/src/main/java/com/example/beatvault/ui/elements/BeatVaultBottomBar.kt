package com.example.beatvault.ui.elements

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.Composable
import com.example.beatvault.ui.navigation.BottomBarScreen
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.beatvault.ui.navigation.AddItem

@Composable
fun BeatVaultBottomBar(navController: NavHostController)
{

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.YourTracks
    )

    BottomNavigation(
        modifier = Modifier
            .navigationBarsPadding()
    ) {
        screens.forEach{ screen ->
            AddItem(
                screen = screen,
                navController = navController
            )
        }
    }
}
