package sec04.prac;

public class Fan {

	//전원상태 저장
	//전원켜기
	boolean isOn = false;
	
	void powerOff() {
		System.out.println("전원을 끕니다");
		isOn=false;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
		isOn =true; 
	}
	
	int wind;
//	int setWind(int wind) {
//		return(1);
//	}
	
//	약풍 기능 1약풍
//	강풍 기능 2강풍
//	-전원이 켜진 상태에서만 바람 나옴
	//조건문 사용해서 powerOff일 경우 작동안되게
	void work(int x) {
		wind=x;
		
			if(wind==1) {
				System.out.println("약풍실행");
			} else if(wind==2) {
				System.out.println("강풍실행");
			} else if(wind!=1||wind!=2) {
				System.out.println("다시 선택");
			}
			return;
		
	}
//전원이 켜지고 약풍이 켜져있는
	
}
