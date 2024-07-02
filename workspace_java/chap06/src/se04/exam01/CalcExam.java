package se04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn(); //이건 내꺼
		powerOn(); //powerOn 함수개념
		
		Calc calc = new Calc();
		calc.powerOff(); //전원을 두번 켜고 한번 끄는 실행
		System.out.println(calc);
		Calc calc2 = new Calc();
		System.out.println(calc2);
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
}
