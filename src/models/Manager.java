package models;

public class Manager extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager(String id, String password, String name, String adress, String email, String phoneNumber) {
		super(id, password, name, adress, email, phoneNumber);
		
	}

	@Override
	public String getRole() {
		return "관리자";
	}

}

	