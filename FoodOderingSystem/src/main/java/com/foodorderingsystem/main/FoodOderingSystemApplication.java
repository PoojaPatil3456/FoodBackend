package com.foodorderingsystem.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan("com.foodorderingsystem")
@EnableMongoRepositories(basePackages = "com.foodorderingsystem.repository")
@SpringBootApplication
public class FoodOderingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOderingSystemApplication.class, args);
	}

}
