package chap05;

import java.util.Scanner;

public class ArrayCopy과제 {

	public static void main(String[] args) {
		/*
		 * 223p.
문제 5번
2차원 배열이 주어졌을때
1. 모두 출력
2. 합계 출력
3. 평균 출력(합계를 개수로 나누기)

222p.
문제 4번
임의의 수로 채워진 배열에서 최대값 구하기

배열의 예 : {1,5,2,4}
1. 배열 뒤집기 : {4,2,5,1}
2. 첫번째 자리에 0 넣기 : {0, 1, 5, 2, 4}
3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {4, 1, 5, 2}

배열의 예 : {3,4,7,5,1,4,6,4,5}
4. 홀/짝수의 각각 개수를 출력
5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수

- 여기서부터 조금 어려운 문제
6. 두번째 최대값
7. 내림차순으로 정렬(큰 수부터 작은 수 순으로)

로또 6개 번호(1~45)
8. 중복되지 않게 숫자 선정

9. 자리 예약
자리가 10개 있는 소극장 예약 시스템을 만들자
1~10(또는 0~9)번까지 번호의 자리가 있음
예약할 자리는? 하고 입력 받음
1-1) 예약이 가능하면 "예약했습니다"
1-2) 예약 불가능하면 "이미 예약 되어있습니다"
2) 모든 자리의 예약 가능 여부 출력
3) 예약 가능한 자리만 출력

10. 임시비밀번호 8자리 만들기
1) 모두 다 숫자로
2) 모두 다 소문자로(hint: char ascii)
3) 숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합
		 */
		
	//	배열의 예 : {1,5,2,4}
	//int[] a = {1,5,2,4};
//		1. 배열 뒤집기 : {4,2,5,1}
//		int[] a1 = new int[a.length]; //깊은복사
//		for(int i=0,j=3 ; i<a1.length;i++,j--) {
//			a1[i]=a[j];
//			System.out.print(a[j]);
//		}
		int[] aa = {1,5,2,4};
		aa[0]=1;		
		aa[1]=5;
		aa[2]=2;
		aa[3]=4;
		
		int[] a1 = new int[4];
		a1[3]=4;
		a1[2]=2;
		a1[1]=5;
		a1[0]=1;
		for(int i=0,j=3;i<aa.length;i++,j--) {
			aa[i]=a1[j];
			System.out.print(a1[j]);
		}
	//	a[0];
	//	a1[0];		
			
		System.out.println();
		
	//	2. 첫번째 자리에 0 넣기 : {0, 1, 5, 2, 4}
	//	3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {4, 1, 5, 2}
//		2. 첫번째 자리에 0 넣기 : {0, 1, 5, 2, 4}
//		배열의 예 : {1,5,2,4} 	
int[] b = {1,5,2,4};
int[] b1 = new int [5];
b1[0]=0;
b1[1]=b[0];
b1[2]=b[1];
b1[3]=b[2];
b1[4]=b[3];
	System.out.println(b1.length);
//3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {4, 1, 5, 2}

//배열의 예 : {3,4,7,5,1,4,6,4,5}
//4. 홀/짝수의 각각 개수를 출력
int[] ex = {3,4,7,5,1,4,6,4,5};
//int[] ex = new int[9];
for(int i=0;i<ex.length;i++) {
	if(i%2==0) {System.out.println("짝수"+i);}
	//else if(i%2==1) {System.out.println("홀수"+i);}
	//if(i%2==1) {System.out.println("홀수"+i);}
}
for(int i=0;i<ex.length;i++) {
	if(i%2==1) {System.out.println("홀수"+i);}
}
// 위에 결과가 배열 안의 숫자가 아니라 0~8까지 숫자가 되어버림 
for(int i=0;i<ex.length;i++) {
	if(ex[i]%2==1) {System.out.println("홀수 second try"+i);}
}

//5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
for(int i=0;i<ex.length;i++) {
	if(i>4) {System.out.println("4보다 큰 숫자의 개수"+i);}
} //이것도 배열안의 숫자가 아닌 그냥 0~8까지 큰 숫자가 나옴
		
//int[] array = {3,4,7,5,1,4,6,4,5};
//Scanner scan = new Scanner (System.in);
//int a = scan.nextInt();
//int count = 0;
//for(int i=0;i<array.length;i++) {
//	if(a<array[i]) {
//		count++;
//	}
//}

//6. 두번째 최대값
//		int max = Integer.MAX_VALUE; //int가 가질 수 있는 최소값, 최대값은 max
//		//int max =-1;
//		for(int i=0; i<array.length; i++) {
//			if ( array[i] > max ) {
//				max = array[i];
//			}
//		}
//		System.out.println("최대값 : "+max);		
		
//7. 내림차순으로 정렬(큰 수부터 작은 수 순으로)

//로또 6개 번호(1~45)
//8. 중복되지 않게 숫자 선정
//int[] lotto = new int[6];
//	for(int i=0;i<lotto.length;i++) {
//		double rand=(Math.random() *45)+1;
//		lotto[i]=(int)rand;
//		for(int j=0;j<1;j++) {
//			if(lotto[i]==lotto[j]) {
//				i--;
//			}
//		} 
//	}

int[] lotto = new int[6];
for(int i=0;i<lotto.length;i++) {
	double rand=(Math.random() *45)+1;
	lotto[i]=(int)rand;
	for(int j=0;j<1;j++) {
		if(lotto[i]==lotto[j]) {
			i--;
		}
	} System.out.println(i+"번호 : "+lotto[i]);
}
	
//9. 자리 예약
//자리가 10개 있는 소극장 예약 시스템을 만들자
//1~10(또는 0~9)번까지 번호의 자리가 있음
//예약할 자리는? 하고 입력 받음
//1-1) 예약이 가능하면 "예약했습니다"
//1-2) 예약 불가능하면 "이미 예약 되어있습니다"
//2) 모든 자리의 예약 가능 여부 출력
//3) 예약 가능한 자리만 출력
//
//10. 임시비밀번호 8자리 만들기
//1) 모두 다 숫자로
//2) 모두 다 소문자로(hint: char ascii)
//3) 숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합



	}

}