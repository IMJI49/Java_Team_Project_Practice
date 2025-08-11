package com.shoppingmall.controller;

import java.util.Scanner;

public class MainController {
	private Scanner scanner;
	private boolean isManager = false;
	
	public MainController() {
		this.scanner = new Scanner(System.in);
	}
	
	public void start() {
		menu();
	}
	
	//메인메뉴
	private void menu() {
		while(true) {
			System.out.println("╔════════════════════════════════════════════╗");
			System.out.println("║     🛍️  Java Shopping Mall                 ║");
			System.out.println("╚════════════════════════════════════════════╝");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 상품 둘러보기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					if(isManager)
						managerMenu();
					else
						loginMenu();
					break;
				case "3":
					lookAroundGood();
					break;
				case "0":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}
	
	//관리자 메뉴
	private void managerMenu() {
		while(true) {
			System.out.println("╔════════════════════════════════════════════╗");
			System.out.println("║     🛍️  Java Shopping Mall                 ║");
			System.out.println("║      [관리자 모드] 환영합니다!                   ║");
			System.out.println("╚════════════════════════════════════════════╝");
			System.out.println("1. 주문내역 확인");
			System.out.println("2. 상품 취소 관리)");
			System.out.println("3. 마이페이지");
			System.out.println("4. [관리] 상품 관리");
			System.out.println("5. [관리] 사용자 관리");
			System.out.println("6. 로그아웃");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					managerMyPage();
					break;
				case "4":
					break;
				case "5":
					break;
				case "6":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}

	//매니저 마이페이지
	private void managerMyPage() {
		while(true) {
			System.out.println("┌────────────────────────────────────┐");
			System.out.println("│         👤 마이페이지                 │");
			System.out.println("├────────────────────────────────────┤");
			System.out.println("│  1. 내 정보 조회                      │");
			System.out.println("│  2. 비밀번호 변경                      │");
			System.out.println("│  3. 개인정보 수정                     │");
			System.out.println("│  0. 돌아가기                         │");
			System.out.println("└────────────────────────────────────┘");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "0":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}

	//마이페이지 메뉴
	private void myPageMenu() {
		while(true) {
			System.out.println("┌────────────────────────────────────┐");
			System.out.println("│         👤 마이페이지                 │");
			System.out.println("├────────────────────────────────────┤");
			System.out.println("│  1. 내 정보 조회                      │");
			System.out.println("│  2. 비밀번호 변경                      │");
			System.out.println("│  3. 개인정보 수정                     │");
			System.out.println("│  4. 주문 내역 조회                    │");
			System.out.println("│  5. 회원 탈퇴                        │");
			System.out.println("│  0. 돌아가기                         │");
			System.out.println("└────────────────────────────────────┘");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "0":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}

	//장바구니 관리
	private void cartItemManagement() {
		while(true) {
			System.out.println("┌────────────────────────────────────┐");
			System.out.println("│         🛒 장바구니 관리               │");
			System.out.println("├────────────────────────────────────┤");
			System.out.println("│  1. 장바구니 조회                      │");
			System.out.println("│  2. 상품 추가                        │");
			System.out.println("│  3. 수량 변경                        │");
			System.out.println("│  4. 상품 삭제                        │");
			System.out.println("│  5. 장바구니 비우기                    │");
			System.out.println("│  6. 돌아가기                         │");
			System.out.println("└────────────────────────────────────┘");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "0":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}

	//상품 둘러보기
	private void lookAroundGood() {
		while(true) {
			System.out.println("┌────────────────────────────────────┐");
			System.out.println("│         🛍️ 상품 둘러보기               │");
			System.out.println("├────────────────────────────────────┤");
			System.out.println("│  1. 전체 상품 보기                    │");
			System.out.println("│  2. 카테고리별 보기                    │");
			System.out.println("│  3. 가격대별 보기                     │");
			System.out.println("│  4. 베스트셀러                       │");
			System.out.println("│  5. 신상품                          │");
			System.out.println("│  6. 상품 상세보기                     │");
			System.out.println("│  0. 돌아가기                         │");
			System.out.println("└────────────────────────────────────┘");
			System.out.print("메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "6":
					break;
				case "0":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}

	//로그인 메뉴
	private void loginMenu() {
		while(true) {
			System.out.println("╔════════════════════════════════════════════╗");
			System.out.println("║     🛍️  Java Shopping Mall                 ║");
			System.out.printf("║       환영합니다, [사용자명]님!                 ║\n");
			System.out.println("╚════════════════════════════════════════════╝");
			System.out.println("1. 상품 둘러보기");
			System.out.println("2. 상품 검색");
			System.out.println("3. 장바구니 관리");
			System.out.println("4. 주문하기");
			System.out.println("5. 주문내역");
			System.out.println("6. 마이페이지");
			System.out.println("7. 로그아웃");
			System.out.print("\n메뉴를 선택하세요: _");
			
			String menu = scanner.nextLine();
			switch(menu) {
				case "1":
					lookAroundGood();
					break;
				case "2":
					break;
				case "3":
					cartItemManagement();
					break;
				case "4":
					break;
				case "5":
					break;
				case "6":
					myPageMenu();
					break;
				case "7":
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
	}
}

	