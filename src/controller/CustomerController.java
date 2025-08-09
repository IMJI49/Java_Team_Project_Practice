package controller;

import java.util.Scanner;

import models.Customer;
import repository.CustomerRepository;
import service.CustomerService;

public class CustomerController {
	private CustomerService customerService;
	private Scanner scanner;
	
	public CustomerController() {
		this.customerService = new CustomerService();
		this.scanner = new Scanner(System.in);
	}
	
	//회원가입
	public void register() {
		System.out.println("\n=== 회원가입 ===");
		
		//회원정보 입력
		System.out.print("아이디 (5 - 20자 입력, 영문/숫자 조합): ");
		String id = scanner.nextLine();
		
		System.out.print("패스워드 (8-20자 입력, 영문/숫자 포함 필수): ");
		String password = scanner.nextLine();
		
		System.out.print("이름 (2-20자 입력, 한글/영문 가능): ");
		String name = scanner.nextLine();
		
		System.out.print("이메일: ");
		String email = scanner.nextLine();
		
		System.out.print("전화번호: ");
		String phone = scanner.nextLine();
		
		System.out.print("주소: ");
		String address = scanner.nextLine();
		
		try {
			Customer customer = customerService.registerCustomer(
					name, address, email, id, password, phone);
			
			System.out.println("회원가입 성공!");
			System.out.println("환영합니다 " + customer.getName() + "님!");
		}catch (Exception e) {
			System.out.println("회원가입 실패: " + e.getMessage());
		}
	}
	
	//로그인
	public void logIn() {
		
	}
	
	//로그아웃
	public void logOut() {
		
	}
	
	//마이페이지
	public void myPage() {
		
	}

}
