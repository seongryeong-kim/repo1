package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {

		// 기본타입에는 null을 넣을 수 없음
		// int a = null; 기본타입을 null 상태로 바꿀 수 없다
		// null은 숫자가 아니고 상태이기 때문에 int값으로 들어갈 수 없다
		// null은 int도 아니고 double 도 아니다
		
		// 배열 
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있음
		// 생성된 여러 변수들은 index로 관리할 수 있다
		
		//선언방법
		// "int 로 구성된 배열이다"
		int[] score;  // java 스타일
		int score2[]; // c스타일
		
		score = null; //score에는 null이 들어갈 수 있다(참조타입이기 때문에)
		
		int[] score3 = null;
		//int가 아니고 int의 배열이라 null이 가능
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		
		//배열을 생성할 때 크기를 알려줘야 합니다
		
		//비어있는 공간을 예약하고 예약자이름을 쓴다
		//int가 들어가는 방 3개 예약해주세요
		
		//첫번째 [] : (int[] intArray)변수의 이름이 intArray,int[]배열인데 int로 이루어진 배열이다
		//두번째 new int[3]: 배열의 크기; 한번에 만들 변수의 개수
		//					연달아서 타입의 크기만큼 메모리 할당 ~~~ 3자리 있으니까 오세요 그 세자리의 이름이 intArray
		//					첫번째 변수부터 index 0으로 시작
		//세번째 intArray[0]: 만들어진 변수들 중 첫번째 변수를 뜻함
		
		int[] intArray = new int[3];
		intArray[0] = 90; // score_0 변수 90점
		intArray[1] = 60;
	//	intArray[2] = 70;
		/* intArray라는 변수를 인트만 들어가게 
		new쓰고 어떤타입을 몇개 만들어라 인트도되고 더블도되고 스트링이 될수도 있다 (모든 타입가넝)
		new 원하는 타입 [크기]
				intArray[0] 0부터 시작한다
				방 3개를 예약했고 0번방부터 (첫번째 방이 0번방)
		*/
		System.out.println("intArray[1] :"+ intArray[1] ); //출력결과 60 위에서 0=90 작성해뒀으니
		//기본값은 0 또는 false(double에는 0이 없으니까)로 초기화 된다
		System.out.println("intArray[2] :"+ intArray[2] ); //출력결과 0 : 알아서 초기화됨(0 또는 false)
	//	System.out.println("intArray[3] :"+ intArray[3] ); //출력결과 오류 Index 3 out of bounds for length 3
	
		//배열의 모든값을 1로 바꾼다
		intArray[0]=1;
		intArray[1]=1;
		intArray[2]=1;
		int a = 1;
		a++;
		intArray[a]=1;
		
		//for(int i=0 ; i<=3-1 ; i++)
		for(int i=0 ; i<3 ; i++) {
			intArray[i]=1;
		}
		for(int i=0; i<3; i++) {
			System.out.println(intArray[1]);
		}
		
		System.out.println(intArray); //출력결과 [I@59f95c5d 깨진 것처럼 보이지만 깨진 건 아님(메모리주소기반)
		System.out.println(intArray.length); //배열의 크기
		//한번 선언된 배열의 크기는 바꿀 수 없다
		//intArray.length = 4;
		
		//배열을 선언하는 두번째 방법
		//값을 미리 알고 있을 때 
		System.out.println("----------두번째방법");
		int[] intArray2 = new int[] {10,20,30,40};
		for(int i=0; i< intArray2.length ;i++) {
			System.out.println(i);
		}
		// 세번째 방법
		// 선언과 동시에 초기화 할때만 가능
		System.out.println("----------세번째방법");
		int[] intArray3 = {100,200,300,400};
		for(int i=0; i< intArray3.length ;i++) {
			System.out.println(i);
		}
		//값을 미리 알고 있는 경우가 많지 않아서 첫번째 방법이 가장 많이 사용됨 maybe?
		
		// 내이름 +1 내이름+2 이런식으로 출력되게 해보기
		String[] strArray = new String[5];
		for(int i=0;i<strArray.length;i++) {
			strArray[i]="내이름"+(i+1);
		}	
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}	
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("내이름"+i);
//		} 이건 그냥 반복문
		
		// 1~10까지 배열에 넣고
		// 배열의 총 합 출력
		// 배열의 평균값 출력
		int[] score5 = new int[10]; //배열이 10개 
		for(int i =0; i < score5.length; i++) {
			score5[i] = i+1;
		}
		
		//총합
		int sum=0;
		for(int i=0;i < score5.length; i++) {
			sum += score5[i];
		}
		System.out.println("총합 :"+ sum);
		
		//평균
		double avg = (double)sum/score5.length; //평균 55/10=5.5니까 더블 사용
		System.out.println("평균: "+avg);
		
		//한 반에 22명
		//1~4반까지 있음
		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
	
		// 배열인데 어떤배열? 
		// 아까는 int만 들어갈거야 였으면 이번에는 int 배열만 들어갈거야
		
		// 맨 뒤의 []는 배열을 뜻하고 그 앞에 있는 모든건 배열의 내용물
		// int []을 변수들로 관리하는 배열이 된다는 뜻
		//[4]는 천안의 크기 즉 "천안"으로 관리되는 변수의 개수
		int[][]천안 = new int [4][22]; //그런 배열을 4개만들건데 그 배열이 22개까지 가지고 있다
		
		System.out.println(천안); 		//[[I@9e89d68 
		System.out.println(천안[0]); 	//[I@3b192d32
		System.out.println(천안[0][0]);	//0
		
		int[] 클래스1 = 천안[0]; //1차원 int배열
//		int 학생1 = 클래스1[0]; 학생1은 천안도 될 수 있고 클래스도 될 수 있다
		int 학생1 = 천안[0][0];
		
		int[][]수원 = new int[4][22];
		int[][]서울 = new int[4][22];
		
		int[][][]휴먼 = new int[3][4][22];
		System.out.println(22*4*3); //264 
		System.out.println(휴먼);  // [[[I@16f65612 stack영역 주소를 기반으로 출력된 것 이 값은 낼 달라질 수도 있음
		
		System.out.println("휴먼.length :"+휴먼.length); // 3 휴먼은 서울수원천안을 관리함
		System.out.println("휴먼[0].length :"+휴먼[0].length); //4
		System.out.println("휴먼[0][1].length :"+휴먼[0][1].length); //22
		
		int[][] 달력 = new int[12][31];
		for(int i=0; i<달력.length; i++) {
		 
			for(int j=0; j<달력[i].length ;j++) {
				
				System.out.println("i: "+i+", j: "+j+",달력[i][j] : "+달력[i][j]);

			}
		}
		
		//다차원배열
		//호두과자 1열 10개입 옆으로 쫙 깔아두는데 우리반거 맨아래 그 위에 다른반거 그 위에 또다른반거
		//우리가관리하고 싶은건 호두과자 한 알??
		ArrayList list = new ArrayList();
		//arraylist 크기가 알아서 늘어남
		list.add(1);
		list.add("문자");
		list.add(true);
		
		//list는 배열처럼 순서대로 기억함 
		System.out.println(list.get(0) ); 	//1
		System.out.println(list.get(1) );	//문자
		System.out.println(list.get(2) );	//true
		
		//배열의 length에 해당
		System.out.println( list.size() );
		System.out.println( list);
	}

}
