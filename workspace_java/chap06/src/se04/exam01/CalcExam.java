package se04.exam01;

public class CalcExam {

	public static void main(String[] args) {//메인이라는 메소드 선언
		powerOn(); //이건 내꺼
		powerOn(); //powerOn 함수개념
		
		Calc calc = new Calc();
		calc.powerOff(); //전원을 두번 켜고 한번 끄는 실행
		System.out.println(calc);
		Calc calc2 = new Calc();
		System.out.println(calc2);
		
		Calc calc3 = new Calc();
		calc3.powerOn();
		//calc3.isOn = true;
		
		calc2.powerOn();
		
		int result = calc3.plus(3, 8);
		System.out.println("plus결과 : "+result);
		
		double result2 = calc3.divide(4,0); //calc3아니어도 됨
		System.out.println("divide결과 : "+result2);
		
//		int[] a = {2,7};	이렇게 써도 되고
//		int[] a = new int[] {2,7}; 이렇게 써도 되고 아래처럼 써도 됨
		int[] a = new int[2];
		a[0]=2;
		a[1]=7;
		System.out.println( calc3.plus2(a) );
		
		int num = calc.plus3(1,2,3,4);
		System.out.println("plus3 결과: "+num);
		
		num = calc.plus3(1,2,3,4,5,6,7,8,9);
		System.out.println("plus3 결과: "+num);
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
}
