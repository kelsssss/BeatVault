package com.example.beatvault.ui.elements


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.theme.BeatVaultTheme
import com.example.beatvault.R
import com.example.beatvault.data.exampledata.TrackInfo
import com.example.beatvault.data.exampledata.exampleList

@Composable
fun AudioList(
    viewModel: BeatVaultViewModel,
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier
            .fillMaxSize(),
    ) {
        items(exampleList){track ->
            AudioItem(
                trackInfo = track,
                viewModel,
                modifier = modifier
                    .padding(top = 0.dp, bottom = 15.dp, start = 15.dp, end = 15.dp)
            )
        }
    }
}

@Preview
@Composable
fun AudioListPreview(){
    BeatVaultTheme {
//        AudioList()
    }
}