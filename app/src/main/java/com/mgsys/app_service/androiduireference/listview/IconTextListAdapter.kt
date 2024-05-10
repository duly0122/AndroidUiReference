package com.mgsys.app_service.androiduireference.listview

//import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mgsys.app_service.androiduireference.R

data class IconTextItem(val icon: Int, val text: String)

class IconTextListAdapter(private val context: Context, private val items: List<IconTextItem>) :
    ArrayAdapter<IconTextItem?>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_image_text, parent, false)
        }

        val item = items[position]

        val imageView = view!!.findViewById<ImageView>(R.id.icon)
        imageView.setImageResource(item.icon)

        val textView = view.findViewById<TextView>(R.id.text)
        textView.setText(item.text)

        return view
    }
}