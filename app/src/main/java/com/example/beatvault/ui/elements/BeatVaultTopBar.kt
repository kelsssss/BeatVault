package com.example.beatvault.ui.elements

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.beatvault.ui.theme.BeatVaultTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BeatVaultTopBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "BeatVault",
                fontSize = 30.sp
            )
        }
    )
}

@Preview
@Composable
fun BeatVaultTopBarPreview(){
    BeatVaultTheme {
        BeatVaultTopBar()
    }
}