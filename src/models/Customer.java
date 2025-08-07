package models;

public class Customer extends Person {

	

	public Customer(String name, String adress, String email, String id, String password,
			String phoneNumber) {
		super(name, adress, email, id, password, phoneNumber);
	}

	@Override
	public String getRole() {
		return "이용자";

	}

}

	