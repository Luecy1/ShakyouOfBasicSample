package com.example.shakyouofbasicsample.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shakyouofbasicsample.model.Comment

@Dao
interface CommentDao {

    @Query("SELECT * FROM comments WHERE productId = :productId")
    fun loadComments(productId: Int): LiveData<List<Comment>>

    @Query("SELECT * FROM comments WHERE productId = :productId")
    fun loadCommentsSync(productId: Int): List<Comment>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(commnents: List<Comment>)

}