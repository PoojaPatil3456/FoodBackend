package com.foodorderingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void addOrder(Order order) {
		 orderRepository.save(order);
	}
	public List<Order> getOrders() {
		return orderRepository.findAll();
				 
	}
	public void deleteOrder(String id) {
		orderRepository.deleteById(id);
	}
}
