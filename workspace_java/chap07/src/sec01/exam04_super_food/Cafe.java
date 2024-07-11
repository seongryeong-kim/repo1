package sec01.exam04_super_food;

public class Cafe {
	String brand; //카페이름 
	int price=3000; //모든 메뉴 3000원 	
	
	Cafe(){
		System.out.println("부모 클래스 Cafe 생성자");
	}
	
	//메소드
	void menu() { //가지고 있는 메뉴 출력해주기 (메뉴판)
		System.out.println(this.brand+"의 메뉴입니다");
		System.out.println("아메리카노 카페라떼 아이스티");
	}
	
	void order(){
		System.out.println("주문");
	}
	
	void pay(int money) { //내가 입력하는 int money가 내는 돈
		if(money>=price) {
			System.out.println("계산완료. 주문이 되었습니다");
			System.out.println("거스름 돈은"+(money-price)+"입니다");
		} else {
			System.out.println("잔액이 부족하여 주문이 취소되었습니다");
		}
	}
	
	
}
