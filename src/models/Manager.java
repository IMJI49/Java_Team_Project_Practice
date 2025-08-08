package models;

public class Manager extends Person {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager(String name, String adress, String email, String id, String password,
			String phoneNumber) {
		super(name, adress, email, id, password, phoneNumber);
	}

	@Override
	public String getRole() {
		return "관리자";

	}

}

	