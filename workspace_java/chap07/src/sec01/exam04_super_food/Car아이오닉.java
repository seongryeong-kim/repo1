package sec01.exam04_super_food;

public class Car아이오닉 extends Car{
	//Car 부모클래스를 상속받음

	Car아이오닉(){
		System.out.println("아이오닉 생성자 실행");
		
		this.name="아이오닉5";
		this.seat=5;
		this.fuel="전기";
	}
}
