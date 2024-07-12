package sec01.exam04_super_food;

public class Car {
//	자바 상속 실습 
//	다음의 클래스를 상속받은 클래스 2개 이상 만드시오 
//	단, drive( )메소드는 필수 

	Car(){
		System.out.println("Car 생성자");
	}

//	필드
//	자동차 공통적인 특성 
//	모델명, 핸들, n인승, 문, 최대속도, 주유방법
	String name; //모델명
	int seat; //좌석/ 인승
//	int speed; //속도
	String fuel; //연료 
//	String handle;
//	int door;

//	메소드	
	void drive() {
//		this.name=name;
		System.out.println(this.name+"의 운전을 시작합니다");
	}
//	void handle() {
//		System.out.println("핸들");
//	}	
	void seat() {
//		this.seat=s;
		System.out.println(this.name+"은(는) "+ this.seat +"인승 입니다");
	}
	
	void speed(int sp) {
		if(sp>=0&&sp<=180) {
			System.out.println("현재 속도는 "+sp+"입니다");
		} else {
			System.out.println("입력 속도는"+sp+" 입니다");
			System.out.println("최대속도 180을 넘을 수 없습니다");
		}
	}
	
//	int door(int d) {
//		System.out.println("문이 "+d +"개 입니다");
//		return d;
//	}
	
	void fuel() {
		System.out.println(this.fuel+" 연료 입니다");
	}
	
	
}
