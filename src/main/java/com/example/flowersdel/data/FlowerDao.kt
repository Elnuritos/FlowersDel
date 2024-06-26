package com.example.flowersdel.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface FlowerDao {
    @Insert
    fun insertFlower(flower: Flower)

    @Update
    fun updateFlower(flower: Flower)

    @Delete
    fun deleteFlower(flower: Flower)

    @Query("SELECT * FROM flowers")
    fun getAllFlowers(): Flow<List<Flower>>

    @Query("SELECT * FROM flowers WHERE id = :flowerId")
    fun getFlowerById(flowerId: Int): Flower
}
