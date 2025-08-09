package service;

import java.util.Scanner;

import controller.$missing$;
import models.Customer;
import repository.CustomerRepository;

public class CustomerService {
	private static Scanner scanner = new Scanner(System.in);
	//데이터 접근을 위한 Repository
	private CustomerRepository customerRepository;
	
	//생성자
	public CustomerService() {
		customerRepository = new CustomerRepository();
	}
	
	//회원가입
	public Customer registerCustomer() {
		//이름 검증
		String name = scanner.nextLine();
		if(name.trim().length() < 2 || name.trim().length() > 20) {
			throw new RuntimeException("이름은 2자 이상, 20자 이하여야 합니다.");
		}
		
		//아이디 검증
		String id = scanner.nextLine();
		if(customerRepository.existsById(id)) {
			throw new RuntimeException("이미 존재하는 ID입니다: " + id);
		}
		
		requireNonEmpty(id, "ID를 입력해 주세요.");
		
		if(id.trim().length() < 5 || id.trim().length() > 20) {
			
		}
		
		Customer customer = new Customer(name, address, email,
				id, password, phoneNumber);
		
		return customer;
	}
	
	// 빈 입력값 체크
	public static void requireNonEmpty(String str, String message) {
		if (str == null || str.trim().isEmpty()) {
			throw new IllegalArgumentException(message);
		}
	}

	/*
	 * 문자열 최소 길이 체크
	 */
	public static void requireMinLength(String str, int minLength, String message) {
		requireNonNull(str, message);
		
		if(str.length() < minLength) {
			throw new IllegalArgumentException(message);
		}
	}

	//null값 체크
	private static void requireNonNull(Object obj, String message) {
		if(obj == null) {
			throw new IllegalArgumentException(message);
		}
	}
}
