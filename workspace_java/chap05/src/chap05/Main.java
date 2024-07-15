package chap05;

public class Main {

	public static void main(String[] args) {

		int a = 1;
		int[] array = new int[1500];
		for(int i =0;i<array.length;i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		array[13] = 7;
		System.out.println(array[13]);
		
		//222p 문제 풀어보기
		int max = 0;
		int[] arr = {1,5,3,8,2};
		//배열 안에 있는 숫자들 
		//최대값 구하기-0번 인덱스를 기준으로 
		//0번 인덱스보다 1번 인덱스가 크면 1번 인덱스의 값 찾아오기
		//2번 인덱스보다 1번 인덱스가 크면 1번 인덱스의 값 찾아오기 
		//0부터 arr.length 작을 때까지 반복
		for(int b=0;b<arr.length;b++) {
			if(max<arr[b]) {
				max=arr[b];
			}System.out.println(max);
		}
		
		System.out.println("----------------------------");
		// 1~10까지 배열에 넣고
				// 배열의 총 합 출력
				// 배열의 평균값 출력
		int num[]=new int[10];
		for(int n=0;n<num.length;n++) {
			num[n] = n+1;
//			System.out.println(num[n]);
		}
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		
		//총합 
		
		System.out.println("7월 15일");
		String[] nam=new String[]{"월","화","수","목","금","토"};
		for(int n=0;n<nam.length;n++) {
			for(int i=0;i<=n;i++) {
				System.out.print(nam[i]);
			}
			System.out.println("");
		}
		//1번째 줄에서 nam[0] 
		//2번째 줄에서 nam[0]+nam[1]
		//3번째 줄에서 nam[0]+nam[1]+nam[2]		
		//4번째 줄에서 nam[0]+nam[1]+nam[2]+nam[3]		
		//5번째 줄에서 nam[0]+nam[1]+nam[2]+nam[3]+nam[4]		
		//6번째 줄에서 nam[0]+nam[1]+nam[2]+nam[3]+nam[4]+nam[5]		
		
		System.out.println("심화반 반복문");
		System.out.println("----------문1. 1~10까지 세로로 출력");
		for(int o=1;o<=10;o++) {
			System.out.println(o);
		}
		
		System.out.println("----------문2. 1~9까지 가로로 출력");
		//123456789
		for(int l=1;l<=9;l++) {
			System.out.print(l);
		}
		
		System.out.println("");
		System.out.println("----------문3. 3씩 잘라서 출력");
//		123
//		456
//		789
//		0
//		123공백-엔터-456공백-엔터-789공백-엔터-0
//		4줄
//			123 
//		+3	456
//		+3	789
	
		for(int l=1;l<=9;l++) {
			System.out.print(l);
			if(l%3==0) {
				System.out.println("");
			}
		}
		System.out.println("----------문4. 1~20까지 짝수만 출력");
		//1에서 20까지
		//n%2==0
		for(int l=1;l<=20;l++) {
			if(l%2==0) {
				System.out.print(l+", ");
			}
		}
		
		System.out.println("");
		System.out.println("----------문5. 짝수의 합");
		//변수 하나 선언하고 
		int even=0;
		//변수에 짝수들 저장하고 반복문이 다 돌면 출력하기 
		for(int l=1;l<=20;l++) {
			if(l%2==0) {
//				System.out.println(l);
				even+=l;
			}
		} 
		System.out.println("합: "+even);
		
		System.out.println("----------문6. 짝수의 개수");
		//짝수가 나올 때마다 1씩 카운트되도록 
		int e=0;
		for(int l=1;l<=20;l++) {
			if(l%2==0) {
				e++;
			}
		} 
		System.out.println("짝수 몇개?: "+e);
		
		
	}

}
