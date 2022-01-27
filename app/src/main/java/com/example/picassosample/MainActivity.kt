package com.example.picassosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.picassosample.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            load()
        }
    }

    private fun load() {
        Picasso.get()
            .load("https://avatars.githubusercontent.com/u/72326299?v=4")
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.imageView)
    }
}