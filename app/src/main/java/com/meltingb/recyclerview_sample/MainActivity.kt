package com.meltingb.recyclerview_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.*
import com.meltingb.recyclerview_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val postList = setSampleList()
        val postAdapter = PostListAdapter(postList)

        binding.rvPost.apply {
            adapter = postAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun setSampleList(): List<PostDTO> {
        val sampleList = mutableListOf<PostDTO>()
        for (i in 1..15) {
            sampleList.add(
                PostDTO(
                    "https://picsum.photos/id/${i * 3}/200/300",
                    "RecyclerView 게시글 ${i}번",
                    "닉네임 $i",
                    Random().nextInt(9999),
                    Random().nextInt(9999),
                    i % 3 == 0
                )
            )
        }
        return sampleList
    }

}