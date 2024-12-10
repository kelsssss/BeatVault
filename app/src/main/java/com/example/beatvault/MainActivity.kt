package com.example.beatvault

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.elements.AudioList
import com.example.beatvault.ui.screens.MainScreen
import com.example.beatvault.ui.theme.BeatVaultTheme

class MainActivity : ComponentActivity() {

    val viewModel: BeatVaultViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

//            val context = LocalContext.current
//            viewModel.initializeExoPlayer(context)
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