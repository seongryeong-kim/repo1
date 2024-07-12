package sec02.exam01;

public class Avante extends Car {

	@Override
	public void drive() {
		//부모 Car에서는 "차를 운전합니다"가 출력되어야 하는데
		//아반떼 클래스에서 오버라이드함 그래서 아반떼를 운전합니다가 나옴
		System.out.println("아반떼를 운전합니다");
	}
}
