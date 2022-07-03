package com.meltingb.recyclerview_sample

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostListAdapter(var postList: List<PostDTO>): RecyclerView.Adapter<PostItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostItemViewHolder {
        return PostItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: PostItemViewHolder, position: Int) {
        postList[position].let { post ->
            with(holder) {
                setPost(post)
                cbScrap.setOnClickListener {
                    post.isScrap = cbScrap.isChecked
                    notifyItemChanged(position)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return postList.size // 게시물 수 만큼 리스트를 보여주기 위해 size를 반환한다
    }
}