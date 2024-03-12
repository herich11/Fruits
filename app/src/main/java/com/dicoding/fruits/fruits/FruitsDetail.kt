package com.dicoding.fruits.fruits

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fruits.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FruitsDetail : AppCompatActivity() {
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_SPECIES = "extra_species"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_OVERVIEW = "extra_overview"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_fruits_detail)

        val actionbar = supportActionBar
        actionbar!!.title = "Fruits Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvNameDetail: TextView = findViewById(R.id.tv_fruits_name)
        val ivImageDetail: ImageView = findViewById(R.id.img_fruits_image)
        val tvSpeciesDetail: TextView = findViewById(R.id.tv_fruits_species)
        val tvSetDetail: TextView = findViewById(R.id.tv_fruits_detail)
        val tvOverview: TextView = findViewById(R.id.tv_fruits_overview)

        val dataName = intent.getStringExtra(EXTRA_NAME)
        val dataImage = intent.getIntExtra(EXTRA_IMAGE, 0)
        val dataSpecies = intent.getStringExtra(EXTRA_SPECIES)
        val dataDetail = intent.getStringExtra(EXTRA_DETAIL)
        val dataOverview = intent.getStringExtra(EXTRA_OVERVIEW)

        tvNameDetail.text = dataName
        Glide.with(this)
            .load(dataImage)
            .apply(RequestOptions())
            .into(ivImageDetail)
        tvSpeciesDetail.text = dataSpecies
        tvSetDetail.text = dataDetail
        tvOverview.text = dataOverview
    }
    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}