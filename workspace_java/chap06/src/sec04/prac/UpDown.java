package sec04.prac;

public class UpDown { //선생님이랑 실습 updown게임 문제풀어보기 
	
	int number = (int)(Math.random()*10); //이렇게해도 되고 아래처럼해도 되고
	
	//number의 숫자를 지정하는 기능 
	void setNumber(int num) {
		number = num;
	}
	
	//임의의 수로 교체
	void initNumber() {
		number = (int)(Math.random()*100) % 10;
	}
	
	void hint() {
		System.out.println("number: "+number);
	}
	// up down 정답을 판단하는 기능 
	// 전달인자: int(추측하는 숫자)
	// return 줘도 되고 안줘도 될 것같음
	// 리턴타입: 없음
	void answer(int num) {
		if(number == num) {
			System.out.println("정답입니다");
		} else if(number > num) {
			System.out.println("up");
		} else if(number < num) {
			System.out.println("down");
		}
	}

}