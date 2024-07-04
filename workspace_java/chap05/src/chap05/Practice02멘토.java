package chap05;

import java.util.Scanner;

public class Practice02멘토 {

	public static void main(String[] args) {

		// Q1. 양의 정수를 하나 입력받아 해당 수가 짝수라면 EVEN, 홀수라면 ODD를 출력하는 프로그램을 작성하세요
//		Scanner scanner = new Scanner(System.in);
//		int scan = scanner.nextInt();
//		//짝수 n%2==0
//		//홀수 n%2==1
//		if(scan%2==0) {
//			System.out.println("EVEN");
//		}else {
//			System.out.println("ODD");
//		}

		// Q2. 정수를 하나 입력받고 해당 수가 양수라면 Positive,
		// 음수라면 Negative, 0이라면 Zero를 출력하는 프로그램을 작성하세요.
//		if(scan>0) {
//			System.out.println("Positive");
//		} else if(scan<0) {
//			System.out.println("Negative");
//		} else if(scan==0) {
//			System.out.println("Zero");
//		}

		// Q3. 정수를 하나 입력받고, 해당 값이 1이라면 one, 2라면 two, 3이라면 three,
		// 그 외의 수라면 other를 출력하는 프로그램을 작성하세요. 이때 switch문을 이용하여 설계해보세요.
//		switch(scan) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("other");
//			break;
//		}

		// Q4. for문을 이용하여 1부터 10까지 출력하고,
		// while문을 이용하여 10부터 1까지 출력하는 프로그램을 작성하세요.
		// 예시 출력 : 1 2 3 4 5 6 7 8 9 10 10 9 8 7 6 5 4 3 2 1
//		for(int a=1;a<=10;a++) {
//			System.out.println(a);
//		}
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}

		// Q5. 시각(시간, 분)을 입력받고, 해당 시각에 35분을 더했을 때의 시각을 출력하는 프로그램을 작성하세요.
//		ex1) 입력: 10 10 -> 출력: 10 45
//		ex2) 입력: 23 45 -> 출력: 0 20
//		ex3) 입력: 12 30 -> 출력: 13 5
//		※시간은 0~23, 분은 0~59 사이의 수이고, 범위 외의 수가 입력될 경우 0 0을 출력합니다.
//		ex4) 입력: 50 0 -> 출력: 0 0
		Scanner scanner = new Scanner(System.in);
		int scan = scanner.nextInt();  //시간
		int scan0 = scanner.nextInt(); //분
		
//		처음에 내가 한거 
//		System.out.println(scan+"시"+(scan0+35)+"분");
//		if((scan>=0 || scan<=23)&&(scan0>=0||scan0<=59)) {
//			System.out.println(scan+"시"+(scan0+35)+"분");
//				if(scan>23||scan0>59) {
//		System.out.println((scan+1)+"시"+(scan0-60)+"분");
//				}}
//					System.out.println((scan-24)+"시"+scan0+"분");
//					if(scan0>59) {
//						System.out.println((scan+1)+"시"+(scan0-60)+"분");
//				}
//			}		
//		} 
		
		if(scan0>=0 && scan0<60 && scan>=0 && scan<24) {
			scan0+= 35;
			if(scan0>=60) {
				scan+=1;
				scan0-=60;
//				System.out.println(scan+"시"+scan0+"분");
			} 
			if(scan>=24) {
				scan =0;
			 
			}System.out.println(scan+"시"+scan0+"분");
		}else {
			System.out.println(0.0);
		}
			
		
		
//		else if((scan>=0 || scan<=23)&&(scan0>59)) {
//			System.out.println((scan+1)+"시"+scan0+"분");
//		} else if((scan>23)&&(scan0>59)) {
//			System.out.println((scan+1)+"시"+scan0+"분");
//		}
		
		//System.out.println(scan+"시"+scan0+"분");

		// Q6. 정수를 하나 입력받아 아래의 형태와 같은 직각 삼각형을 출력하는 프로그램을 작성하세요.
//		ex1) 입력: 3
//		출력:
//		*
//		**
//		***
//		ex2) 입력: 5
//		출력:
//		*
//		**
//		***
//		****
//		*****
//		System.out.println("*"); 1
//		System.out.println("**"); 2
//		System.out.println("***"); 3
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//			System.out.print("*");
//			}System.out.println(" ");
//		}
//		Scanner scanner = new Scanner(System.in);
//		int scan = scanner.nextInt();
//		//int i = scan;
//		
//		for(int i=1;i<=scan;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}System.out.println(" ");
//		}

		// Q7. 정수를 하나 입력받아 아래 형태처럼 "홀수번째 줄만 출력하는" 삼각형을 출력하는 프로그램을 작성하세요.
//		ex1) 입력: 1
//		출력:
//		*
//		ex2) 입력: 3
//		출력:
//		*
//		***
//		ex3) 입력: 4
//		출력:
//		*
//		***
//		ex4) 입력: 5
//		출력:
//		*
//		***
//		*****
//		Scanner scanner = new Scanner(System.in);
//		int scan = scanner.nextInt();

		// 1부터 scan까지, 증감식 홀수 1,3,5 i+=2
//		for(int a=1;a<=scan;a+=2) { //홀수줄 출력
//			for(int b=1;b<=a;b++) { //줄에 *이 몇개 나올지
//				System.out.print("*");
//				
//			} System.out.println(" ");
//		}

		// 조건식 없이 풀어보기
//		for(int a=1;a<=5;a+=2) { 
//			for(int b=1;b<=a;b++) { 
//				System.out.print("*");
//				
//			} System.out.println(" ");
//		}

		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				continue;
			}
			for (int b = 1; b <= a; b++) {	
				System.out.print("*");
			}
			System.out.println(" ");
		}
//ctrl shift enter
	}

}
