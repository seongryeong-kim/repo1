package sec01.exam01;

import java.util.Scanner;

public class 혼자연습 {

	public static void main(String[] args) {

//		int i = 1;
//		while(i<4) {
//			System.out.println(i);
//			i++;
//		}
		
		Scanner pick = new Scanner(System.in);
		
		int menu;
		do {
			System.out.println("메뉴를 고르세요");
			System.out.println("1.커피 2.차 3.음료 0.종료");
			
			menu = pick.nextInt();
			
			//만약 menu가 0보다 크거나 같고, menu가 3보다 작거나 같으면 참
			if(menu >=0 && menu <=3) {
				if(menu == 1) {
					System.out.println("커피 드리겠습니다");
				}else if(menu == 2) {
					System.out.println("홍차 드리겠습니다");
				}else if(menu == 3) {
					System.out.println("음료 드리겠습니다");
				}else if(menu == 0) {
					System.out.println("종료되었습니다");
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
		} while(menu!=0); //menu가 0이 아닌동안 계속 반복
	}

}
