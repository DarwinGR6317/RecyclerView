package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = arrayOf("January", "February", "March", "April","May", "June", "July")
        val customAdapter = CustomAdapter(dataset)


        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)



        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = customAdapter


    }

}
