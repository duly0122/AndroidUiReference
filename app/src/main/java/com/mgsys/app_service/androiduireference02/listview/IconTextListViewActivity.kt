package com.mgsys.app_service.androiduireference02.listview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mgsys.app_service.androiduireference02.R
import com.mgsys.app_service.androiduireference02.databinding.ActivityListViewBinding

class IconTextListViewActivity : AppCompatActivity() {
    private lateinit var bindListView: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindListView = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(bindListView.root)

        val listView = bindListView.listView

        val listItems = listOf(
            IconTextItem(R.drawable.cup, "Home"),
            IconTextItem(R.drawable.cross_circle, "Settings"),
            IconTextItem(R.drawable.delete, "Help")
        )

        val adapter = IconTextListAdapter(this, listItems)
        listView.adapter = adapter
    }
}