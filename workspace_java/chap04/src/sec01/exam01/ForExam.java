package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 것을 5번 할 예정
		int sum = 0;
		sum = sum + 1; // sum += 1; 과 sum++; 도 가능
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);   
		//하지만 숫자가 커지면 시간이 너무 오래걸림 그래서 반복문을 사용
		
		
		//참고로 1~n까지 더한 값
		// n * (n+1) / 2
		
		//1+2+3+4+5
		sum = 0; //sum 숫자 초기화(변수) 
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println(sum);
		
		//1, 2, 3..에 해당하는 걸 변수안에 넣어보자
		sum = 0;
		
		//초기화식
		int i = 0;
		
		//증감식
		i++; // i == 1
		
		//실행문
		sum = sum + i;		//+1	//sum = sum +1;
		//sum = sum + i+1;	//+2
		
		i++; // i == 2
		sum = sum + i;		//+2
		
		i++; // i == 3
		sum = sum + i;		//+2 
		
		i++;
		sum = sum + i;
		
		/* 0528 170p~
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복되는 것 찾기 Ctrl+c, Ctrl+v 해도 바뀌지 않는 것
		 * 
		 * 2. 반복되지 않는 것 찾기 
		 * 		패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		 * 		변수를 활용해서 반복되게 만들기
		 * 
		 * 	반복되지 않는 것의 
		 * 		시작조건 찾기, 
		 * 		종료조건 찾기
		 * 
		 * for : 반복횟수를 아는 경우
		 * while: 반복횟수를 모르는 경우
		 */
		
		/* 맨 처음 한번만 초기화식 실행
		 * 조건이 참이면 
		 * 실행블럭 실행하고 
		 * 증감식 실행하고 
		 * 다시 조건 보기 반복
		 * for (초기화식; 조건; 증감식) {
		 * 		실행블럭
		 *	}
		 */
		int sum2 = 0;
		for( int e = 1; e <= 5; e++ ) {
			sum2 = sum2 + e;
			//System.out.println("안쪽에서는 e :" + e +", sum2 : "+ sum2);
		}
		System.out.println("for 사용 sum2 : "+sum2);
				
		
		//1부터 10까지 
		int n = 0;
		for (int one = 1; one <=10; one++) {
			n = n + one; 
			// System.out.println("one :"+one+ ", n: "+ n);
		}
		System.out.println(n);
		
		//1부터 10까지 출력 
		// 첫번째 방법
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		/* 반복되는걸 찾는 쉬운 방법
		 * 일단 (반복되는 것을)복사하고 붙여넣기
		 * 마지막으로 변경할 것을 찾기
		 * 그리고 변경하는 규칙찾기
		 * 변경되는 것을 변수로 바꾸기
		*/
		System.out.println(5);
		int i2 = 5+1;
		System.out.println(i2); //6
		i2 = i2 + 1;
		System.out.println(i2); //7
		i2 = i2 + 1;
		// i2++
		System.out.println(i2); //8	
		System.out.println("------------------------");
		
		// for로 만들어보기		
		for(int i3=1; i3 <=10; i3=i3+1)
		// 초기화식에 시작할 숫자 작성하고, 조건에 언제까지 실행할 것인지, 조건 여기서는 숫자 1씩 늘어나는 것
		{
			System.out.println(i3); 
		}
		for(int i3=1; i3 <=10; i3=i3+1){
			//	System.out.print(i3+","); 
				//ln을 쓰지 않으면 엔터없이 옆으로 출력됨
			}
		System.out.println("------------------------");
		
		// 문제1: 1~10까지 짝수만 출력하기
		// 1. 증감식 이용하기  
		System.out.println(2);
		int i4=4;
		System.out.println(i4);
		i4 = i4 + 2; //6
		System.out.println(i4);
		i4 = i4 + 2; //8
		System.out.println(i4);
		
		for(int i5 = 2; i5<=10; i5= i5+2) {
			System.out.println(i5);
		}
		System.out.println("------------------------");
		
		// 2.if문 이용하기 
		int num = 0;
		if(num%2 == 0) {
			System.out.println(num);
		}
		 num =2;
		if(num%2 == 0) {
			System.out.println(num);
		}
		 num = num+1;
			if(num%2 == 0) {
				System.out.println(num);
			}
			
		System.out.println("++++++++++++++");
		for(int num2 = 1;num2<=10; num2++) {
			if(num2 % 2 == 0) {
				System.out.println(num2);
			}
		}
		
		System.out.println("----------");
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		System.out.println("----------");
		
		int even=1;
		System.out.println("나누기2 :"+even/2);
		System.out.println("나머지 :"+even%2);
		if((even%2)==0){
			System.out.println("짝수");
		}
		
		even =2;
		if((even%2)==0){
			System.out.println("짝수");
		}
	
		even = even +1;
		if((even%2)==0){
			System.out.println("짝수");
		}
		even = even +1;
		if((even%2)==0){
			System.out.println("짝수");
		}
		
		System.out.println("-------------");
		
		for(even=1;even<=10;even = even+1) {
			if(even%2==0) {
				System.out.println(even);
			}
		}
			
		/* 문제2 (난이도 높음)
		 * 1~10까지 한줄에 3개씩 출력되도록 
		 */
		System.out.print(1);
		System.out.print(2);
		System.out.print(3); //3
		System.out.println();
		
		int num3 = 3;
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); //6
		if(num3 % 3 == 0) {
			System.out.println();
		}
		
		num3++;
		System.out.print(num3); //7
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); 
		if(num3 % 3 == 0) {
			System.out.println();
		}
		
		for(int num4 = 1; num4 <=10; num4++) {
			System.out.print(num4+", "); 
			if(num4 % 3 == 0) {
				System.out.println();
			}
		}
		
		//1~100까지 3의 배수가 몇개 있는가?
		System.out.println(3);
		System.out.println(6);
		System.out.println(9);
		int i9=9;
		System.out.println(i9+3);
		i9=i9+3;
		System.out.println(i9+3);
		
		for(int i91=1; i91<=100; i91=i91*3) {
			// 이렇게 하면 3의 제곱이 되어버림 System.out.print(i91+", ");
		}
		
		System.out.println("------------------");
		for(int i91=0; i91<=100; i91=i91+3) {
			//배수의 개수가 아니라 배수를 나열함 System.out.print(i91+", ");
		}
		//선생님이랑 같이 해보기
		int count=0;
		for(int t=1; t<=100; t += 1) {
			if(t % 3 == 0 ) {
				count++;
			}
		}
		System.out.println("3의 배수의 개수는: "+ count);
		
		//구구단 2단 출력
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		int cnt = 3;
		cnt++;
		System.out.println("2 * "+cnt +" = "+ (2*cnt));
		
		cnt++;
		System.out.println("2 * "+cnt +" = "+ (2*cnt));
		
		System.out.println("--------2단----------");
		for(int k=1; k<=9; k++) {
			System.out.println("2 * "+k+" = "+ (2*k) );
		}
		System.out.println("---------3단----------");
		for(int k=1; k<=9; k++) {
			System.out.println("3 * "+k+" = "+ (3*k) );
		}
		
		int dan = 3;
		dan++; //4
		System.out.println("--------------------");
		for(int k=1; k<=9; k++) {
			System.out.println(dan+" * "+k+" = "+ (dan*k) );
		}
		dan++; //5
		System.out.println("--------------------");
		for(int k=1; k<=9; k++) {
			System.out.println(dan+" * "+k+" = "+ (dan*k) );
		}
		
		System.out.println("--------------------");
		for(int dan2 = 2; dan2<=9; dan2++) {
			
			System.out.println("--- "+ dan2 +" 단 ---");
			for(int k=1; k<=9; k++) {
				System.out.println(dan2+" * "+k+" = "+ (dan2*k) );
			}
		}
		
		/*교재 171p
		*int som = 0;
		*for(int o=1; o <= 100; o++) {
		* som = som + o;
		*}
		*System.out.println("1~100의 합: "+som);
		*/
			
		int two=0;
//		2*1=2
//		2*2=4
//		2*3=6
//		2*4=8
//		2*5=10
		for(two=1; two<=9; two++) {
			two=two+1;
		}
		System.out.println("2 * "+two+" = "+ (2*two) );
		
		 
		
	}

}
