package sec01.exam01;

//import java.util.Scanner;

public class For연습Exam {

	public static void main(String[] args) {
		
		//주어진 수가 양수(0포함), 음수 여부 출력
		//Scanner scan = new Scanner(System.in);
//		int a = 0;
//		System.out.println("숫자를 입력하세요");
//		int a = scan.nextInt();
//		if(a>=0) {
//			System.out.println(a +" : 양수");
//		} else {
//			System.out.println(a +" : 음수");
//		}
		
		/*입력을 3번 반복
		for(int i=1; i<=3; i++) {
			System.out.println("숫자를 입력하세요");
			int a = scan.nextInt();
			if(a>=0) {
			System.out.println(a +" : 양수");
			} else {
			System.out.println(a +" : 음수");
			}
		}
		*/
		
		//입력받은 숫자가 0이 아닌 동안 계속 반복
//		for(int a = 1; a!=0;  ) {
//			System.out.println("숫자를 입력하세요(종료:0)");
//			a = scan.nextInt();
//			if(a>=0) {
//			System.out.println(a +" : 양수");
//			} else {
//			System.out.println(a +" : 음수");
//			}
//		}
//		System.out.println("종료되었습니다");
		

		//피라미드게임
		/*0단계
		 * +
		 * +
		 * +
		 * +
		 * +
		 */
		//System.out.println("+");
		//System.out.println("+");
		System.out.println("0단계");
		for(int i=1; i<=5; i++) {
			System.out.println("+");
		}
		
		/* 1 단계
		 * +++++
		 */
		System.out.println("1단계");
		int n = 5;
		for(int i=1; i<=n; i++){
			System.out.print("+");
			}
		System.out.println( );
		
		/* 2 단계
		 * +++++
		 * +++++
		 * +++++
		 */
		System.out.println("2단계");
		for(int j=1; j<=3; j++){
			for(int i=1; i<=5; i++) {
			System.out.print("+");
			}
		System.out.println( );
		}
		
		//2-1단계
		//+ + + + +
		System.out.println("2-1단계");
		//System.out.println("+");
		//System.out.println(" ");
		for(int i=1; i<=5; i++) {
			System.out.print("+");
			System.out.print(" ");
		}
		System.out.println();
		
		//3단계 
		System.out.println("3단계");
		System.out.println("+    ");
		System.out.println("++   ");
		System.out.println("+++  ");
		System.out.println("++++ ");
		System.out.println("+++++");
		System.out.println("---3단계");
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("+");
			}
		System.out.println(" ");
		}
		
		System.out.println("4단계");
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("+");
			}
		for(int q=1; q<=(5-i); q++) {
				System.out.print(".");
			}
		System.out.println(" ");
		}
		
		System.out.println("5단계");
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=(5-i); j++) {
				System.out.print(".");
			}
		for(int q=1; q<=i; q++) {
				System.out.print("+");
			}
		System.out.println(" ");
		}
		
		System.out.println("6단계");
	/*	....+
	*	...+++
	*	..+++++
	*	.+++++++
	*	+++++++++
	*/
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=(5-i); j++) {
				System.out.print(".");
			}
		for(int q=1; q<=(i*2-1); q++) {
				System.out.print("+");
			}
		System.out.println(" ");
		}
		
		System.out.println("7단계");
			for(int i=1; i<=5; i++) {
				for (int j=1; j<=(5-i); j++) {
					System.out.print(".");
				}
			for(int q=1; q<=(i*2-1); q++) {
					System.out.print("+");
				}
			for(int q=1; q<=(5-i); q++) {
				System.out.print(".");
			}
			System.out.println(" ");
			}
		
	}
}
