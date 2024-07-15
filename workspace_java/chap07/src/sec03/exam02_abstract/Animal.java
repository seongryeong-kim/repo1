package sec03.exam02_abstract;

//추상클래스
//추상 메소드를 가질 수 있다
//new가 되지 않는다
public abstract class Animal {
	
	String kind;
	
	void breathe() {
		System.out.println("숨 쉬어");
	}
	
	//추상메소드
	//내가 구현하지 않고 나를 상속받은 애들이 구현하도록 유도
	abstract void sound();

}
