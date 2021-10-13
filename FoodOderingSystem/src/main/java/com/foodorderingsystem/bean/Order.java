package com.foodorderingsystem.bean;

import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order")
public class Order {

	@Id
	public String id;
	private String userEmail;
	private List<Food> foodList;
	private Map<String,String> quantity;
	private double price;



	public Order(String userEmail, List<Food> foodList, Map<String, String> quantity, double price) {
		this.userEmail = userEmail;
		this.foodList = foodList;
		this.quantity = quantity;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Map<String,String> getQuantity() {
		return quantity;
	}

	public void setQuantity(Map<String,String> quantity) {
		this.quantity = quantity;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
}
