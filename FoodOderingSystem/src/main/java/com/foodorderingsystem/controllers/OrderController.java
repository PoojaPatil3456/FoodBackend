package com.foodorderingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.service.OrderService;
import java.util.List;
@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:4200")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/addOrder")
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
	@GetMapping("/getAllOrders")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}
	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable String id) {
		orderService.deleteOrder(id);
	}
}
