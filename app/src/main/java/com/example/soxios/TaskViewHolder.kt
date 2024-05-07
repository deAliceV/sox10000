package com.example.soxios

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvTaskName:TextView = view.findViewById(R.id.tvTaskName)
    private val card:CardView = view.findViewById(R.id.card)
    private val cardB:CardView = view.findViewById(R.id.cardB)
    private val divider2:View = view.findViewById(R.id.divider2)
    val backgroundImage:ImageView =view.findViewById(R.id.backgroundImage)
    fun render(task: Task){
        when(task){

            Task.Compras -> {
                tvTaskName.text = "Compras"
                card.setCardBackgroundColor(
                        ContextCompat.getColor(card.context, R.color.background)
                        )
                cardB.setOnClickListener{
                    val intentC = Intent(itemView.context, HomeActivity::class.java)
                    itemView.context.startActivity(intentC)
                }
                backgroundImage.setImageResource(R.drawable.img_6)
                divider2.setBackgroundColor(
                    ContextCompat.getColor(divider2.context, R.color.background)
                )

            }
            Task.Ventas -> {
                tvTaskName.text = "Ventas"
                divider2.setBackgroundColor(
                    ContextCompat.getColor(divider2.context, R.color.purple_200)
                )
                card.setCardBackgroundColor(
                    ContextCompat.getColor(card.context, R.color.background)
                )
                cardB.setOnClickListener{
                    val intentV = Intent(itemView.context, HomeVentasActivity::class.java)
                    itemView.context.startActivity(intentV)
                }
                backgroundImage.setImageResource(R.drawable.img_4)
            }
        }
    }
}