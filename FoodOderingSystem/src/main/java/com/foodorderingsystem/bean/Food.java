package com.foodorderingsystem.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "food")
public class Food {
	
	@Id
	private String id;
	private String name;
	private String type;
	private String description;
	private float price;
	private String imgPath = null;
	
	public Food(String name, String type, String description, float price,String imgPath) {
		this.name = name;
		this.type = type;
		this.setDescription(description);
		this.price = price;
		this.imgPath = imgPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
