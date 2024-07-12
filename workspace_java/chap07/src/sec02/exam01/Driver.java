package sec02.exam01;

//대리기사 
public class Driver {

	//아반떼를 운전하는 메소드 , 입력받아서 
//	void run(Avante a) {
//		System.out.println("전달인자로 아반떼만 받음"); //아반떼만 들어올 수 있다
//		a.drive();
//	}
//	
	//이거 하나만 있을 때 대리기사는 스파크 한 대만 운전할 수 있음
//	void run(Spark s) {
//		System.out.println("전달인자로 스파크만 받음");
//		s.drive();
//	}
	
	//대리기사는 자동차만 필요해 그래서 전달인자로 차만 받을 것 
	void run(Car c) {
		System.out.println("전달인자로 Car만 받음");
		c.drive();
	}
}
