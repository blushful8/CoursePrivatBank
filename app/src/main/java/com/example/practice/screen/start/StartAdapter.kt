package com.example.practice.screen.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R
import com.example.practice.model.nal.NalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var startList = emptyList<NalItem>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = startList[position].ccy
        holder.itemView.item_buy.text = startList[position].buy
        holder.itemView.item_sale.text = startList[position].sale

    }

    override fun getItemCount(): Int {
        return startList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NalItem>){
    startList = list
        notifyDataSetChanged()
    }
}