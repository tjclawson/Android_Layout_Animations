package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageDetail : AppCompatActivity() {
    companion object {
        const val ITEM_KEY = "IMAGE_ITEM"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)
    }
}
