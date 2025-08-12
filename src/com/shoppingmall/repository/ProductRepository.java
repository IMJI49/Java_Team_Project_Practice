package com.shoppingmall.repository;

import java.util.List;

import com.shoppingmall.models.Item;
import com.shoppingmall.persistence.FileManagement;
import com.shoppingmall.util.Constants;

public class ProductRepository {

	// 파일명 상수
	private static final String FILE_NAME = Constants.PRODUCT_DATA_FILE;

	
	public ProductRepository() {
		
		initialize();
		
	}
	
	// 상품 생성 (초기화)
	private void initialize() {
		List<Item> items = FileManagement.readFromFile(FILE_NAME);
		
		// 기본 상품이 없으면 생성
		if(items.isEmpty()) {
			
			Item item1 = new Item("노트북","전자제품",1790000,50,"노트북입니다");
			Item item2 = new Item("티셔츠","의류",19800,1000,"티셔츠입니다");
			Item item3 = new Item("커피","식품",8000,500,"커피입니다");
			Item item4 = new Item("소설","도서",12000,80,"소설입니다");
			Item item5 = new Item("문구류","기타",3000,700,"문구류입니다");
		
			items.add(item1);
			items.add(item2);
			items.add(item3);
			items.add(item4);
			items.add(item5);
			
			FileManagement.writeToFile(FILE_NAME, items);
			System.out.println("기본 상품이 생성되었습니다.");
		
		};
	}
	
	
	// 상품 저장
		public Item save(Item item) {
			// 기존 상품 목록 조회
			List<Item> items = FileManagement.readFromFile(FILE_NAME);
			
			// 새 상품 추가
			items.add(item);
			
			// 파일에 저장
			FileManagement.writeToFile(FILE_NAME, items);
			
			return item;
		}
		
		
	// 카테고리로 상품 검색
		public Object findByCategory(String category) {
		List<Item> items = FileManagement.readFromFile(FILE_NAME);
		
		List<Item> foundItems = items.stream()
				.filter(u -> u.getCategory().equals(category))
				.toList();

		if(foundItems.isEmpty()) {
			return null;
		}
		
		foundItems.forEach(System.out::println);
		
		return foundItems;
	}
		
		
	// 상품명으로 상품 검색
		public Object findBy(String name) {
		List<Item> items = FileManagement.readFromFile(FILE_NAME);
		
		List<Item> foundItems = items.stream()
								.filter(u -> u.getName().equals(name))
								.toList();
		
		if(foundItems.isEmpty()) {
			return null;
		}
		
		foundItems.forEach(System.out::println);
		
		return foundItems;
				
	}
		
		
	// 설명으로 상품 검색
		public Object findByDesc(String desc) {
		List<Item> items = FileManagement.readFromFile(FILE_NAME);
		
		List<Item> foundItems = items.stream()
								.filter(u -> u.getProdDesc().equals(desc))
								.toList();
		
		if(foundItems.isEmpty()) {
			return null;
		}
		
		foundItems.forEach(System.out::println);
		
		return foundItems;
				
	}
		
		// 가격대로 상품 검색
		public Object findByPriceRange(int minPrice, int maxPrice) {
		List<Item> items = FileManagement.readFromFile(FILE_NAME);
		
		List<Item> foundItems = items.stream()
								.filter(i -> i.getPrice() >= minPrice &&
											i.getPrice() <=maxPrice)
								.toList();
		
		if(foundItems.isEmpty()) {
			return null;
		}
		
		foundItems.forEach(System.out::println);
		
		return foundItems;
				
	}

}


// 