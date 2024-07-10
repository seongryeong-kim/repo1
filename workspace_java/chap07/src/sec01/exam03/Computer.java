package sec01.exam03;

public class Computer extends Calculator{
	//7월 10일 340p
	//Computer 자식 클래스
	@Override //선언된 메소드가 부모가 선언한 것과 같은 게 있는지 찾아주는 역할
	double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * radius * radius;
	}
}
