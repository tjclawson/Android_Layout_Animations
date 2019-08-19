package com.example.galleryapp

import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

class Animation {
    companion object {
        fun setEnterAnimation(viewToAnimate: View) {
            val animation: Animation = AnimationUtils.loadAnimation(viewToAnimate.context, R.anim.abc_slide_in_bottom)
            viewToAnimate.startAnimation(animation)
        }
    }
}