package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		//은행 계좌의 잔고 관리 시스템
		//Bank Account Balance Manage System
		//1.입금 2.출금 3.조회 4.종료
		//입금: 잔액에 더하기
		// 	*0, 음수는 실행되지 않게 - 금액을 확인하세요
		//출금: 잔액에서 빼기
		//	*잔액보다 더 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		//조회: 잔액 출력
		//종료: 반복 종료 break가 될 예정
		
		//do {실행문} while (조건식-false일때 종료되도록);
	//switch문을 사용해도 좋다 - 하지만 내가 쓸 줄을 모른다
		
		Scanner scan =new Scanner(System.in);
		System.out.println("원하는 서비스를 선택하세요");
		System.out.println("1.입금 2.출금 3.조회 4.종료");
		int service = scan.nextInt();
		
		while(service>=1 && service<=3) {
			//1~3이 나오면 true 4가 나오면 false니까 종료되도록
			if(service ==1) {
				System.out.println("얼마를 입금하시겠습니까?");
			}
			if(service ==2) {
				System.out.println("얼마를 출금하시겠습니까?");
			}
			if(service ==3) {
				System.out.println("잔액은"+"변수"+"원 입니다.");
			}
		
		if(false)System.out.println("서비스가 종료되었습니다.");}
			
			
			
	}

}
