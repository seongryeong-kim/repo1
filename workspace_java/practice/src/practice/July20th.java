package practice;

public class July20th {

	public static void main(String[] args) {
		// 7월 20일 토요일 
		// 멘토썜이 만들어준 반복문문제 6번 
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
		for(int a=0;a<2;a++) {
			System.out.print("AA");
			System.out.print("BB");
			System.out.println(" ");
		}
		for(int a=0;a<2;a++) {
			System.out.print("BB");
			System.out.print("AA");
			System.out.println(" ");
		}
		
		//이중for문
		for(int a=0;a<3;a++) {
			System.out.print("a: "+a+" ");
			System.out.print("A");
			System.out.print("B");
			System.out.println(" ");
			for(int b=0;b<3;b++) {
				System.out.print("b: "+b+" ");
				System.out.print("B");
				System.out.print("A");
				System.out.println(" ");
			}
		}
//		ex3) 입력 : 3 -> 출력 :
//		AAABBB
//		AAABBB
//		AAABBB
//		BBBAAA
//		BBBAAA
//		BBBAAA
		for(int a=0;a<3;a++) {
			System.out.println("AAABBB");
		}
		for(int a=0;a<3;a++) {
			System.out.println("BBBAAA");
		}

		//안할래 ^~^
		
		
		
		
		
	}

}
