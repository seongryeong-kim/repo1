package sec02.exam01;

public class CustomerExam {

	public static void main(String[] args) {

//		Cafe cafe = new Cafe();
//		cafe.order("아메리카노");
		
		//내가 가려는 카페이름 투썸
		Twosome twosome = new Twosome();
		//투썸에서 메뉴주문
		twosome.order("아메리카노");
		빽다 빽 = new 빽다();
		
		Customer me = new Customer();
////		me.comein(twosome);
//		me.get(twosome,"아메리카노");
		
		me.buyCoffee(twosome);
		System.out.println("-------------------");
		me.buyCoffee(빽);
	}

}
