package com.foodorderingsystem.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodorderingsystem.bean.Food;

@Repository
public interface FoodRepository extends MongoRepository<Food,String> {

	List<Food> findByType(String type);
}
