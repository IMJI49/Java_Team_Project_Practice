package models;

public class CartItem {
	private Item item;		//상품
	private int quantity;	//수량
	
	
	public CartItem(Item item, int quantity) {
		//super();
		this.item = item;
		this.quantity = quantity;
	}
	
	
	
	public void addQuantity(int amount) {  //수량 증가
		quantity += amount;
	}
	
	public int getTotalPrice() {			// 총 가격 계산
		return item.getPrice() * quantity;
	}


	@Override
	public String toString() {
		return "CartItem [item=" + item + ", quantity=" + quantity + "]";
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

	
}
