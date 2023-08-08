package com.example.messageshareapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_demo)
        val hobbiesList = findViewById<RecyclerView>(R.id.recyclerViewHobbies)
        hobbiesList.adapter = HobbiesAdapter(Supplier.hobbies)
        hobbiesList.layoutManager = LinearLayoutManager(this)


    }
}