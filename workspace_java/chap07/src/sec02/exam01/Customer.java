package sec02.exam01;          

public class Customer {

	//내가 커피샵으로 간다 커피주문을 위해서 
	//전달인자로 장소가 필요 
//	void get(Twosome ts) {
//		System.out.println("투썸 도착");
//	}
	
//	void comein(Cafe c){
//		System.out.println(c+"도착");
//	}
//	
//	void get(Cafe c, String menu){
//		System.out.println("음료받기");
//		c.order(menu);
//	}
	
	void buyCoffee(Cafe shop) {
		if(shop.isDT()==true) {
			System.out.println("드라이브스루 이용");
			shop.order("에이드");
		}else { System.out.println("드라이브 스루를 이용할 수 없습니다");
		shop.order("콜라");}
	}
}
