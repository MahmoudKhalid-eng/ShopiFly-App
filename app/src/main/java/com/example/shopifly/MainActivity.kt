package com.example.shopifly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataset = DataResource().allLaptops()
        val rec = findViewById<RecyclerView>(R.id.laprec)
        val ad = TheAdapter(this,dataset)
        rec.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rec.adapter = ad
        rec.setHasFixedSize(true)


        val dataset2 = DataResource().allMobiles()
        val rec2 = findViewById<RecyclerView>(R.id.mobrec)
        val ad2 = TheAdapter(this,dataset2)
        rec2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rec2.adapter = ad2
        rec2.setHasFixedSize(true)

        val dataset3 = DataResource().allCams()
        val rec3 = findViewById<RecyclerView>(R.id.camrec)
        val ad3 = TheAdapter(this,dataset3)
        rec3.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rec3.adapter = ad3
        rec3.setHasFixedSize(true)
    }
}