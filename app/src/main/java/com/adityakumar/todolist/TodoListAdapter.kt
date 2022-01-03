package com.adityakumar.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter : RecyclerView.Adapter<TodoListVH>() {

    private val todoLists = arrayOf("Android Development","Errands" ,"House Work", "Shopping")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_list_item_view_holder, parent, false)
        return TodoListVH(view)
    }

    override fun onBindViewHolder(holder: TodoListVH, position: Int) {
        holder.rvItemNumTextView.text = (position + 1).toString()
        holder.rvTitleTextView.text = todoLists[position]
    }

    override fun getItemCount(): Int {
        return todoLists.size
    }
}