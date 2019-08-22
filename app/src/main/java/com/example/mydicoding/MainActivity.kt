package com.example.mydicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView





class MainActivity : AppCompatActivity() {
    private lateinit var rvMain: RecyclerView
    private var list: ArrayList<Resep> = arrayListOf()
    val posNow : Int = 0
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

        listResepAdapter.setOnItemClickCallback(object : ListResepAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Int) {
                selectedResep(data)
            }
        })
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
    private fun selectedResep(pos: Int) {
        val goDetail = Intent(this@MainActivity, resepDetail::class.java)
        goDetail.putExtra("posNow", pos)
        startActivity(goDetail)
    }
}
