package com.example.shakyouofbasicsample.db.entity

import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.shakyouofbasicsample.model.Comment
import java.util.Date


class CommentEntity() : Comment {
    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0

    override fun getId(): Int = _id
    fun setId(id: Int) {
        this._id = id
    }

    var _productId: Int = 0
    override fun getProductId(): Int = _productId
    fun setProductId(productId: Int) {
        this._productId = productId
    }

    var _text: String = ""
    override fun getText(): String {
        return _text
    }

    fun setText(text: String) {
        this._text = text
    }

    var _postedAt: Date? = null
    override fun getPostedAt(): Date {
        return _postedAt!!
    }

    fun setPostedAt(postedAt: Date) {
        this._postedAt = postedAt
    }

    @Ignore
    @SuppressWarnings("unused")
    constructor(id: Int, productId: Int, text: String, postedAt: Date) : this() {
        this._id = id
        this._productId = productId
        this._text = text
        this._postedAt = postedAt
    }
}