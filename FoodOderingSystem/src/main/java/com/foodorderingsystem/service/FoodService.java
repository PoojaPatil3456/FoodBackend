package com.foodorderingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import com.foodorderingsystem.bean.Food;
import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.repository.FoodRepository;
import com.foodorderingsystem.repository.OrderRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepository;
	
	public void addFoodItem(Food food) {
		 Food responce = foodRepository.save(food);
	}
	
	public List<Food> getAllFoodItem() {
		return foodRepository.findAll();
	}
	
	public List<Food> getFoodByType(String type) {
		return foodRepository.findByType(type);
	}
}
