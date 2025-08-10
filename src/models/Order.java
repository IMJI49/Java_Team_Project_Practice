package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String orderId;              // 주문 ID
    private Customer customer;           // 주문 고객
    private ArrayList<CartItem> items;   // 주문 상품들
    private LocalDateTime orderDate;     // 주문일시
    private int totalAmount;            // 총 주문금액
    private String status;              // 주문 상태
    
    
    public void updateStatus(String newStatus) {
		this.status = newStatus;
	}
    
	public int getTotalAmount() {
		int totalAmount = 0;
		
		for(CartItem item: items) {
			totalAmount = item.getTotalPrice();
		}
    	return totalAmount;
	}
       
    

	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public ArrayList<CartItem> getItems() {
		return items;
	}


	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public String getStatus() {
		return status;
	}


    
    
    
    
}
