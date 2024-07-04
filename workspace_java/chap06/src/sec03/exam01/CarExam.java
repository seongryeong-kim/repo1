package sec03.exam01;

public class CarExam {

	public static void main(String[] args) {
//CarExam(){}; 생성자가 생략된 상태
		
		//new Car(); 이렇게 하면 생성이 된 것
		//전달인자를 내가 입력했을 때
		Car myCar = new Car("검정", 2500);
		myCar.print();
		
		//전달인자 없는 메소드로 실행
		//전달인자를 입력하지 않았을 때 결과는 자동으로 생성되는 회색, 1000이 출력됨 
		Car myCar2 = new Car();
		myCar2.print();
	}

}
