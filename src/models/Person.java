package models;

public abstract class Person {
	protected String serialNum;
	protected String name;
	protected String adress;
	protected String email;
	protected String id;
	protected String password;
	protected String phoneNumber;
	public abstract String getRole();
	
	public Person(String name, String adress, String email, String id, String password,
			String phoneNumber) {
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
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
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("이름 : %s, 아이디 주소 : %s, 비밀번호 : %s", name,adress,"*".repeat(password.length()));
			
	}
	
}

	