package com.meltingb.recyclerview_sample

/**
 * 게시물 데이터 모델
 */
data class PostDTO(
    val imageUri: String,   // 대표이미지 URI
    val title: String,      // 게시물 제목
    val nickname: String,   // 작성자 닉네임
    val viewCount: Int,     // 조회수
    val scrapCount: Int,    // 스크랩 수
    var isScrap: Boolean    // 스크랩 여부
)
