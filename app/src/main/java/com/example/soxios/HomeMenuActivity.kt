package com.example.soxios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeMenuActivity : AppCompatActivity() {
    private val task= listOf(
        Task.Compras,
        Task.Ventas

    )
    private lateinit var rvMenu: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_menu)
        initComponent()
        initUI()
    }
    private fun initComponent(){
        rvMenu = findViewById(R.id.rvMenu)
    }
    private fun initUI(){
        taskAdapter = TaskAdapter(task)
        rvMenu.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMenu.adapter = taskAdapter
    }
}