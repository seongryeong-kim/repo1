package sec04.prac;

public class Calculator오칙연산 {

//계산기 만들기 
//+ - * / %
//1. 두 수를 받아 연산결과를 돌려줌
	//return값 필요하겠다  
//	double a=6;
//	double b=4;
	double plus(double x, double y) {
		double result = x+y;
		System.out.println(result);
		return result;
	}
		
	double minus(double x, double y) {
		double result = x-y;
		System.out.println(result);
		return result;
	}
	
	double times(double x, double y) {
		double result = x*y;
		System.out.println(result);
		return result;
	}
	double divide(double x, double y) {
		double result = x/y;
		System.out.println(result);
		return result;
	}
	double remainder(double x, double y) {
		double result = x%y;
		System.out.println(result);
		return result;
	}
	
//2. 첫번째 숫자, 두번째 글씨, 세번째 숫자
	//오버로딩??
	void result(double x,String a,double y) {
		if(a.equals("+")) {
			plus(x,y);
		} else if(a.equals("-")) {
			minus(x,y);
		} else if(a.equals("*")) {
			times(x,y);
		} else if(a.equals("/")) {
			divide(x,y);
		} else if(a.equals("%")) {
			remainder(x,y);
		}
	}
//	>> (3, "+", 5)
	//if (+){더한 값을 출력}
	//if (-){뺀 값을 출력}
	//if (*){곱한 값을 출력}
	//if (/){나눈 값을 출력}
	//if (%){나머지 값을 출력}
//	알아서 두번째 글씨에 해당하는 연산 결과를 돌려줌 
}
	

