package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 91;
		
		// {} 까먹지 않기, 점수가 90인데 score>90 또는 score<90 이라고 할 경우 
		// 두개 다 적용이 되지않음 = 거짓
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			if(score >= 95) {
				System.out.println("95점 이상입니다");
			}
		}
		
		if(score < 90) {
			System.out.println("90점 미만입니다");
		}
		
		//참고로 
		boolean up90 = score >= 90;
		if(up90) {
			System.out.println("up90");
		}
		if(!up90) {
			System.out.println("!up90");
		}
		
		if (up90) {
			System.out.println("참");
		} else {
			//위의 조건이 하나도 만족하지 않는 경우 무조건 실행
			System.out.println("거짓");
		}
		
		System.out.println("---------------");
		if (score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A");
		}
		//위 if 와 관계없이 동작
		if(score <= 90 && score >= 80) {
			System.out.println("90점 미만 80점 이상입니다");
			System.out.println("학점은 B");
		}
		
		//if, else if, else 이런식으로 묶여있으면 그 중 하나만 실행됨
		if(score>=90) {
			System.out.println("학점은 A");
		} else if(score < 90 && score >= 80) {
			// 이 위의 조건이 거짓일 때만 여기로 온다
			System.out.println("학점은 B");	
		} else {
			System.out.println("학점은 C");
		}
		
		//3은 짝수인가?
		int num = 4;
		//Scanner input = new Scanner(System.in);
		//num = input.nextInt();
		if(num % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		// scanner 쓰면 글씨쓰기를 기다리고 있음 글씨쓰면 출력결과 나옴
		
		String a = "abc";
		String b = "abc";
		//if(a == b)
		if(a.equals(b)) {
			System.out.println("a와 b가 같다");
		} else {
			System.out.println("a와 b가 다르다");
		}
		//대소문자 구분 확실히!!
		
		
		double rand = Math.random();
		System.out.println("rand :"+ rand);
		// 0이상 1미만 
			
		// 주사위 : 1~6까지
		/* 내가 푼 것
		* int number = (int)(rand*6);
		* number = number + 1; 	
		* rand = Math.random();
		* System.out.println("주사위 : "+number);
		*/
		
//		선생님이랑 풀기
		int dice = (int)(rand * 6) +1;
		System.out.println("주사위 숫자는 :"+ dice);
		
		if (dice == 6) {
			System.out.println("와 6이 나왔군요");
		}
		
		rand = Math.random();
		int rsp = (int)(rand*3); //0~2
		System.out.println("rsp : "+rsp);
		if (rsp == 0) {
			System.out.println("가위");
		}	else if (rsp == 1) {
			System.out.println("바위");
		}	else {
			System.out.println("보");
		}
		
		int my = 1; //바위
		if(rsp == 0 && my == 0) {
			System.out.println("비김");
		} else if (rsp == 0 && my == 1) {
			System.out.println("내가 이김");
		} else if (rsp == 0 && my == 2) {
			System.out.println("내가 짐");
		}
		
			
		
		
	
		
		
		//내가 한 가위바위보 if
		int number = (int)(rand*6);
		number = (int)(rand*3) + 1; 
		System.out.println(number);
		if (number <= 1) {
			System.out.println("보자기");
		}	else if(number >= 2 && number<3) {
			System.out.println("가위");
		}	else if(number >= 3) {
			System.out.println("주먹");
		}
			
		/* 3주먹
		 * 2가위
		 * 1보자기
		 * 
		 * 가위 = 가위 비겼을 때
		 * 가위 > 바위 졌을 때 
		 * 가위 > 보 	이겼을 때 
		*/
		
		
		//163p switch 활용해보기
		double rand2 = Math.random();
		System.out.println("rand2 :"+ rand2);
		//0이상 1미만
		
		//주사위 1~6까지
		int dice2 = (int)(rand * 6) +1;
		System.out.println("주사위 숫자는 :"+ dice2);
		
		if (dice2 == 1) {
			System.out.println("주사위 1이 나왔습니다");
		} else if (dice2 == 2) {
			System.out.println("주사위 2가 나왔습니다");
		}
		
		// if 중에서 == 또는 equals(String) 인 경우 switch 로 바꿀 수 있다
		switch(dice2) {
			case 1 : 
				System.out.println("주사위 1이 나왔습니다");
				break;
			case 2 : 
				System.out.println("주사위 2가 나왔습니다");
				break;
			case 3 : 
				System.out.println("주사위 3이 나왔습니다");
				break;
			case 4 : 
				System.out.println("주사위 4가 나왔습니다");
				break;
			case 5 : //else if (dice2 == 5)
				System.out.println("주사위 5가 나왔습니다");
				break;
			default : //if의 else
				System.out.println("주사위 6이 나왔습니다");
				break;
		}
		
		int month = 5;
		
		if(month>=3 && month <=5) {
			System.out.println("봄");
		} else if (month >= 6 && month <=8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
//		} else if (month == 12 || month == 1 || month == 2 ) {
//			} else if (month == 12 || (month >= 1 && month <= 2 )) {
		} else {
			System.out.println("겨울");
		}
		
		switch(month) {
		case 3 :
			System.out.println("봄");
			break;
		case 4 :
			System.out.println("봄");
			break;
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
			System.out.println("여름");
			break;
		}
		
		//break가 없을 때 다음 case도 실행되는 원리를 이용해서 
		switch(month) { //month가 3,4,5일때는 봄2
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄2");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름2");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을2");
			break;
		default :
			System.out.println("겨울2");
			break;
		}
		
		//char, byte, short, int(즉, int 이하), String만 허용됨
		//boolean, long, float, double 은 못씀
		
	}

}
