package chap05;

import java.util.Scanner;

public class JavaTest커피주문배열사용 {

	public static void main(String[] args) {

		System.out.println("원하는 서비스를 선택하세요");
		
		/*
		 * 1. 아메리카노 3000원
		 * 핫 or 아이스 
		 * 2. 바닐라라떼 5000원 
		 * 3. 카라멜 프라푸치노 6000원 
		 * 휘핑크림 유무
		 */
		
		String[] menu1 = new String[4];
		menu1[0]="아메리카노";
		menu1[1]="바닐라라떼";
		menu1[2]="카라멜 프라푸치노";
		menu1[3]="종료";
		
		Scanner scan = new Scanner(System.in); //주문을 입력받기 위해 scanner사용
		//int menu = scan.nextInt();
		int menu = -1;
		
		int total=0;
		int coffee=3000; //아메리카노 가격 
		int latte=5000;	 //카페라떼 가격 
		int caramel=6000;//카라멜프라푸치노 가격
		
		while (menu != 4) { // 메뉴가 4가 아닐경우 계속 while문 반복
//			System.out.println("[1.아메리카노 2.바닐라라떼 3.카라멜프라푸치노 4.종료]");
			for(int i=0;i<menu1.length;i++) {
				System.out.println((i+1)+"."+menu1[i]);
			}
			//위에 menu 변수가 -1이니까 참, 처음부터 메뉴를 나타날 수 있게 해줌 
			menu = scan.nextInt(); //입력받는 값에 따라 메뉴를 선택할 수 있음
			if (menu == 1) {
				
				total += coffee;
				System.out.println("\""+(menu1[menu-1])+"\""+"를 선택하셨습니다");
				System.out.println("1.핫 또는 2.아이스 를 선택해주세요");
				int hot = scan.nextInt();
				if (hot == 1) {
					System.out.println("핫 아메리카노 준비해드리겠습니다");
					System.out.println("추가로 원하시는 서비스가 있나요?");
				} else {
					System.out.println("아이스 아메리카노 준비해드리겠습니다"); 
					System.out.println("추가로 원하시는 서비스가 있나요?");
				} 
			} else if (menu == 2) {
				total += latte;
				System.out.println("\""+(menu1[menu-1])+"\""+"를 선택하셨습니다");
				System.out.println("추가로 원하시는 서비스가 있나요?");
			} else if (menu == 3) {
				total += caramel;
				System.out.println("\""+(menu1[menu-1])+"\""+"를 선택하셨습니다");
				System.out.println("휘핑크림 추가를 원하시면 1.yes 그렇지 않으면 2.no 선택해주세요");
				int cream = scan.nextInt();
				if (cream == 1) {
					System.out.println("휘핑크림 올린 프라푸치노 준비해드리겠습니다");
					System.out.println("추가로 원하시는 서비스가 있나요?");
				} else {
					System.out.println("휘핑크림 뺀 프라푸치노 준비해드리겠습니다");
					System.out.println("추가로 원하시는 서비스가 있나요?");
				}
			}
			if (menu == 4) { // 4를 선택하는 경우 종료되게
				break;
			}
		}
		 
		System.out.println("종료되었습니다. 총 금액은"+total+"입니다. 감사합니다.");

	}

}
