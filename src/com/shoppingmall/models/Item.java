package com.shoppingmall.models;

import java.io.Serializable;

public class Item implements Serializable {


	private static final long serialVersionUID = 1L;
	private String itemID;
	private String name;
	private String category;
	private int price;
	private int quantity;
	private String prodDesc;
	private static int idNum = 1;

//	"P"+String.format("%4d", idNum);

	public String getItemID() {
		return itemID;
	}

	public Item(String name, String category, int price, int quantity, String prodDesc) {
		itemID = "P" + String.format("%40d", idNum);
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.prodDesc = prodDesc;
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

	public String getProdDesc() {
		return prodDesc;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + ", prodDesc=" + prodDesc + "]";
	}
	
	

}
