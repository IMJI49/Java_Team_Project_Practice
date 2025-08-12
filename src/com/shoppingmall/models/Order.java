package com.shoppingmall.models;

import java.time.LocalDateTime;
import java.util.List;

import com.shoppingmall.exception.ValidationException;
import com.shoppingmall.util.ValidationUtils;

public class Order {
	/*
	 * 변수 작성 및 생성자 생성
	 * 스테터스 변경 (pending , 구매확정 : 데이터에서 제품수량 줄어드는 것 염두하면서 작성, 배송 메소드 ManagerService에서 사용할 목적,
	 * 3일 지나면 자동으로 배송완료, 주문취소는 pending 상태에서만 가능하고 매니저도 주문취소 가능하지만 주사용은 고객인걸 염두하고 작성; 매니저가 취소 할 경우 고객에게 메시지 띄우기)
	 * getter 손님, 주문날짜, 총금액, 상태, 아이템,
	 * **id는 자동 생성
	 */
	
	 public enum Status { PENDING, CONFIRM, SHIPPING, DELIVERED, CANCELLED }

	    private static long orderSeq = 1;
	    private String orderId;
	    private Customer customer;
	    private LocalDateTime orderDate;
	    private Status status;
	    private List<CartItem> cartItems;
	    private int totalAmount;
	    private String shippingAddress;

	    // 생성자
	    public Order(Customer customer, List<CartItem> cartItems, String shippingAddress) {
	        this.orderId = "O" + String.format("%08d", orderSeq++);
	        this.customer = customer;
	        this.orderDate = LocalDateTime.now();
	        this.status = Status.PENDING;
	        this.cartItems = cartItems;
	        this.totalAmount = calculateTotal();
	        this.shippingAddress = (shippingAddress == null || shippingAddress.isBlank()) ? customer.getAddress() : shippingAddress; 
	    }

	    public Order(Customer customer, List<CartItem> cartItems) {
	    	this.orderId = "O" + String.format("%08d", orderSeq++);
	        this.customer = customer;
	        this.orderDate = LocalDateTime.now();
	        this.status = Status.PENDING;
	        this.cartItems = cartItems;
	        this.totalAmount = calculateTotal();
	        shippingAddress = customer.getAddress();
		}

		// 총금액 계산
	    private int calculateTotal() {
	        int sum = 0;
	        for (CartItem cartItem : cartItems) {
	            sum += cartItem.getTotalPrice();
	        }
	        return sum;
	    }
	    // for quantity 작성 i/o에서 item 받아서 validationutil에서 가져와서 하기
	    public void confirmOrder() throws ValidationException {
	        ValidationUtils.orderPendingCheck(status, "현재 상태에서는 주문 확정이 불가능합니다.");
	        // 결제로직(생략: 별도의 PaymentService에서 구현 가능)
	        status = Status.CONFIRM;

	        // 재고 차감
//	        for (CartItem cartItem : cartItems) {
//	            Item item = cartItem.getItem();
//	            if (item.getQuantity() < cartItem.getQuantity())
//	                throw new IllegalStateException(String.format("[%s] 상품의 재고가 부족합니다.", item.getName()));
//	            item.setQuantity(item.getQuantity() - cartItem.getQuantity());
//	        }
	    }
	    // 이름 님의 배송이 시작되었습니다 + ID	
	    public void startShipping() {
	        if (status != Status.CONFIRM) throw new IllegalStateException("확정된 주문만 배송을 시작할 수 있습니다.");
	        status = Status.SHIPPING;
	        System.out.printf("주문 %s의 배송이 시작되었습니다.%n", orderId);
	    }

	    public void completeDelivery() {
	        if (status != Status.SHIPPING) throw new IllegalStateException("배송 중 상태에서만 배송 완료가 가능합니다.");
	        status = Status.DELIVERED;
	        System.out.printf("주문 %s의 배송이 완료되었습니다.%n", orderId);
	    }

	    public void cancelOrder() {
	        if (status != Status.PENDING) throw new IllegalStateException("PENDING 상태에서만 취소 가능");
	        status = Status.CANCELLED;
	        // 필요한 경우 관리자일 때 고객에게 메시지 전송 추가 가능
	    }

	    /* 3일 경과 자동 배송 완료 처리 */
	    public void autoCompleteDeliveryIfOver3Days() {
	        if (status == Status.SHIPPING && orderDate.plusDays(3).isBefore(LocalDateTime.now())) {
	            status = Status.DELIVERED;
	            System.out.printf("주문 %s는 배송 시작 후 3일이 지나 자동으로 완료 상태로 변경되었습니다.%n", orderId);
	        }
	    }

	    public void cancelOrder(Person person) {
	        if (status != Status.PENDING) {
	            throw new IllegalStateException("PENDING 상태에서만 주문 취소가 가능합니다.");
	        }
	        status = Status.CANCELLED;

	        if (person.getRole() == "관리자") {
	            System.err.printf("⚠ 관리자에 의해 주문 %s이 취소되었습니다. 고객 [%s]에게 재고 부족으로 인한 취소 안내 메시지를 전송합니다.%n", orderId, customer.getName());
	        } else {
	            System.out.printf("주문 %s이 취소되었습니다.%n", orderId);
	        }
	    }
	    
	    @Override
		public String toString() {
			return String.format("주문번호:%s, 날짜:%s, 상태:%s, 총액:%d원", orderId, orderDate, status, totalAmount);
		}

		public String getOrderDetail() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(toString())
	          .append("\n배송주소: ").append(shippingAddress)
	          .append("\n주문상품:\n");
	        for (CartItem ci : cartItems) {
	            sb.append("- ").append(ci.getItem().getName())
	              .append(" x ").append(ci.getQuantity())
	              .append(" = ").append(ci.getTotalPrice()).append("원\n");
	        }
	        return sb.toString();
	    }
	    
	    // Getter
	    public String getOrderId() {
	    	return orderId;
	    }
	    
	    public Customer getCustomer() {
	    	return customer;
	    }
	    
	    public LocalDateTime getOrderDate() {
	    	return orderDate;
	    }
	    
	    public Status getStatus() {
	    	return status;
	    }
	    
	    public List<CartItem> getcartItems() {
	    	return cartItems;
	    }
	    
	    public int getTotalAmount() {
	    	return totalAmount;
	    }
	}