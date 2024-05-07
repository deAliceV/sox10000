package com.example.soxios

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
    fun render(taskCategory: TaskCategory){
        when(taskCategory){

            TaskCategory.Baleta -> {
                tvCategoryName.text = "Baleta"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.background)
                )
            }
            TaskCategory.Beisbolera -> {
                tvCategoryName.text = "Beisbolera"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.purple_200)
                )
            }
            TaskCategory.Larga -> {
                tvCategoryName.text = "Larga"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.white)
                )
            }
            TaskCategory.Tobillera -> {
                tvCategoryName.text = "Tobillera"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.teal_200)
                )
            }
        }
    }
}