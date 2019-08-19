package com.example.galleryapp

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.galleryapp.Animation.Companion.setAnimation
import kotlinx.android.synthetic.main.image_item_layout.view.*



class ImageListAdapter(val imageList: MutableList<ImageItem>) : RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.image_item_layout, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val image = imageList[i]

        viewHolder.name.text = image.imageName
        viewHolder.image.setImageDrawable(viewHolder.image.getContext().getDrawable(image.imageID))

        viewHolder.card.setOnClickListener{ view ->
            val intent = Intent(view.context, ImageDetail::class.java)
            intent.putExtra(ImageDetail.ITEM_KEY, image)


            //initializes transition
            view.context.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(view.context as Activity, viewHolder.image, "shared_image").toBundle())

        }

        setAnimation(viewHolder.card)


    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.image_view
        val name: TextView = view.name_view
        val card: CardView = view.card_view

    }



}
