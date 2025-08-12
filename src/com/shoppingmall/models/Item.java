package com.shoppingmall.models;

import java.io.Serializable;

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

//	"P"+String.format("%4d", idNum);

	public String getItemID() {
		return itemID;
	}

	public Item(String description) {
		this.description = description;
	}

	public Item(String name, String category, int price, int quantity, String description) {
		itemID = "P" + String.format("%40d", idNum);
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
		this.price *= offRate;
		return this.price;
	}

	@Override
	public String toString() {
		return String.format("%s", name);
	}

}
