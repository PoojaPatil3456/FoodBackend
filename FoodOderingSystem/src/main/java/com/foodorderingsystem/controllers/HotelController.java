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
import com.foodorderingsystem.bean.Hotel;
import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.service.FoodService;
import com.foodorderingsystem.service.HotelService;
import com.foodorderingsystem.service.ImageHandlingService;
import com.foodorderingsystem.service.OrderService;

@RestController
@RequestMapping("/hotel")
@CrossOrigin("http://localhost:4200")
public class HotelController {

	@Autowired
	HotelService hotelService;
	@Autowired
	ImageHandlingService imageService;
	
	@PostMapping("/addHotel")
	public void addFoodItem(@RequestBody Hotel hotel) {
		hotelService.addHotel(hotel);
	}
	
	@GetMapping("/getAllHotels")
	public List<Hotel> getAllHotels() {
		return hotelService.getAllHotels();
	}
	
	@GetMapping("/getHotelByName/{name}")
	public Hotel getHotelByName(@PathVariable String name) {
		return hotelService.getHotelByName(name);
	}
	@PostMapping("/upload")
	public String uploadImgage(@RequestParam("file") MultipartFile multipartFile) {
		return imageService.upload(multipartFile);
	}
}
