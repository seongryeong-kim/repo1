package sec02.exam01;

public class Cat extends Animal {

	//부모의 사운드를 오버라이드
	@Override
	void sound() {
		System.out.println("야옹 야옹");
	}
	
	void push() {
		System.out.println("꾹꾹이 합니다");
	}
}
