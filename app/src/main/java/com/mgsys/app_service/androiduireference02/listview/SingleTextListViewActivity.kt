package com.mgsys.app_service.androiduireference02.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.mgsys.app_service.androiduireference02.R
import com.mgsys.app_service.androiduireference02.databinding.ActivityListViewBinding
import com.mgsys.app_service.androiduireference02.databinding.ActivityMainBinding

class SingleTextListViewActivity : AppCompatActivity() {
    private lateinit var listViewBinding: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        listViewBinding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(listViewBinding.root)

        //val listView = findViewById<ListView>(R.id.list_view)

        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        listViewBinding.listView.adapter = adapter
    }
}