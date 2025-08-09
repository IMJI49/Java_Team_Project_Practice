package models;

import java.io.Serializable;

import exceptionlist.ShopException;

public class Customer extends Person implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double balance;
	
	

	public Customer(String name, String address, String email, String id, String password,
			String phoneNumber) {
		super(name, address, email, id, password, phoneNumber);
		this.balance = 0;
	}

	@Override
	public String getRole() {
		return "이용자";

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws ShopException {
		if(balance >= 0) {
			this.balance = balance;
		}else {
			throw new ShopException("잔액은 음수가 될 수 없습니다.");
		}	
	}

}

	