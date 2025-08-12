package com.shoppingmall.test;

import com.shoppingmall.models.Item;
import com.shoppingmall.repository.ProductRepository;

public class ProductTest {
	public static void main(String[] args) {
        System.out.println("=== 제품 repository 테스트 시작 ===\n");
        
        ProductRepository repository = new ProductRepository();
        
        // 테스트
        testSaveNewItem(repository);
        testFindByPriceRange(repository);
        testFindByCategory(repository);
        testFindByDesc(repository);
        testFindByNameExists(repository);
        testFindByNameNotExists(repository);
        
        System.out.println("\n=== ✅ 모든 테스트를 완료했습니다. ===");
    }
    


	// 새 상품 저장 테스트
    private static void testSaveNewItem(ProductRepository repository) {
        System.out.println("\n 테스트 : 새 상품 저장");
        System.out.println("새로운 상품을 저장합니다.");
        System.out.println("=".repeat(20));
        
        // 새 상품 생성
        Item newItem = new Item("스마트폰", "전자제품", 899000, 30, "스마트폰입니다.");
        
        // 상품 저장
        Item savedItem = repository.save(newItem);
        
        // 결과 출력
        if (savedItem != null) {
            System.out.println("== ✅ 상품 저장 성공! ==");
            System.out.println("저장된 상품: " + savedItem.getName());
        } else {
            System.out.println("== ❌ 상품 저장 실패 ==");
        }
    }
    
    // 카테고리로 검색
    private static void testFindByCategory(ProductRepository repository) {
        System.out.println("\n 테스트 : 카테고리로 검색");
        System.out.println("'전자제품' 카테고리로 검색.");
        System.out.println("=".repeat(20));
        
        repository.findByCategory("전자제품");

        System.out.println("== ✅ 검색 메서드 실행 완료! ==");

    }

    // 설명으로 검색
    private static void testFindByDesc(ProductRepository repository) {
        System.out.println("\n 테스트 : 설명으로 검색");
        System.out.println("'입니다' 설명으로 검색.");
        System.out.println("=".repeat(20));
        
        repository.findByDesc("입니다");

        System.out.println("== ✅ 검색 메서드 실행 완료! ==");

    }
    
    
    
    // 이름으로 검색 (존재하는 상품)
    private static void testFindByNameExists(ProductRepository repository) {
        System.out.println("\n 테스트 : 이름으로 검색 (존재하는 상품)");
        System.out.println("'노트북'으로 검색합니다.");
        System.out.println("=".repeat(20));
         
        repository.findBy("노트북");
        
        System.out.println("== ✅ 검색 메서드 실행 완료! ==");

    }
    
    // 이름으로 검색 (존재하지 않는 상품)
    private static void testFindByNameNotExists(ProductRepository repository) {
        System.out.println("\n 테스트 : 이름으로 검색 (존재하지 않는 상품)");
        System.out.println("'존재하지않는상품'으로 검색합니다.");
        System.out.println("=".repeat(20));
        
        repository.findBy("존재하지 않는 상품");
        
        System.out.println("== ✅ 검색 메서드 실행 완료! ==");

    }
    
    // 가격대로 검색
    private static void testFindByPriceRange(ProductRepository repository) {
    	 System.out.println("\n 테스트 : 가격대로 검색");
         System.out.println("'100원~ 10000원'으로 검색합니다.");
         System.out.println("=".repeat(20));
         
         repository.findByPriceRange(100, 10000);
         
         System.out.println("== ✅ 검색 메서드 실행 완료! ==");

		
	}
}
