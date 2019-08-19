package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.view.Window
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_image_detail.*

class ImageDetail : AppCompatActivity() {
    companion object {
        const val ITEM_KEY = "IMAGE_ITEM"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Fade()
        window.exitTransition = Fade()

        setContentView(R.layout.activity_image_detail)



        val imageItem = intent.getSerializableExtra(ITEM_KEY) as ImageItem

        detail_image.setImageDrawable(ContextCompat.getDrawable(this, imageItem.imageID))
        detail_name.text = imageItem.imageName
    }



}
