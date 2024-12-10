package com.example.beatvault.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beatvault.ui.theme.BeatVaultTheme


@Composable
fun AudioItem(
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()

//            .height(60.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
        ) {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = null
                )
            }
            Column(
//                verticalArrangement = Ar
            ) {
                Text(
                    text = "Имя артиста"
                )
                Text(
                    text = "Название"
                )
            }

        }
    }
}


@Preview
@Composable
fun AudioItemPreview(){
    BeatVaultTheme {
        AudioItem()
    }
}