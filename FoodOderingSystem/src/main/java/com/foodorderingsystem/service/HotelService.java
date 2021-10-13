package com.foodorderingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import com.foodorderingsystem.bean.Food;
import com.foodorderingsystem.bean.Hotel;
import com.foodorderingsystem.bean.Order;
import com.foodorderingsystem.repository.FoodRepository;
import com.foodorderingsystem.repository.HotelRepository;
import com.foodorderingsystem.repository.OrderRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public void addHotel(Hotel hotel) {
		 Hotel responce = hotelRepository.save(hotel);
	}
	
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}
	
	public Hotel getHotelByName(String name) {
		return hotelRepository.findByName(name);
	}
}
