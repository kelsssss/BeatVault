package com.example.beatvault.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beatvault.data.exampledata.TrackInfo
import com.example.beatvault.ui.BeatVaultViewModel
import com.example.beatvault.ui.theme.BeatVaultTheme


@Composable
fun AudioItem(
    trackInfo: TrackInfo,
    viewModel: BeatVaultViewModel,
    modifier: Modifier = Modifier
){
    val isPlaying = remember {  mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    if(isPlaying.value == false) {
                    viewModel.playAudio("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3")
                    isPlaying.value = !isPlaying.value
                } else {
                    viewModel.stopPlayer()
                    isPlaying.value = !isPlaying.value

                }
                }
            ) {
                if(isPlaying.value == false){
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = null
                    )
                } else {
                    Icon(
                        Icons.Filled.Clear,
                        contentDescription = null
                    )
                }

            }
            Column(
            ) {
                Text(
                    text = trackInfo.name
                )
                Text(
                    text = trackInfo.author
                )
            }
            Spacer(
                modifier.weight(1f)
            )
            Text(
                text = "Цена: ${trackInfo.price}p",

            )

        }
    }
}


@Preview
@Composable
fun AudioItemPreview(){
    BeatVaultTheme {
//        AudioItem()
    }
}