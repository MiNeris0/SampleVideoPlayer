package com.example.samplevideoplayer

import android.R
import android.net.Uri
import android.net.Uri.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.os.Bundle
import com.example.samplevideoplayer.databinding.ActivityMainBinding
import android.widget.VideoView
import android.widget.MediaController

private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.videoView.id)
        // Making Media Controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri: Uri = parse("android.resource://" + packageName + "/raw/test")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}