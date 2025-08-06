package models;

public abstract class Person {
	protected String ID;
	protected String name;
	protected String adress;
	protected String password;
	public abstract String getRole();
	public Person(String iD, String name, String adress, String password) {
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
	@Override
	public String toString() {
		return String.format("이름 : %s, 아이디 주소 : %s, 비밀번호 : %s", name,adress,"*".repeat(password.length()));
			
	}
	
}

	