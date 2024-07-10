package practice;

public class Cordinate {

	public static void main(String[] args) {
//		Q3. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 행렬을 출력하는 프로그램을 작성하세요.
//		"같은 줄"에서 "글자 사이 공백"은 반드시 한 칸이어야 합니다(맨 앞 또는 맨 뒤의 공백은 상관없음).
//		입력 값은 1 이상의 int 정수입니다.
//		ex1) 입력 3 -> 출력 :
//		00 01 02
//		10 11 12
//		20 21 22
//		ex2) 입력 4 -> 출력 :
//		00 01 02 03
//		10 11 12 13
//		20 21 22 23
//		30 31 32 33
		/*
		 * 2를 입력했을 때
		00 01
		10 11
		
		시작은 00
		오른쪽 방향의 규칙은? 오른쪽 자리가 0부터 하나씩 늘어남
		어디까지? 입력받은 숫자만큼 
		
		다시 적어보면
		오른쪽 방향의 규칙은?
			입력받은 숫자만큼 반복해서
			오른쪽자리가 0부터 하나씩 늘어남
			단, 왼쪽자리는 계속 유지됨
		아래쪽 방향의 규칙은?
			입력받은 숫자만큼 반복해서
			왼쪽 자리가 0부터 하나씩 늘어남
			단, 오른쪽 자리는 계속 유지됨
			
		어떻게 동시에 출력할까?
		일단 한줄만 해보기 
		00 01 02
		 */
//		int x=0;
//		int y=0;
//		System.out.println(" "+ x + y + " ");
//		
//		y++;
//		System.out.println(" "+ x + y + " ");
		
		//반복되는 것과
		//반복되지 않는 것의 규칙 찾기 
		//반복의 시작 조건
		//반복 종료 조건
		
		//내가 알고 있는 변수들로 충분히 구현 가능할까?
//		int n = 2;
//		int x = 0;
//		for(int y=0; y<2; y++) {
//			System.out.print(" "+ x + y + " ");
//		}
//		System.out.println("");
//		
//		x++;
//		for(int y=0; y<2; y++) {
//			System.out.print(" "+ x + y + " ");
//		}
//		System.out.println("");
		
		int n =4;
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(" "+ x + y + " ");
			}
			System.out.println();
		}
		/*
		Q4. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 별을 찍는 프로그램을 작성하세요
		입력 값은 1 이상의 int 정수입니다.ex1) 입력 3 -> 출력 :
		***
		* *
		***
		ex2) 입력 4 -> 출력 :
		****
		*  *
		*  *
		****ex3) 입력 1 -> 출력 :
		*
		ex4) 입력 2 -> 출력 :
		**
		**
		
		5를 입력하는 경우
		1줄 ***** 12345
		2줄 *   * 1   5 
		3줄 *   * 1   5
		4줄 *   * 1   5
		5줄 ***** 12345
		처음과 맨 마지막 줄은 별*5
		2,3,4줄은 별 첫칸과 마지막칸에 별 2개
		
		조건 
		a=1, b=5일 때 
		a가 * 출력??
*/

//		for(int a=1;a<=5;a++) {
//			for(int b=1;b<=5;b++) {
//				System.out.print("*");
//				if(a>=2&&a<=4) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if( (i>=2&&i<=4)&&(j>=2&&j<=4)) {
				System.out.print(" ");	
				} else {
					System.out.print("*");
				} 
			}
			System.out.println(" ");
		}

//		Q5. 정수 값을 하나 입력받으세요. 그리고 1 * 2 * 3 * ... 순으로 곱했을 때, 그 곱이 입력 값을 넘게하는 순간, 마지막에 곱한 수를 출력하는 프로그램을 작성하세요.
//		입력 값은 2 이상의 int 정수입니다.
//		예를 들어 입력이 20일 때 그 값을 넘게 하는 마지막 곱한 수는 4입니다. (1 * 2 * 3 * 4 = 24)
//		ex1) 입력 :  20 -> 출력 : 4  (1 * 2 * 3 * 4 = 24)
//		ex2) 입력 : 100 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//		ex3) 입력 : 120 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//		ex4) 입력 : 121 -> 출력 : 6  (1 * 2 * 3 * 4 * 5 * 6 = 720)
		//20을 입력했다 치고 
//		i=1
//		i=1+1 =2
//		i=2+1 =3
//		i=3+1 =4
//		증감식이 i++
//		i*=i??
		for(int a=1;a<=4;a++) {
			a=a*(a+1);
			System.out.println(a);
		}
		
		
	}
}
