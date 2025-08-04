package models;

public class Seller extends User {

	public Seller(String iD, String name, String adress, String password) {
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

	