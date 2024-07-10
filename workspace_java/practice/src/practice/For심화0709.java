package practice;

//import java.util.Scanner;

public class For심화0709 {

	public static void main(String[] args) {

//		Scanner scanner= new Scanner(System.in);
//		int scan=scanner.nextInt();
		// int s=scanner.nextInt();
//		Q1. 우선 int 정수 값을 하나 입력받으세요.
//		 그리고 입력한 값만큼 정수를 더 입력받고, 해당 정수들의 합을 출력하는 프로그램을 작성하세요.
//		입력 값은 1 이상의 정수이고, 합은 int의 최대값을 넘지 않습니다.
//		ex1) 입력 : 3 1 2 3 -> 출력 : 6
//		ex2) 입력 : 5 2 2 2 2 2 -> 출력 : 10
//		ex3) 입력 : 1 1 -> 출력 : 1
		// 4번 입력받기---5 6 4 2 = 17
		// a 입력받기
		// b a만큼 더 정수입력받기
		// 해당 정수들의 합을 출력
//		int sum=0;
//		for(int a=1;a<=scan;a++) {
//			int t=scanner.nextInt();
//			sum += t;  
//			System.out.println(a+"번째 도는중");
//		}
//		System.out.println(sum);

//		Q2. 정수 값을 두 개 입력받고, 첫 번째 입력 값을 두 번째 입력 값만큼 제곱해서 출력하는 프로그램을 작성하세요. 
//		입력 값은 1 이상, 10 이하의 정수입니다.

		// 제곱
		// 2랑 4를 입력 받았을 때 2를 네번 곱하기
		// 2*2*2*2
		// 3이랑 5를 입력 받았을 때 3을 5번 곱하기
		// 3*3*3*3*3

		// 스캔없이 해보기
//		int a = 2;
//		int b = 10;
//			for(int c=1;c<b;c++) {
//				a *= 2;
//			} System.out.println(a);

		// 스캐너 이용해서 해보기
//		int n1=scanner.nextInt();
//		int n2=scanner.nextInt();
//		long ret=n1;
//		for(int i=0;i<n2-1;i++) {
//			ret *= n1;
//		}
//		System.out.println(ret);

//		Q3. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 행렬을 출력하는 프로그램을 작성하세요.
//		"같은 줄"에서 "글자 사이 공백"은 반드시 한 칸이어야 합니다(맨 앞 또는 맨 뒤의 공백은 상관없음).
//		입력 값은 1 이상의 int 정수입니다.
		// scan = 3;
//		00 01 02
//		10 11 12
//		20 21 22
//		for (int a = 0; a < scan; a++) {
//			for (int b = 0; b < scan; b++) {
//				System.out.print(a);
//				System.out.print(b);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
//		Q4. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 별을 찍는 프로그램을 작성하세요
//		입력 값은 1 이상의 int 정수입니다.ex1) 입력 3 -> 출력 :
//		***
//		* *
//		***
//		ex2) 입력 4 -> 출력 :
//		****
//		*  *
//		*  *
//		****
//		ex3) 입력 1 -> 출력 :
//		*
//		ex4) 입력 2 -> 출력 :
//		**
//		**

		//4*4 정사각형 만들기
		for(int a=1;a<=4;a++) {
			System.out.print("*");
			for(int b=1;b<4;b++) {
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("");
		}
		System.out.println("-------------");
		
		//4*4 정사각형 테두리 만들기
		//여기부터 가운데 공백 넣는방법 찾기
		for(int a=1;a<=4;a++) {
			System.out.print("*");
			for(int b=1;b<=4;b++) {
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("");
		}
		
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		
//		Q5. 정수 값을 하나 입력받으세요. 그리고 1 * 2 * 3 * ... 순으로 곱했을 때, 그 곱이 입력 값을 넘게하는 순간, 마지막에 곱한 수를 출력하는 프로그램을 작성하세요.
//		입력 값은 2 이상의 int 정수입니다.
//		예를 들어 입력이 20일 때 그 값을 넘게 하는 마지막 곱한 수는 4입니다. (1 * 2 * 3 * 4 = 24)
//		ex1) 입력 :  20 -> 출력 : 4  (1 * 2 * 3 * 4 = 24)
//		ex2) 입력 : 100 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//		ex3) 입력 : 120 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//		ex4) 입력 : 121 -> 출력 : 6  (1 * 2 * 3 * 4 * 5 * 6 = 720)

//		Q6. 정수를 하나 입력받고, 아래의 형태처럼 출력하는 프로그램을 작성하세요.
//		입력 값은 1 이상의 int 정수입니다.
//		ex1) 입력 : 1 -> 출력 :
		
//		AB
//		BA
//		ex2) 입력 : 2 -> 출력 :
//		AABB
//		AABB
//		BBAA
//		BBAA
		
		for(int a=1;a<=2;a++) {
			System.out.print("A");
//			System.out.print("B");
		}
//		ex3) 입력 : 3 -> 출력 :
//		AAABBB
//		AAABBB
//		AAABBB
//		BBBAAA
//		BBBAAA
//		BBBAAA
		
//		Q7. 정수를 하나 입력받고, 아래의 형태처럼 출력하는 프로그램을 작성하세요.
//		입력 값은 1 이상 26 이하의 정수입니다.
//		ex1) 입력 : 1 -> 출력 :
//		A
//		ex2) 입력 : 2 -> 출력 :
//		AB
//		BB
//		ex3) 입력 : 3 -> 출력 :
//		ABC
//		BBC
//		CCC
//		ex4) 입력 : 6 -> 출력 :
//		ABCDEF
//		BBCDEF
//		CCCDEF
//		DDDDEF
//		EEEEEF
//		FFFFFF
	}

}
