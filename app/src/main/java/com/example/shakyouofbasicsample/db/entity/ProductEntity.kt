package com.example.shakyouofbasicsample.db.entity

import androidx.room.PrimaryKey
import com.example.shakyouofbasicsample.model.Product

class ProductEntity(
    @PrimaryKey
    override var id: Int,
    override var name: String,
    override var description: String,
    override var price: Int
) : Product