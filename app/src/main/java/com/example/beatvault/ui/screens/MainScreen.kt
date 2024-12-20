package com.example.beatvault.ui.screens


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.elements.BeatVaultBottomBar
import com.example.beatvault.ui.elements.BeatVaultTopBar
import com.example.beatvault.ui.navigation.NavigationGraph
import com.example.beatvault.ui.theme.BeatVaultTheme

@Composable
fun MainScreen(
    viewModel: BeatVaultViewModel,
    modifier: Modifier = Modifier,
){
    val context = LocalContext.current
    val navController = rememberNavController()

    LaunchedEffect(context) {
        viewModel.initializeExoPlayer(context)
    }


    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { BeatVaultTopBar() },
        bottomBar = { BeatVaultBottomBar(navController) }
    ) { innerPadding ->
        Surface(
            modifier = modifier.fillMaxSize().padding(innerPadding)
        ) {
                NavigationGraph(
                    viewModel,
                    navController
                )
        }
    }
}

@Preview
@Composable
fun MainScreenPreview(){
    BeatVaultTheme {
//        MainScreen()
    }
}