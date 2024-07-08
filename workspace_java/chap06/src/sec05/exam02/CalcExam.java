package sec05.exam02;

public class CalcExam {

	//자바가 즉 java.exe 가 특정 클래스를 실행할 때
	//예를 들어 CalcExam 클래스를 실행할 때 
	//CalcExam.main(스트링배열)을 실행한다
	//new CalcExam()하지 않는다	
	
	public static void main(String[] args) {

		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		
		calc1.color="빨강";
		calc1.color="파랑";
		
		System.out.println(calc1.pi);
		
		//static 영역에 썼기 때문에 
		System.out.println(Calc.pi); //new하지 않아도 바로 이렇게 쓸 수 있다
		
		//calc1.pi=3; //이렇게 쓰지 말기
		Calc.pi=3;
		//calc1이 공지사항을 바꿔버림
		System.out.println(calc1.pi); //3.0
		System.out.println(calc2.pi); //3.0
		
		Calc.test();
	}

}
