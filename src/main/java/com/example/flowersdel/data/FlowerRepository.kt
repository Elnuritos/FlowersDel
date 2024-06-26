package com.example.flowersdel.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FlowerRepository(private val flowerDao: FlowerDao) {
    val allFlowers: Flow<List<Flower>> = flowerDao.getAllFlowers()


    suspend fun addFlower(flower: Flower) {
        flowerDao.insertFlower(flower)
    }

    suspend fun updateFlower(flower: Flower) {
        flowerDao.updateFlower(flower)
    }

    suspend fun deleteFlower(flower: Flower) {
        flowerDao.deleteFlower(flower)
    }

    fun getFlowerById(flowerId: Int): Flow<Flower> = flow {
        emit(flowerDao.getFlowerById(flowerId))
    }
}