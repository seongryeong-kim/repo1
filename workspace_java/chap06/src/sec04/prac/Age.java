package sec04.prac;

public class Age {

//	#문제2
//	up down 게임 - 나이 맞추기
//	임의의 수 0~9에서 하나 결정(랜덤)
//	정답 (3)
//	>>up (시도회수: 1)
//	정답(8)
//	>>down (시도회수: 2)
	int a=((int)(Math.random()*10)); //0~9
	
	int c=1;
	//int age=7; //정답
	
	void game(int age) {
		System.out.println(a);
		System.out.println("시도횟수: "+c++);
		if(a==age) { 
			System.out.println("정답");
		} else if(a>age) {
			System.out.println("down");
		} else if(a<age) {
			System.out.println("up");
		}
	}
}
