package com.example.hischool.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.hischool.R
import com.example.hischool.data.NotificationRecyclerViewData

class NotificationAdapt (val notificationList: ArrayList<NotificationRecyclerViewData>) : RecyclerView.Adapter<NotificationAdapt.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationAdapt.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notification_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    override fun onBindViewHolder(holder: NotificationAdapt.ViewHolder, position: Int) {
        holder.contents.text = notificationList.get(position).contents
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contents = itemView.findViewById<TextView>(R.id.notification_recyclerview)
    }

}