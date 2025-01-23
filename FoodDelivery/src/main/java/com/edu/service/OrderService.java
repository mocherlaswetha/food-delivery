package com.edu.service;
import java.util.List;
import com.edu.dao.Order;



public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    void deleteOrder(Long id);
}

