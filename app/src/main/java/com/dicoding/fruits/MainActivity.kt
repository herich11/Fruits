package com.dicoding.fruits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.fruits.about.About
import com.dicoding.fruits.fruits.Fruits
import com.dicoding.fruits.fruits.FruitsAdapter
import com.dicoding.fruits.`object`.FruitsData

class MainActivity : AppCompatActivity() {

    private lateinit var rvFruits: RecyclerView
    private var list: ArrayList<Fruits> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Fruits"

        rvFruits = findViewById(R.id.rv_fruits)
        rvFruits.setHasFixedSize(true)

        list.addAll(FruitsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvFruits.layoutManager = LinearLayoutManager(this)
        val fruitsAdapter = FruitsAdapter(list)
        rvFruits.adapter = fruitsAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.myProfile -> {
                val iAbout = Intent(this@MainActivity, About::class.java)
                startActivity(iAbout)
            }
        }
    }
}