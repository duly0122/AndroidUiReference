package com.mgsys.app_service.androiduireference02.listview

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.mgsys.app_service.androiduireference02.R
import com.mgsys.app_service.androiduireference02.type.DateTimeDisplayFormat
import java.text.SimpleDateFormat
import java.util.Date

data class Formatted01Item(val icon: Int, val datetime: Long, val account: String, val totalInvested: Float, val cashBalance: Float, val investment: Float)

class Formatted01ListAdapter(private val context: Context, private val items: List<Formatted01Item>) :
    ArrayAdapter<Formatted01Item?>(context, 0, items) {

        @RequiresApi(Build.VERSION_CODES.O)
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var view = convertView
            if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.item_formatted, parent, false)
            }

            val item = items[position]

            view!!.findViewById<ImageView>(R.id.ui_icon).apply {
                setImageResource(item.icon)
            }

            view.findViewById<TextView>(R.id.ui_datetime).apply {
                text = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date(item.datetime))
            }

            view.findViewById<TextView>(R.id.ui_top_text).apply {
                text = String.format("%s, Total: %.2f", item.account, item.totalInvested)
            }

            view.findViewById<TextView>(R.id.ui_bottom_text).apply {
                text = String.format("Cash Balance: %.2f, Investment: %.2f", item.cashBalance, item.investment)
            }


            return view
        }
}