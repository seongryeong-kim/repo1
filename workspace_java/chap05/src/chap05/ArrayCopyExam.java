package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {
//0531 배열의 복사 217p
		//커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0]="따뜻한 아메리카노";
		coffee[1]="라떼";
		coffee[2]="말차";
		
		//커피 2호점에서 1호점과 똑같은 커피를 판매할 겁니다
		//String[] coffee2 = new String[3]
		/*
		 * 얕은 복사 또는 shallow copy, thin clone, call by reference
		 * stack 영역의 값만(즉 주소만 복사)
		 * 특징은 원본이 바뀌면 당연히 내 값도 바뀜 
		 */
		String[] coffee2 = coffee; //얕은 복사
		for(int i=0;i<coffee2.length;i++) {
			System.out.println(coffee2[i]);
		}
		
		//얕은 복사로 연결되어 있기 때문에 
		//내것을 바꿔도 원본이 바뀐다
		//원본의 주소를 공유하고 있기 때문에 같은 coffee나 coffee2는 같은거다
		coffee2[1]= "연유라떼";
		System.out.println("coffee2[1]의 값을 바꾸고 원본인 coffee출력");
		for(int i=0;i<coffee.length;i++) {
			System.out.println(coffee[i]);
		}
		
		//새로운 불당점 카페, 1호점 메뉴를 따라 할 거니까 coffee.length
		//[]3을 적어도 되는데 변수를 써두면 원본 숫자가 바뀔 때 별도로 수정하지 않아도 됨
		
		//할 일: 크기와 내용을 동일하게 가지는 새로운 배열을 만들겠다
		//원본과 크기를 똑같이 만들고 차례대로 복사하면 깊은 복사가 됨
		/*
		 * 깊은 복사 또는 deep copy, deep clone, call by value(값으로 호출한다)
		 * heap 영역의 새로운 주소에 자리를 마련하고 변수에 주소를 넣는다
		 * 그리고 원본의 값들을 복사해서 채워넣는다
		 * 그래서 원본과 동일한 게 생기지만 전혀 다른 주소를 가지게 된다
		 * 즉, 내 값을 바꿔도 원본과 관계 없음
		 */
		String[] coffee3 = new String[coffee.length];
		// coffee3[0] = "따뜻한 아메리카노"; 수동이니까 원본이 바뀌면 별도로 수정해야함 그래서 아래처럼 작성
		coffee3[0] = coffee[0];
		for(int i=0;i<coffee3.length;i++) {
			coffee3[i] = coffee[i];
		}
		System.out.println("coffee3 출력: ");
		coffee3[2] = "아샷추";
		//우리는 연유라떼 안팔고 그냥 라떼 팔거야
		for(int i=0;i<coffee3.length;i++) {
			System.out.println(coffee3[i]);
		}
		System.out.println("coffee3[2]의 값을 바꾸고 원본인 coffee출력");
		for(int i=0;i<coffee.length;i++) {
			System.out.println(coffee[i]);
		}
		//불당점 카페에서는 (1호점에서 팔지않는)사라다빵을 만들고 싶다
		//뒤에다가 사라다 빵을 추가하려면 어떻게 해야할까
		coffee3 = new String[]{"따뜻한 아메리카노","연유라떼","아샷추","사라다빵"};
		//위 방법처럼 해도 되는데 메뉴가 100개일 경우 백가지를 다 써야한다는 불편함
		System.out.println(coffee3[3]); //이렇게하면 사라다빵이 나온다 
		
		//커피의 크기보다 하나 큰 배열을 만든다 그리고 커피라고 하는 원본을 가져옴 
		//그 다음 마지막에 사라다 빵을 직접 작성함 (아래 주석이랑 같은말)
		
		/*
		 * 전략: coffee의 크기보다 1개많은 새로운 배열을 만들고
		 * 앞에서부터 복사해두고 
		 * 마지막에 추가할 값을 적어보자
		 */
		coffee3=new String[coffee.length+1]; //이렇게 하면 총 4개의 방을 갖고 있음
		//앞에 3개만 복사 
		for(int i=0;i<coffee.length;i++) {
			coffee3[i]=coffee[i];
		}
		//coffee3[length-1]
		coffee3[3] = "사라다빵";
		System.out.println("-----4번째 메뉴를 추가한 결과");
		for(int i=0;i<coffee3.length;i++) {
		
		// System.out.println(coffee3[i]);
			String menu = coffee3[i];
			System.out.println(menu);
		}
//		내가 한거 - 오류남 ㅎㅎ out of bounds 어쩌구 저쩌구....
//		String[] coffee4 = new String[3];
//		coffee4[0]=coffee[0];
//		coffee4[1]=coffee[1];
//		coffee4[2]=coffee[2];
//		coffee4[3]="사라다빵";
//	
//		System.out.println(coffee[3]);

		//향상된 for문 220p
		System.out.println("향상된 for문");
		for(String menu:coffee3) {
			System.out.println(menu);
		}
		
		//모든 자식배열의 크기가 같게 설정할 수 밖에 없음
		int[][] a2 = new int [10][100];
		//자식 별로 크기를 다르게 선언할 수 있음 
		int[][] a3 = {{1,2},
					{1,2,3}
					};

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
				 
		// 222p 문제 4. 주어진 배열에서	최대값 찾기 
		// 전략: 배열의 첫번째 값부터 혹은 절대 나올 수 없는 최저치를 기준으로 
		// 기준값과 비교해서 큰 값을 새로운 기준으로 정한다
		// 그렇게 살아남은 값이 최대값
		
//		혼자 한
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
