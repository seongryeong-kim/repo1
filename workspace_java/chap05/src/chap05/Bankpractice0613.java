package chap05;

import java.util.Scanner;

public class Bankpractice0613 {

	public static void main(String[] args) {

		int account = 0; // 첫 시작 계좌금액 0원으로 설정할 예정
		System.out.println("원하시는 서비스를 선택하세요 1.입금 2.출금 3.조회 4.종료");

		// 원하는 서비스를 1~4 숫자로 입력받기 위해 Scanner를 import
		Scanner scan = new Scanner(System.in); // scan라는 이름의 Scanner
		// scan이름의 스캐너로 입력받는 정수 값을 service이름의 변수에 저장
		int service = scan.nextInt();

		while (service != 4) { // Scanner로 입력한 값이 4가 아니면 참,계속 반복하다 4나오면 종료
			if (service == 1) {
				System.out.println("1.입금 서비스를 선택하셨습니다. 입금할 금액을 입력하세요");
				int deposit = scan.nextInt();
				System.out.println(deposit+"원을 입금하였습니다");
			} else if (service == 2) {
				System.out.println("2.출금 서비스를 선택하셨습니다. 출금할 금액을 입력하세요");
			} else if (service == 3) {
				System.out.println("3.조회 서비스를 선택하셨습니다. 잔액은 변수명 원 입니다.");
			}
		}

	}

}
