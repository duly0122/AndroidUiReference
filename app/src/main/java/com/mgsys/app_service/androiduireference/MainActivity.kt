package com.mgsys.app_service.androiduireference

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mgsys.app_service.androiduireference.databinding.ActivityMainBinding
import com.mgsys.app_service.androiduireference.listview.Formatted01ListActivity
import com.mgsys.app_service.androiduireference.listview.IconTextListViewActivity
import com.mgsys.app_service.androiduireference.listview.SingleTextListViewActivity


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

        binding.btnSingleTextListview.setOnClickListener {
            val intent = Intent(this, SingleTextListViewActivity::class.java)
            intent.putExtra("message", "Hello from MainActivity")
            startActivity(intent)
        }

        binding.btnIconTextListview.setOnClickListener {
            val intent = Intent(this, IconTextListViewActivity::class.java)
            startActivity(intent)
        }

        binding.btnFormattedListview.setOnClickListener {
            val intent = Intent(this, Formatted01ListActivity::class.java)
            startActivity(intent)
        }

    }
}