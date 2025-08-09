package test;

import java.io.File;

import models.Customer;
import service.CustomerService;

public class CustomerTest {
	public static void main(String[] args) {
		new File("data").mkdir();
		CustomerService customerService = new CustomerService();
		
		//테스트1: 정상 회원가입
		System.out.println("1. 정상 회원가입 테스트");
		
		try {
			Customer user = customerService.registerCustomer("테스트유저1", "주소입니다1", "testuser1@naver.com",
					"testuser1", "password1234", "010-1234-5678");
			System.out.println("성공: " + user.getName() + "잔액: " 
					+ user.getBalance() + "원)");
		}catch (Exception e) {
			System.out.println("실패: " + e.getMessage());
		}
		
		//테스트2: 중복 ID
		try {
			customerService.registerCustomer("테스트유저2", "주소입니다2", "testuser2@naver.com",
					"testuser1", "password1234", "010-1234-5678");
			System.out.println("오류: 중복 ID가 허용됨");
		}catch(Exception e) {
			System.out.println("정상: 중복 ID 거부됨 - " + e.getMessage());
		}
	}
}
