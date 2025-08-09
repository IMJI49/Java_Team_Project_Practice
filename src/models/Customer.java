package models;

public class Customer extends Person {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public Customer(String name, String address, String email, String id, String password,
			String phoneNumber) {
		super(name, address, email, id, password, phoneNumber);
	}

	@Override
	public String getRole() {
		return "이용자";

	}

}

	