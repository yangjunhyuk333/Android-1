package com.example.hischool.data

data class FeedRecyclerViewData (
    val profile : Int,
    val nickname : String,
    val time : String,
    val title : String,
    val question : String,
    val count_heart : Int,
    val count_message : Int
)