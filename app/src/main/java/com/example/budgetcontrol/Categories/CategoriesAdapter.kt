package com.example.budgetcontrol.Categories

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.budgetcontrol.R
import kotlinx.android.synthetic.main.activity_textview_forrecycleview.view.*

class CategoriesAdapter(private val callback: (Int) -> Unit): RecyclerView.Adapter<CategoriesHolder>() {

    private val categories: MutableList<String> = mutableListOf()

    override fun onBindViewHolder(holder: CategoriesHolder, position: Int) {
        holder.bind(categories[position])
        holder.itemView.setOnClickListener{
            callback(position)
        }
    }

    override fun getItemCount(): Int = categories.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CategoriesHolder =
        CategoriesHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.activity_textview_forrecycleview,
                parent,
                false
            )
        )

    fun setCategories(categories:List<String>) {
        this.categories.addAll(categories)
        notifyDataSetChanged()
    }

    fun add(category: String) {
        categories.add(category)
        notifyDataSetChanged()
    }
}

class CategoriesHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(name: String) {
        itemView.nameTV.text = name
    }
}