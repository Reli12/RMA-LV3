package com.example.todo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*dodana lista taskova*/
        val datSet= DataSource().loadTasks()

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter=TaskAdapter(this,datSet)
    }
}