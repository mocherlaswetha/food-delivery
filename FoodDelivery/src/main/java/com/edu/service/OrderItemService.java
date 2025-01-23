package com.edu.service;

import java.util.List;

import com.edu.dao.OrderItem;

public interface OrderItemService {

	OrderItem createOrderItem(OrderItem orderItem);

	OrderItem getOrderItemById(Long id);

	List<OrderItem> getAllOrderItems();

	void deleteOrderItem(Long id);

}
