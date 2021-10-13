package com.foodorderingsystem.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.foodorderingsystem.bean.Food;
import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.service.FoodService;
import com.foodorderingsystem.service.ImageHandlingService;
import com.foodorderingsystem.service.OrderService;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	FoodService foodService;
	@Autowired
	ImageHandlingService imageService;
	
	@PostMapping("/addFoodItem")
	public void addFoodItem(@RequestBody Food food) {
		foodService.addFoodItem(food);
	}
	
	@GetMapping("/getAllFood")
	public List<Food> getAllFoodItem() {
		return foodService.getAllFoodItem();
	}
	
	@GetMapping("/getFoodByType/{type}")
	public List<Food> getFoodByType(@PathVariable String type) {
		return foodService.getFoodByType(type);
	}
	
	@PostMapping("/upload")
	public String uploadImgage(@RequestParam("file") MultipartFile multipartFile) {
		return imageService.upload(multipartFile);
	}
}
