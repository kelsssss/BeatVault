package com.example.beatvault.ui.elements


import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.beatvault.ui.navigation.BottomBarScreen

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
//            .padding(bottom = 50.dp)
    ) {
        screens.forEach{ screen ->
            AddItem(
                screen = screen,
                navController = navController
            )
        }

    }


}

//    BottomAppBar(
//        actions = {
//            IconButton(onClick = { }) {
//                Icon(
//                    Icons.Default.Home,
//                    contentDescription = null
//                )
//            }
//            IconButton(onClick = { }) {
//                Icon(
//                    Icons.Default.Favorite,
//                    contentDescription = null
//                )
//            }
//        }
//    )

//    https://www.geeksforgeeks.org/bottom-navigation-bar-in-android-jetpack-compose/
