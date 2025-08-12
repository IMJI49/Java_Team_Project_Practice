package com.shoppingmall.repository;

import java.util.List;

import com.shoppingmall.models.Customer;
import com.shoppingmall.persistence.FileManagement;
import com.shoppingmall.util.Constants;


public class UserRepository {


	// 파일명 상수
	private static final String FILE_NAME = Constants.USER_DATA_FILE;
	
	
	// 사용자 저장
	public Customer save(Customer customer) {
		// 기존 사용자 목록 조회
		List<Customer> customers = FileManagement.readFromFile(FILE_NAME);
		
		// 새 사용자 추가
		customers.add(customer);
		
		// 파일에 저장
		FileManagement.writeToFile(FILE_NAME, customers);
		
		return customer;
	}

	
	// 사용자 존재 여부 확인
	public boolean existsById(String id) {
		
		return findById(id) != null;
	}

	
	//ID로 사용자 조회
	public Object findById(String id) {
		List<Customer> users = FileManagement.readFromFile(FILE_NAME);
		return users.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

	// 모든 사용자 데이터 반환 (비밀번호 제외)
	public List<Customer> getAllCustomersWithoutPassword() {
	    return FileManagement.readFromFile(FILE_NAME);
	}
	
}
