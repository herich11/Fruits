package com.dicoding.fruits.about

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.fruits.R


class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val fImage: ImageView = findViewById(R.id.img_fruits_image)
        val imgUrl = "https://photos.google.com/album/AF1QipMvZgm9gV6J9wu4-MHk_rWcX02KUNHGTkSRayXC/photo/AF1QipNkFijSjFxDfT4ASlNbbaphFbmhYuYp_CphdKg1"

        Glide.with(this)
            .load(imgUrl)
            .placeholder(R.drawable.heri)
            .apply(RequestOptions())
            .into(fImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}