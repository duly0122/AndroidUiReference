package com.mgsys.app_service.androiduireference02.listview

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.mgsys.app_service.androiduireference02.R
import com.mgsys.app_service.androiduireference02.databinding.ActivityListViewBinding

class Formatted01ListActivity : AppCompatActivity() {
    private lateinit var bindListView: ActivityListViewBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindListView = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(bindListView.root)

        val listView = bindListView.listView

        val dateTime = System.currentTimeMillis()

        val listItems = listOf(
            Formatted01Item(R.drawable.cup, dateTime,"RRSP",1000f, 500.0f, 500.00f),
            Formatted01Item(R.drawable.cross_circle, dateTime,"TFSA",2100.0f, 100.0f, 2000.00f),
            Formatted01Item(R.drawable.delete, dateTime,"CASH",1500.0f, 500.0f, 1000.0f)
        )

        val adapter = Formatted01ListAdapter(this, listItems)
        listView.adapter = adapter
    }
}