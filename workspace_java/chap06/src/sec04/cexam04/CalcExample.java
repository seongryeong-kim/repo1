package sec04.cexam04;

public class CalcExample {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.execute(); //반환해서 출력하는 게 아님
		//excute 를 호출해서 실행됨  
		
		//실행
		//calc.excute(40,20); -- 얘 왜 안되는거여
		calc.execute();
		calc.println("abc");
		calc.avg(4, 50);
		System.out.println("------");
		int a =1;
		double b=a;
		calc.plus(1,1.5);
		
		
	}

}
