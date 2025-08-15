package com.shoppingmall.service;

import java.util.List;
import java.util.Scanner;

import com.shoppingmall.models.CartItem;
import com.shoppingmall.models.Customer;
import com.shoppingmall.models.Item;
import com.shoppingmall.models.Order;

public class UserService {
	/*
	 * 카트담기(50 종목 이상 불가능), 제품 설명보기
	 * 일괄 주문, 부분주문
	 * 서치 : 제고는 확인 불가 
	 * 가격범위, 이름, 카테고리 (페이징 10개씩), 이름 상세정보 description
	 * 등록 날짜 3일이내 = 신상품
	 * 구매 10회이상 제품 bestseller
	 * --
	 * 장바구니 : 조회, 상품추가, 수령변경 (+: 수량 1개 증가, - : 수량 1개 감소, +-10 : 10개 단위 증감,0 : 수량 변경 종료)
	 * 전부삭제(5번 장바구니 비우기), 이름삭제(4번 상품삭제)
	 * 마이페이지
	 * 아이디 조회, 이메일, 전화번호, 주소 비밀번호는 비밀 자리 수 상관없이 *16자로 처리
	 * 개인정보 수정 : 이메일, 전화번호, 주소 (변경 사항 없을 시 다른 키워드 입력하게끔, 요구조건 : 비밀번호 맞출 시 할 수 있게(비밀번호 변경, 회원 탈퇴도 마찬가지).
	 * 
	 */
	
	/*
	 * 비 로그인 시 회원가입 절차
	 * 로그인은 관리자에서 받아오는것으로
	 * UI
	 * customer 로그인
	 * 1. 상품 둘러보기 : searchbycategory 카테고리, newitem신상품, bestseller베스트셀러
	 * 2. 상품검색 : searchbyname 
	 */
	
	private Scanner scanner = new Scanner(System.in);
	
	// 장바구니에 아이템 추가
	public void addToCart(Item item, int quantity) {}
	// 장바구니에 아이템 제거
	public void removeFromCart(Item item) {}
	// 상품 주문하기
	public void placeOrder(List<CartItem> cartItems) {}
	// 내 장바구니 보기
	public List<CartItem> viewCart() { return null; }
	// 카테고리로 상품 검색
	public void searchProductByCategory(String category) {}
	// 이름으로 상품 검색
	public void searchProductByName(String name) {}
	// 사용자의 주문내역 반환
	public List<Order> getUserOrders(){ return null; }
	// 개인정보 수정
	public void updatePersonalInfo(Customer updatePerson) {}
	// 비밀번호 변경
	public void changePassword(String password) {}
	// 계정 삭제
	public void deleteAccount(String id) {}
	// 베스트셀러 보기
	public List<Item> viewBestSellers() { return null; }
	// 신상품 보기
	public List<Item> viewNewItems() { return null; }
	// 상품 아이디로 검색해서 상품 반환하기
	public Item getItemByID(String itemId) { return null; }
	// 리뷰하기
	public void reviewing(String itemId) {
		System.out.println("리뷰할 내용을 적어주세요 : _");
		String review = scanner.nextLine();
		this.getItemByID(itemId).reviewing(review);
	}
}

	