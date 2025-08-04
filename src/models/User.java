package models;

public abstract class User {
	protected String ID;
	protected String name;
	protected String adress;
	protected String password;
	public abstract String getRole();
	public abstract void createNewAccount();
	public User(String iD, String name, String adress, String password) {
		super();
		ID = iD;
		this.name = name;
		this.adress = adress;
		this.password = password;
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public String getPassword() {
		return password;
	}
	
}

	