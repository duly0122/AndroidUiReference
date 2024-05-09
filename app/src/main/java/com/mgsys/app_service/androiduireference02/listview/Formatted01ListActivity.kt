package com.mgsys.app_service.androiduireference02.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mgsys.app_service.androiduireference02.R
import com.mgsys.app_service.androiduireference02.databinding.ActivityListViewBinding

class Formatted01ListActivity : AppCompatActivity() {
    private lateinit var bindListView: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindListView = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(bindListView.root)
    }
}