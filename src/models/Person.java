package models;

import java.io.Serializable;

public abstract class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String address;
	protected String email;
	protected String id;
	protected String password;
	protected String phoneNumber;
	public abstract String getRole();
	
	public Person(String id, String name,  String password, String address, String email, 
			String phoneNumber) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		getRole();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", email=" + email + ", id=" + id + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}


	
}

	