package sec04.prac;

public class Calculator오칙연산Exam {

	public static void main(String[] args) {

		Calculator오칙연산 calc = new Calculator오칙연산();
		calc.plus(4, 6);
		calc.minus(5, 1);
		calc.times(5, 2);
		calc.divide(6,3);
		calc.remainder(4, 3);
		
		calc.result(3,"+",5);
		calc.result(3,"-",5);
		calc.result(3,"*",5);
		System.out.println(calc.plus(3,3));
	}

}
