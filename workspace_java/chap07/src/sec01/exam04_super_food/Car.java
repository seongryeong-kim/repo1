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
	String name;
	int seat;
	int speed;
	String type; 
//	String handle;
//	int door;

//	메소드	
	void drive(String name) {
		this.name=name;
		System.out.println(name+"의 운전을 시작합니다");
	}
//	void handle() {
//		System.out.println("핸들");
//	}	
	int seat(int s) {
		this.seat=s;
		System.out.println(this.name+"은(는) "+s +"인승 입니다");
		return s;
	}
	
	void speed(int sp) {
		if(sp>=0&&sp<=180) {
			System.out.println("현재 속도는 "+sp+"입니다");
		} else {
			System.out.println("최대속도 180을 넘을 수 없습니다");
		}
	}
	
	int door(int d) {
		System.out.println("문이 "+d +"개 입니다");
		return d;
	}
	
	
}
