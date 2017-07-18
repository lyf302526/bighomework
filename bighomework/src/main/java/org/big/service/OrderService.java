package org.big.service;

import java.util.List;

import org.big.domain.Order;

public interface OrderService {
	int addorder(Order order);
	int deleteorder(Order order);
	List<Order> getAll();
	Order selectOrder(int id);
	void updateOrder(String state,int id);
}