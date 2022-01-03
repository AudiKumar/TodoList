package com.adityakumar.todolist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoListVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var rvItemNumTextView = itemView.findViewById<TextView>(R.id.itemNum)
    var rvTitleTextView = itemView.findViewById<TextView>(R.id.itemStr)
}