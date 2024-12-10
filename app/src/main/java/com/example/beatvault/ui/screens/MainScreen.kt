package com.example.beatvault.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.example.beatvault.ui.elements.AudioItem
import com.example.beatvault.ui.elements.AudioList
import com.example.beatvault.ui.elements.BeatVaultTopBar
import com.example.beatvault.ui.theme.BeatVaultTheme

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
//    innerPaddingValues: PaddingValues,
){
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
                AudioList()
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview(){
    BeatVaultTheme {
        MainScreen()
    }
}