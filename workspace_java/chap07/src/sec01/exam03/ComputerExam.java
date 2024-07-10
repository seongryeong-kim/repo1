package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		//7월 10일 340p
		//메소드 재정의 테스트 
		
		double area=0; 
		
		//부모내용 가져옴
//		Calculator calc = new Calculator(); //3.14*반지름*반지름
//		area = calc.areaCircle(10); //10은 반지름
//		System.out.println(area);
		
		//자식내용 가져옴 
		Computer computer = new Computer(); //더 정확한 파이로 계산 3.14195
		area= computer.areaCircle(10);
		System.out.println(area);
		 
	}

}
