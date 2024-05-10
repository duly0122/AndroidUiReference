package com.mgsys.app_service.androiduireference.listview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mgsys.app_service.androiduireference.R
import com.mgsys.app_service.androiduireference.databinding.ActivityListViewBinding

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