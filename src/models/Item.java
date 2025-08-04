package models;

public class Item {
	
	private String itemID;
	private String name;
	private int price;
	private int quantity;
	public Item(String itemID, String name, int price, int quantity) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemID() {
		return itemID;
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
	@Override
	public String toString() {
		return super.toString();
			
	}
	

}

	