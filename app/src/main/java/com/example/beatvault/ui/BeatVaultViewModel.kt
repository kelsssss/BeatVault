package com.example.beatvault.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class BeatVaultViewModel : ViewModel(){


    private var player: ExoPlayer? = null


    fun playAudio(audioUri: String) {
        player?.apply {
            val mediaItem = MediaItem.fromUri(audioUri)
            setMediaItem(mediaItem)
            prepare()
            play()
        }
    }

    fun stopPlayer(){
        player?.stop()
    }

    override fun onCleared() {
        super.onCleared()
        player?.release()
    }


        fun initializeExoPlayer(context: Context){
            if(player == null){
                player = ExoPlayer.Builder(context).build()
            }
        }
}