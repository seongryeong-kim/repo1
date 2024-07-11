package sec01.exam04_super_food;

public class CafePaik extends Cafe{
	
	CafePaik(){
		this.brand="빽다방";		
	}
	
	@Override
	void menu() {
		System.out.println(this.brand+"의 메뉴입니다");
		System.out.println("아메리카노 카페라떼 아이스티 사라다빵");
	}
}
