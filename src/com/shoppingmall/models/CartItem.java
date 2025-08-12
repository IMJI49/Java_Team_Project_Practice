package com.shoppingmall.models;


public class CartItem {
	/*
	 * 변수 작성 및 생성자 생성
	 * 수량 증감
	 * 총액 계산
	 * getter 생성
	 * 
	 */
	private Item item;
	private int quantity;
	
	public CartItem(Item item, int quantity) {
		//super();
		this.item = item;
		this.quantity = quantity;
	}
	
	public void addQuantity(int amount) {
		quantity += amount;
	}
	
	public void reduceQuantity(int amount) {
		quantity -= amount;
	}
	
	public int getTotalPrice() {
		return item.getPrice() * this.quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [item=" + item + ", quantity=" + quantity + "]";
	}
}

	
