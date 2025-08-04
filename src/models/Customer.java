package models;

public class Customer extends User {

	public Customer(String iD, String name, String adress, String password) {
		super(iD, name, adress, password);

	}

	@Override
	public String getRole() {
		return null;

	}

	@Override
	public void createNewAccount() {
	}

}

	