package models;

public class Manager extends Person {

	public Manager(String iD, String name, String adress, String password) {
		super(iD, name, adress, password);

	}

	@Override
	public String getRole() {
		return null;

	}

}

	