package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ImageListAdapter(ImageRepo.createImageList())
        list_view.layoutManager = manager
        list_view.adapter = adapter



    }


}
