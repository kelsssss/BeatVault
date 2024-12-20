package com.example.beatvault.ui.navigation

import androidx.compose.foundation.layout.RowScope
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Icon
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    navController: NavHostController,
){
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigationItem(
        label = {
            Text(
                text = screen.label
            )
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = null
            )
        },
        selected = screen.route == backStackEntry.value?.destination?.route,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}