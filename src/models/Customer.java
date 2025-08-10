package models;

public class Customer extends Person {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Customer(String name, String address, String email, String id, String password,
			String phoneNumber) {
	    super(id, name, password, address, email, phoneNumber);
	}

	@Override
	public String getRole() {
		return "이용자";

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", email=" + email + ", id=" + id + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}

	
	
}

	