package com.example.mydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView





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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.aboutMenu -> {
            }

        }
    }
}
