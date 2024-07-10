package sec01.exam04_super_food;

public class FoodExam {

	public static void main(String[] args) {

		제육 food1 = new 제육();
		food1.setSpicy("맛있게 매운맛"); //맵기설정
		
		int change = food1.order(10000);
		System.out.println("거스름돈 "+change+"받았다");
		
		int rank = food1.eat();
		System.out.println(food1.name+"의 별점은: "+rank);
		
//		int rank;
//		회탕후루 food2 = new 회탕후루();
//		food2.order(10000); //원래 20000원짜리인데 만원만 내니까 취소됨
//		food2.order(21000); 
//		rank = food2.eat();
//		System.out.println(food2.name+"의 별점은: "+rank);
//		if(rank<3) {
//			food2.goGarbage();
//		}
	}

}
