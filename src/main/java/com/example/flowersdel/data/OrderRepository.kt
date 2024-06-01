package com.example.flowersdel.data

class OrderRepository(private val orderDao: OrderDao) {
    val allOrders = orderDao.getAllOrders()

    suspend fun addOrder(order: Order) {
        orderDao.insertOrder(order)
    }

    suspend fun updateOrder(order: Order) {
        orderDao.updateOrder(order)
    }

    suspend fun deleteOrder(order: Order) {
        orderDao.deleteOrder(order)
    }

    fun getOrderById(orderId: Int): Order {
        return orderDao.getOrderById(orderId)
    }

    fun getOrdersByUser(userId: Int): List<Order> {
        return orderDao.getOrdersByUser(userId)
    }
}