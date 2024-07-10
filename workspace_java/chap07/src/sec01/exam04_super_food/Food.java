package sec01.exam04_super_food;

public class Food {
	
	Food(){
		System.out.println("Food 생성자 실행");
	}

//	이름 name
//	가격 price
//	주재료 recipe
//	종류 type
	String name;
	int price;
	String recipe;
	String type;
	
//	먹는다 eat
//	void eat() {
//		System.out.println(this.name+"먹는다");
//	}
	//선생님
	int eat( ) {
		System.out.println(this.name+"먹는다");
		return (int)(Math.random()*5)+1; //별점
	}

//	주문한다 order
	String order(String dish) {
		System.out.println(dish+"을(를) 주문하였습니다.");
		return dish;
	}
	//선생님
	/**
	 * 주문기능
	 * @param int money 지불하는 금액
	 * @return int 거스름돈
	 */
	int order(int money) {
		int change = 0; //거스름돈
		
		if(money< this.price) {
			System.out.println("금액 부족으로 주문 취소되었습니다");
		} else {
			System.out.println(this.name+" 주문한다.");
			change = money- this.price; 
		} 
		return change;
	}
	
//	요리한다 cook
//	void cook() {
//		System.out.println("요리중입니다.");
//	}
//	
	//선생님
	/**
	 * 
	 * @param int master 요리 숙련도
	 * @return String 조리 결과
	 */
	String cook(int master) {
		if(master > 7) {
			return "조리가 기가막히게 잘됨";
		} else if(master > 4) {
			return "먹을만하게 됨";
		} else {
			return "나 혼자 먹자";
		}
		
	}
}