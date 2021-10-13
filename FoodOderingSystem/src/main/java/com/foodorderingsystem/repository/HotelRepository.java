package com.foodorderingsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodorderingsystem.bean.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {

	Hotel findByName(String name);
	
}
