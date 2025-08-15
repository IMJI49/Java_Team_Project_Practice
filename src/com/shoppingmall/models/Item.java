package com.shoppingmall.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String itemID;
	private String name;
	private String category;
	private int price;
	private int quantity;
	private String description;
	private static int idNum = 1;
	private ArrayList<String> review;

//	"P"+String.format("%4d", idNum);

	public String getItemID() {
		return itemID;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(String description) {
		this.description = description;
	}

	public Item(String name, String category, int price, int quantity, String description) {
		itemID = "P" + String.format("%08d", idNum);
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		idNum++;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public boolean productStock(int quantity) {
		this.quantity += quantity;
		return true;
	}

	public int discount(double offRate) {
		this.price *= (1-offRate);
		return this.price;
	}
	
	public void reviewing(String review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return String.format("%s", name);
	}

}