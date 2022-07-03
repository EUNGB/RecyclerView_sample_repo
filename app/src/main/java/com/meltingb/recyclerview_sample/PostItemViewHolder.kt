package com.meltingb.recyclerview_sample

import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PostItemViewHolder(private val parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    val tvNickname: TextView = itemView.findViewById(R.id.tvNickname)
    val tvViewCount: TextView = itemView.findViewById(R.id.tvViewCount)
    val tvScrap: TextView = itemView.findViewById(R.id.tvScrap)
    val cbScrap: CheckBox = itemView.findViewById(R.id.cbScrap)

    fun setPost(post: PostDTO) {
        imageView.clipToOutline = true // 라운드 처리
        Glide.with(parent.context).load(Uri.parse(post.imageUri)).centerCrop().into(imageView)
        tvTitle.text = post.title
        tvNickname.text = post.nickname
        tvViewCount.text = post.viewCount.toString()
        tvScrap.text = post.scrapCount.toString()
        cbScrap.isChecked = post.isScrap
    }
}