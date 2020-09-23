package com.example.hischool.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hischool.R
import com.example.hischool.data.FeedRecyclerViewData

class FeedAdapter(val feedList : ArrayList<FeedRecyclerViewData>) : RecyclerView.Adapter<FeedAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feed_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return feedList.size
    }

    override fun onBindViewHolder(holder: FeedAdapter.ViewHolder, position: Int) {
        holder.profile.setImageResource(feedList.get(position).profile)
        holder.nickname.text = feedList.get(position).nickname
        holder.time.text = feedList.get(position).time
        holder.title.text = feedList.get(position).title
        holder.question.text = feedList.get(position).question
        holder.count_heart.text = feedList.get(position).count_heart.toString()
        holder.count_message.text = feedList.get(position).count_message.toString()
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val profile = itemView.findViewById<ImageView>(R.id.feed_profile_image)
        val nickname = itemView.findViewById<TextView>(R.id.feed_name_text)
        val time = itemView.findViewById<TextView>(R.id.feed_time_text)
        val title = itemView.findViewById<TextView>(R.id.feed_title_text)
        val question = itemView.findViewById<TextView>(R.id.feed_question_text)
        val count_heart = itemView.findViewById<TextView>(R.id.feed_count_heart_text)
        val count_message = itemView.findViewById<TextView>(R.id.feed_count_message_text)
    }
}