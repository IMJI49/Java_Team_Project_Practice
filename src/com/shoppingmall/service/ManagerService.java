package com.shoppingmall.service;

import com.shoppingmall.models.Item;

public class ManagerService {
	/*
	 * order status : confirm, cancel, shipping
	 * product : add, delete, modify
	 * customer : delete, 회원 검색시 :  이름, 배송지, 전화번호, 상세정보에 id 배송 횟수, 구매 금액 추가
	 *추가 구현시에는 리뷰까지만
	 */
	/*
	 * 상품 제고까지 확인
	 * 1~6번 없애고
	 * 
	 * 1. 주문 내역 확인
	 * 2. 상품 관리 취소관리
	 * 3. 마이페이지 - customer mypage랑 동일 4,5 감추는것으로
	 * 4. 관리 상품관리 (change 재고 관리 : quantyty int값으로 받아서 증가만)  (5번 전체 상품 보기랑 같음)
	 * 5. 사용자 관리 : 
	 * 		1. 전체 회원 조회 (이름, id, 주소, 폰넘버) - 관리자 나오면 안됩니다
	 * 		2. 회원검색 이름으로 검색
	 *		3. 상세정보는 id 검색 : 비밀번호 제외 모든값 나오게 (주문 내역도 포함)
	 *		4. 회원강제 탈퇴 : id로 탈퇴시키고 사유 작성 및 통보
	 *		5. 돌아가기
	 * 6. 로그아웃
	 * 추가 구현 기능 판매된 아이템 보기 (statistic)
	 */
	
	// 모든 주문 보기
	public void viewAllOrders() {}
	// 주문 확인하기
	public void confirmOrder(String orderId) {}
	// 주문 취소하기
	public void cancelOrder(String orderId) {}
	// 배달 시작
	public void startShippiing(String orderId) {}
	// 배달 완료
	public void completeDelivery(String orderId) {}
	// 주문 내역 보기
	public void getOrderDetail(String orderId) {}
	// 상품 추가
	public void addProduct(Item item) {}
	// 상품 제거
	public void removeProduct(String itemId) {}
	// 상품 수정
	public void updateProduct(Item item) {}
	// 재고 수정
	public void updateStock(String itemId, int quantity) {}
	// 모든 상품 보기
	public void viewAllProducts() {}
	// 상품 보기
	public void viewProductsDetail(String itemId) {}
	// 모든 고객 보기
	public void viewAllCustomers() {}
	// 이름으로 고객 검색
	public void searchCustomerByName(String name) {}
	// 고객 보기
	public void getCustomerDetail(String id) {}
	// 고객 삭제
	public void deleteCustomer(String id, String reason) {}
	// 고객에게 메시지 보내기
	public void sendNotificationToCustomer(String id, String message) {}
	// 판매 통계 보기
	public void viewSalesStatistics() {}
	// 가장 인기있는 상품들
	public void viewPopularItems() {}
}

	