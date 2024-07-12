package sec04.cexam04;

public class Calc {
	
	//정확히 int, int를 보내면
	//자료형이 동일한 것 우선 찾아서 실행
	//만약에 없으면 자동형변환해서 들어갈 수 있는 
	//메소드 찾아서 실행 
	int plus(int x, int y) {
		System.out.println("int int");
		int result = x+y;
		return result;
	}
	double plus(double x, double y) {
		System.out.println("double double");
		double result = x+y;
		return result;
	} //함수 이름을 같게 만들려면 타입은 달라야 한다
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum /2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과: "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	/*
	 * 오버로딩
	 * 1. System.out.println처럼 전달인자를 신경쓰지 않게 하기 위함
	 * 2. 전달인자가 너무 많고 기본값을 입력하는 경우가 빈번할 때
	 * 	  전달인자를 줄이는 목적으로도 사용함
	 */

	void join(String id,String pw, String address, int age, int gender) {
		//5가지 전달인자 필수값 - 5개 다 있어야 실행됨 
		///하지만 여기서 필수값은 id와 pw야 
		//age가 없다면 -1값, gender 가 없다면 -1값
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+pw);
		System.out.println("주소: "+address);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
	}
	
	void join(String id,String pw) { //두번째 join이 첫번째 join을 부르는것
		join(id, pw, null, -1, -1);
	}
}
