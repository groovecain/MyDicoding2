package com.example.mydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvMain: RecyclerView
    private var list: ArrayList<Resep> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain = findViewById(R.id.rv_main)
        rvMain.setHasFixedSize(true)

        list.addAll(ResepData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList(){
        rvMain.layoutManager = LinearLayoutManager(this)
        val listResepAdapter = ListResepAdapter(list)
        rvMain.adapter = listResepAdapter
    }
}
