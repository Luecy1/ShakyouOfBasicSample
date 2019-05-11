package com.example.shakyouofbasicsample.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shakyouofbasicsample.db.entity.ProductEntity

@Dao
open interface ProductDao {

    @Query("SELECT * FROM products")
    fun loadAllProducts(): LiveData<List<ProductEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(productId: Int): Void

    @Query("SELECT * FROM products where id = :productId")
    fun loadProduct(productId: Int): LiveData<ProductEntity>

    @Query("SELECT * FROM products where id = :productId")
    fun loadProductSync(productId: Int): ProductEntity

    @Query(
        """
            SELECT products.* FROM products JOIN productsFts on (products.id = productsFts.rowid)
             WHERE productsFts MATCH :query"""
    )
    fun searchAllProducts(query: String): LiveData<List<ProductEntity>>
}