package com.example.flowersdel.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flowersdel.data.Flower
import com.example.flowersdel.data.FlowerRepository
import kotlinx.coroutines.launch
import androidx.lifecycle.asLiveData


class FlowerViewModel(private val repository: FlowerRepository) : ViewModel() {

    // LiveData to observe flower data
    val allFlowers = repository.allFlowers;

    fun addFlower(flower: Flower) = viewModelScope.launch {
        repository.addFlower(flower)
    }

    fun updateFlower(flower: Flower) = viewModelScope.launch {
        repository.updateFlower(flower)
    }

    fun deleteFlower(flower: Flower) = viewModelScope.launch {
        repository.deleteFlower(flower)
    }

    fun getFlowerById(flowerId: Int): LiveData<Flower> = repository.getFlowerById(flowerId).asLiveData()
}
