package com.foodorderingsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodorderingsystem.bean.Order;



@Repository
public interface OrderRepository extends MongoRepository<Order,String> {
	
    
}
