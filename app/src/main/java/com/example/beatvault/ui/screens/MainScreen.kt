package com.example.beatvault.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.beatvault.ui.BeatVaultViewModel

import com.example.beatvault.ui.elements.AudioItem
import com.example.beatvault.ui.elements.AudioList
import com.example.beatvault.ui.elements.BeatVaultTopBar
import com.example.beatvault.ui.theme.BeatVaultTheme

@Composable
fun MainScreen(
//    context: Context,
    viewModel: BeatVaultViewModel,
    modifier: Modifier = Modifier,
){

//    viewModel.initializeExoPlayer(context)
    val context = LocalContext.current

    LaunchedEffect(context) {
        viewModel.initializeExoPlayer(context)
    }

    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = { BeatVaultTopBar() }
    ) { innerPadding ->
//        MainScreen(innerPaddingValues = innerPadding)


        Surface(
            modifier = modifier.fillMaxSize().padding(innerPadding)
        ) {
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                AudioList(viewModel)
            }
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