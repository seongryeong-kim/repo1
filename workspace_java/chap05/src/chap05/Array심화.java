package chap05;

//import java.util.Scanner;

public class Array심화 {

	public static void main(String[] args) {

//		Q1. 크기가 10인 배열을 선언하고, 1부터 10까지의 값을 배열에 저장하고 출력하는 프로그램을 작성하세요.
//		예시) 입력 : 없음, 출력 : 1 2 3 4 5 6 7 8 9 10
		int[] a = new int[10];
		for (int b = 0; b < 10; b++) {
			int c = b + 1;
			a[b] = c;
		}
		for (int b = 0; b < 10; b++) {
			System.out.print(a[b] + " ");
		}

//		Q2. 크기가 10인 배열을 선언하고, 1부터 10까지의 값을 배열에 저장하고 역순으로 출력하는 프로그램을 작성하세요.
//		예시) 입력 : 없음, 출력 : 10 9 8 7 6 5 4 3 2 1
		int[] q2 = new int[10];
		for (int b = 0; b < 10; b++) {
			q2[b] = b + 1;
		}
		System.out.println(" ");
		System.out.println(q2[2]);
		for (int c = (q2.length - 1); c >= 0; c--) {
			System.out.print(q2[c] + " ");
		}

//		Q3. 10개의 양의 정수를 입력받고, 입력받은 수 중에서 가장 큰 값을 출력하는 프로그램을 작성하세요.
//		ex1) 입력 : 1 4 10 5 6 3 2 7 8 1 -> 출력 : 10
//		ex2) 입력 : 50 20 30 44 15 16 76 81 99 10 -> 출력 : 99

//		Scanner scanner = new Scanner(System.in);
//		int[] s = new int[10]; 
//		int b=0; // 인덱스 0번부터 9까지
//		int m = 0;
////		입력받는 수 10개...를 max 배열에 넣고
//		for(b=0;b<s.length;b++) {
//			int scan = scanner.nextInt();
//			s[b]=scan;			
//		}
//		s[0]인덱스와 0을 저장한 변수 m을 비교해서 0번인덱스의 값이 크다면
//		m이 s[0]의 값이 되도록 조건식
//		if(s[0]>m) {
//			m=s[0];
//		}
//		for(b=0;b<s.length;b++) {
//			if(s[b]>m) {
//				m=s[b];
//			}
//		}
//		System.out.println(m);

		System.out.println("");
		System.out.println("-----문제4-----");
//		Q4. Lorem.txt 파일에 있는 내용에서 문자 a가 몇 번 등장하는지 찾아서 출력하는 프로그램을 작성하세요.
//		이때 Lorem.txt 파일의 내용을 복사해서 아래와 같이 사용하세요.
//		char[] lorem = "여기에 파일 내용 복사".toCharArray();
//		이렇게 하면 문자열을 배열처럼 사용할 수 있습니다.
//
//		입력은 없고, a의 총 개수가 출력되어야 합니다.

		char[] lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
				.toCharArray();
//		System.out.println(lorem.length);
		// 조건: 문자 a가 등장하면 1씩 카운트
		int l = 0;
		for (int o = 0; o < lorem.length; o++) {
			if (lorem[o] == 'a') {
				l++;
			}
		}
		System.out.println(l);

//		Q5. 5개의 양의 정수를 입력받고, 입력받은 수들을 차례대로 출력하는 프로그램을 작성하세요.
//		이때, 중복된 수는 "한 번만" 출력합니다.(한 번 출력된 수는 다시 출력하지 않습니다)
//		ex1) 입력 : 1 2 3 4 5 -> 출력 : 1 2 3 4 5
//		ex2) 입력 : 1 2 2 3 2 -> 출력 : 1 2 3
//		ex3) 입력 : 1 1 1 1 1 -> 출력 : 1
//		ex4) 입력 : 1 2 1 1 1 -> 출력 : 1 2

//		어떻게 출력할지..
//		12232 를 입력받았다 치고
//		1.오름차순 정렬 ---- 신경x
//		q5[0]와 q5[1]을 비교해서 q5[0] > q5[1]  라면 
//		q5[1]과 q5[0] 자리를 변경
//		
//		if(q5[0]>q5[1]){
//			q5[0]=q5[1];
//		}

//		2.중복삭제
//		만약 앞에 있는 숫자랑 비교해서 같다면 출력하지 않기 - 넘어가기

		System.out.println("------문제5");

		int[] q5 = new int[] { 1, 2, 2, 3, 2 };

		boolean same = false;
		
		for (int f = 0; f < 5; f++) {
			same = false;
//			System.out.println(f);
//			for (int e = f - 1; e > 0; e--) {
			for (int e = 0; e < f; e++) {
				if (q5[f] == q5[e]) {
//					System.out.print("");
					same = true;
//					break;
				} 
			}
			
//			same = false;
			if(same!=true) {
				System.out.println(q5[f]);
			}
//		System.out.println();
//			q5[1]을 q5[0]이랑 비교
//			q5[2]을 q5[1]이랑 q5[0]이랑 비교

//			q5[f]=f+1;
//			System.out.println(q5[f]);
		}

//		if(q5[f-1]==q5[f]) {
//			System.out.println();
//		}

	}

}
