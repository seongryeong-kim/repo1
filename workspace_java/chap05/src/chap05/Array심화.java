package chap05;

import java.util.Scanner;

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

//		System.out.println(a); 
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
			if (same != true) {
				System.out.println(q5[f]);
			}
		}
//		System.out.println();
//			q5[1]을 q5[0]이랑 비교
//			q5[2]을 q5[1]이랑 q5[0]이랑 비교

//			q5[f]=f+1;
//			System.out.println(q5[f]);

//		if(q5[f-1]==q5[f]) {
//			System.out.println();
//		}

		// boolean 말고 int 타입 변수 만들어서 해보기
//	      int arr[] = new int[] { 1, 2, 2, 3, 2 };
//
//	      for (int i = 0; i < arr.length; i++) {
//	         int  check = 1;
//	         for (int j = 0; j < i; j++) {
//	            if (arr[i] == arr[j]) {
//	               check = 0;
//	               break;
//	            }
//	         }
//	         if (check == 1) {
//	            System.out.print(arr[i] + " ");
//	         }
//	      }
//	   }
//	}

		System.out.println("-------문제6-------");
//		Q6. 10개의 정수를 입력받고, 서로 다르게 입력된 수는 총 몇 개인지 출력하는 프로그램을 작성하세요.
//		이때 입력될 수 있는 값은 0 ~ 9입니다.
//		ex1) 입력 : 0 1 2 3 4 5 6 7 8 9 -> 출력 : 10
//		ex2) 입력 : 0 0 1 2 3 4 5 6 7 8 -> 출력 : 9
//		ex3) 입력 : 1 2 1 2 1 2 1 2 1 2 -> 출력 : 2
//		ex4) 입력 : 3 3 3 3 3 3 3 3 3 3 -> 출력 : 1

		// 변수 하나 저장해두고 앞에 있는 것과 비교해서 같으면 카운트하기
		int count = 0;

		// 숫자 10개를 입력받으니까 입력받는 숫자를 배열에 저장해두기
		// 숫자 입력받는 건 나중에 해보고
		// 배열 안에 들어가는 숫자 안다고 생각하고 해보기
//		int q6[]=new int[10];

		// 반복문
		// 0번 인덱스부터 9번까지 10번 돌고
		// 1씩 증가
//		for(int s=0;s<q6.length;s++) {
//			//비교대상 돌리는 반복문2
//			//q6[0]과 q6[1]를 비교 
//			//q6[0] == q6[1] 라면 count++;
//			System.out.println("s: "+s);
//			for(int c=1;c<q6.length;c++) {
//				if(q6[s]==q6[c]) {
//					
//					System.out.println("c: "+c);
//				}
//			}
//		}
//		System.out.println(count);
		// 0~9만 입력받는 조건

		// 다시!!!
		// 수 저장할 변수

		// 먼저 배열 s번 돌기

		int q6[] = new int[] { 1, 2, 1 };

		for (int s = 0; s < q6.length; s++) { // 배열 0번 인덱스부터 2번 인덱스까지 3번 반복
			int c = 0; // 중복이 발생하면 저장할 변수

			// q6[4]라면 앞에 있는 값들이랑 4번 비교
			int save = q6[s];
			for (int d = 0; d < q6.length; d++) {
//				System.out.println("d: "+d); d가 0,1,2일 때 돌고있음
				if (q6[s] == q6[d]) {
					c++;
					// 중복발생
					// c가 1씩 커짐
					// 중복없이 첫번째 나온 수는 1
					// 중복이 있다면 c는 2 이상이 됨 
				}
			}
			
			if (c >= 2) { //c가 2이상이라면 중복되는 수 
				System.out.println(save + "은(는) 중복");
			}
		}
		
		//서로 다르게 입력된 수가 몇개인지 구하기 
		System.out.println("배열 2개 이용");
		//현우오빠가 알려준 방법 6번풀기
		//아니 이거 이상한디..
		Scanner scan = new Scanner(System.in);
//		int qq[] = new int[] { 1, 2, 1 };
	      int[] array1 = new int[3];
	      int[] array2 = new int[3];
	      for (int i = 0; i < array1.length; i++) {
	         int num = scan.nextInt(); //숫자 3번 입력받기 
	         array1[i] = num; //내가 입력한 변수로 배열 만들기
	         array2[num]++;  
	         System.out.println("array2["+num+"] : "+array2[num]);
	      }

	      int cnt = 0;
	      for (int i = 0; i < array2.length; i++) {
	    	  if(array2[i]>0)
	    		  cnt++;
	    	  
	      }
	      System.out.println(cnt);
	      
//	      for (int i = 0; i < array1.length; i++) {
//	         for (int j = 0; j < i; j++) {
//	            if (array1[i] == array1[j]) {
//	               same = true;
//	            }
//	         }
//	         if (same == false) {
//	            System.out.println(array1[i]);
//	         
//	         }
//	         same=false;


	}

}
