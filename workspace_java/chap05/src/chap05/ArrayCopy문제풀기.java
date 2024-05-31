package chap05;

public class ArrayCopy문제풀기 {

	public static void main(String[] args) {
		// 223p 문제5번 2차원 배열이 주어졌을 때
		// 1. 모두 출력 
		//array1[0]
		 // 2. 합계 출력
		 // 3. 평균 출력 (합개/개수)
		 
//		
//		int[][] array = {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		
//		int sum=0;
//		double avg = 0.0;
//		
//		System.out.println(array[0][0]); //95
//		System.out.println(array[0][1]); //86
//		System.out.println(array[1][0]); //83
//		System.out.println(array[1][1]); //92
//		System.out.println(array[1][2]); //96
//		System.out.println(array[2][0]); //78
//		System.out.println(array[2][1]); //83
//		System.out.println(array[2][2]); //93
//		System.out.println(array[2][3]); //87
//		System.out.println(array[2][4]); //88
//		
//		System.out.println("sum :"+(array[0][0])+(array[0][1])+(array[1][1])+(array[1][2])
//					+(array[1][2])+(array[2][0])+(array[2][1])+(array[2][2])+
//					(array[2][3])+(array[2][4])
//				); //sum :95869296967883938788 이게 아닌디..
//			
//		System.out.println(array.length); //3
//		
//		System.out.println("-------");
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.println("i: "+i);
//			} for(int j=0;j<array[j].length;j++) {
//				System.out.println("j: "+j);
//			}
//		}
		// 여기 위에까지 내가 한거 - 오류남
		//아래는 선생님이랑 해본거
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		// 1. 모두 출력 
		int[] array1 = array[0]; //{95,86}
		//array1[0]
//		System.out.println(array[0][0]); //95
//		System.out.println(array[0][1]); //86
//				
//		System.out.println(array[1][0]); //83
//		System.out.println(array[1][1]); //92
//		System.out.println(array[1][2]); //96
//				
//		System.out.println(array[2][0]); //78
//		System.out.println(array[2][1]); //83
//		System.out.println(array[2][2]); //93
//		System.out.println(array[2][3]); //87
//		System.out.println(array[2][4]); //88
				
		//array[0].length 만큼 
//		for(int i=0; i<array[1].length; i++) {
//			System.out.println(array[0][i]);
//		} 
		for(int j=0; j<array.length; j++) {
			for(int i=0; i<array[j].length; i++) {
				System.out.println(array[j][i]);
			}
		}
				
		//* 2. 합계 출력
		int sum=0;
		int count = 0;
		for(int j=0; j<array.length; j++) {
			for(int i=0; i<array[j].length; i++) {
//				System.out.println(array[j][i]);
				sum = sum + array[j][i];
				count++;
			}
		}
		System.out.println("총합 : "+sum);

		//3-0 모든 개수 세기
		//모든 요소를 하나씩 세기
		System.out.println("개수 : "+count);
		//배열의 크기만 누적
		count = 0;
		for (int i=0; i<array.length; i++) {
		count += array[i].length;
		}
		System.out.println("개수 2: "+ count);
		//* 3. 평균 출력 (합개/개수)
		System.out.println((double) sum/ count);

		//222p 문제 4번 주어진 값에서 최대값 찾기
//		int max=0;
//		int[] arraymax = {1, 5, 3, 8, 2};
//		
//		System.out.println(arraymax.length);
//		
//		for(int i=0;i<arraymax.length;i++) {
//			max=arraymax[i];
//			System.out.println("max: "+max);
//			System.out.println("index :"+i+", 이름: "+arraymax[i]);
//		}
//		
//		System.out.println("max: "+arraymax[3]);
		
		//선생님이랑 해보기
		int[] array2 = {1, 5, 3, 8, 2, 9};
		int max = Integer.MIN_VALUE; //int가 가질 수 있는 최소값, 최대값은 max
		//int max =-1;
		for(int i=0; i<array2.length; i++) {
			if ( array2[i] > max ) {
				max = array2[i];
			}
		}
		System.out.println("최대값 : "+max);		
		
		
	}

}
