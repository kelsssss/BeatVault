package com.example.beatvault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.screens.MainScreen
import com.example.beatvault.ui.theme.BeatVaultTheme

class MainActivity : ComponentActivity() {

    val viewModel: BeatVaultViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeatVaultTheme {
                MainScreen(viewModel)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    BeatVaultTheme {
//        MainScreen()
    }
}