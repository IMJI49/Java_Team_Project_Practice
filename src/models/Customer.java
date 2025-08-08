package models;

public class Customer extends Person {

	

	public Customer(String id, String password, String name, String adress, String email, String phoneNumber) {
		super(id, password, name, adress, email, phoneNumber);
		
	}

	/**
	 * 
	 */


	@Override
	public String getRole() {
		return "이용자";

	}

}

	