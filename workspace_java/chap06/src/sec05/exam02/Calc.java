package sec05.exam02;

public class Calc {
	//7월 8일 월요일
	//296p 계산기 예제

	static double pi = 3.141592;
	String color;
	
	//지역변수: 해당 블럭에서만 사용가능, 
	//		  블럭이 끝나면 사라짐 
	//필드변수: new가 된 순간 (인스턴스)부터 사용 가능,
	//		  클래스 소멸시 사라짐
	//static변수 == 클래스 변수 == 공용변수
	//			java 실행 시 사용 가능 
	//			java 종료 시 사라짐 
	
	//static에서는 
	//static 밖에 못쓴다
	//this 못쓴다
	static void test() {
		System.out.println(pi);
//		color = "흰색"; //color는 후발대
//		this.color this가 생략된 상태 
		//color는 new가 되어야만 쓸 수 있는 변수
		//this는 static 안에서 쓸 수 없다
		//static안에서는 static만 쓸 수 있다--선발대는 선발대가 가져온 것만 쓸 수 있다
	}
	
	void test2(){
		test(); //test는 미리 도착한 것이라 쓸 수 있음
		//but test()는 test2()를 쓸 수 없음
	}	
}
