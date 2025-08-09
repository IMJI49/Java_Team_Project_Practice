package service;

import java.util.Scanner;

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
	public Customer registerCustomer(String name, String address, String email,
			String id, String password, String phoneNumber) {
		//이름 검증
		if(name.trim().length() < 2 || name.trim().length() > 20) {
			throw new RuntimeException("이름은 2자 이상, 20자 이하여야 합니다.");
		}
		
		//아이디 검증
		if(customerRepository.existsById(id)) {
			throw new RuntimeException("이미 존재하는 ID입니다: " + id);
		}
		
		requireNonEmpty(id, "ID를 입력해 주세요.");
		
		if(id.trim().length() < 5 || id.trim().length() > 20) {
			throw new RuntimeException("아이디는 5자 이상, 20자 이하여야 합니다.");
		}
		
		//비밀번호 검증
		if(password.trim().length() < 8 || password.trim().length() > 20) {
			throw new RuntimeException("패스워드는 8자 이상, 20자 이하여야 합니다.");
		}
		
		Customer customer = new Customer(name, address, email,
				id, password, phoneNumber);
		
		//Repository 호출
		Customer savedCustomer = customerRepository.save(customer);
		
		System.out.println("새사용자 등록: " + savedCustomer.getId());
		
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
