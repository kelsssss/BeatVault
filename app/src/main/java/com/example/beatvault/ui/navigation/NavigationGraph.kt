package com.example.beatvault.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.elements.AudioList
import com.example.beatvault.ui.elements.SavedAudioList

@Composable
fun NavigationGraph(
    viewModel: BeatVaultViewModel,
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            AudioList(viewModel)
        }
        composable(route = BottomBarScreen.YourTracks.route){
            SavedAudioList(viewModel)
        }
    }
}