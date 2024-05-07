package com.example.soxios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeVentasActivity : AppCompatActivity() {
    private val categories = listOf(
        TaskCategory.Baleta,
        TaskCategory.Beisbolera,
        TaskCategory.Larga,
        TaskCategory.Tobillera
    )
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_ventas)
        initComponent()
        initUI()
    }
    private fun initComponent(){
        rvCategories = findViewById(R.id.rvCategories)
    }
    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvCategories.adapter = categoriesAdapter
    }
}