package com.example.shakyouofbasicsample.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shakyouofbasicsample.model.Comment
import java.util.Date

@Entity(tableName = "comments")
data class CommentEntity(
    @PrimaryKey
    override var id: Int,
    override var productId: Int,
    override var text: String,
    override var postedAt: Date
) : Comment