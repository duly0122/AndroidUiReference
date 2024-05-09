package com.mgsys.app_service.androiduireference02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.mgsys.app_service.androiduireference02.databinding.ActivityMainBinding
import com.mgsys.app_service.androiduireference02.listview.IconTextListViewActivity
import com.mgsys.app_service.androiduireference02.listview.SingleTextListViewActivity


class MainActivity : AppCompatActivity() {

    //private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonClickEvents()
    }

    private fun buttonClickEvents() {
        //val btnSingleTextList = findViewById<Button>(R.id.btn_single_text_listview)
        //val btnSingleTextList = binding.btnSingleTextListview

        binding.btnSingleTextListview.setOnClickListener {
            val intent = Intent(this, SingleTextListViewActivity::class.java)
            intent.putExtra("message", "Hello from MainActivity")
            startActivity(intent)
        }

        binding.btnIconTextListview.setOnClickListener {
            val intent = Intent(this, IconTextListViewActivity::class.java)
            startActivity(intent)
        }

    }
}