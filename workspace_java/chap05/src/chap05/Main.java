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
		
	}

}
