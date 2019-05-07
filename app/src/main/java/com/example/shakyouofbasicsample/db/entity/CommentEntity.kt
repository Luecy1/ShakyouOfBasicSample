package com.example.shakyouofbasicsample.db.entity

import com.example.shakyouofbasicsample.model.Comment
import java.util.Date

data class CommentEntity(
    override var id: Int,
    override var productId: Int,
    override var text: String,
    override var postedAt: Date
) : Comment