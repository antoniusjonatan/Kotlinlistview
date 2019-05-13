package com.gmail.antonius1398.kotlinlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val language =
            listOf("java", "kotlin", "java", "PHP", "Python")
        listview.adapter =
                ArrayAdapter(this, simple_list_item_1, language)

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih:${language[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
