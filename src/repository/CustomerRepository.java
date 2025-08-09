package repository;

import java.util.List;

import models.Customer;
import persistence.FileManager;

public class CustomerRepository {
	//파일명 상수
	private static final String FILE_NAME = "users.dat";
	
	//사용자 저장
	public Customer save(Customer user) {
		// 기존 사용자 목록 조회
		List<Customer> users = FileManager.readFromFile(FILE_NAME);
		
		//새 사용자 추가
		users.add(user);
		
		//파일에 저장
		FileManager.writeToFile(FILE_NAME, users);
		
		return user;
	}

	public boolean existsById(String id) {
		
		
		return findById(id) != null;
	}

	//ID로 사용자 조회
	private Customer findById(String id) {
		List<Customer> users = FileManager.readFromFile(FILE_NAME);
		return users.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst()
				.orElse(null);
		
	}
}
