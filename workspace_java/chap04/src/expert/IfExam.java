package expert;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int a = 10;
		
		//boolean 참 또는 거짓
		boolean b = a < 5; 
		
	//	if(a > 5) {
		if(b) {
			System.out.println(a+"은(는) 5보다 작습니다");
		} else if(a < 15) {
			System.out.println(a+"은(는) 15보다 작습니다");
		} else if(a < 25) {
			System.out.println(a+"은(는) 25보다 작습니다");
		} //이런 경우 a는 15보다 작습니다 하나만 나온다 > 참을 찾으면 그걸 출력하고 종료됨 
		
		
		if(b) {
			System.out.println(a+"은(는) 5보다 작습니다");
		} 
		if(a < 15) {
			System.out.println(a+"은(는) 15보다 작습니다");
		}
		if(a < 25) {
			System.out.println(a+"은(는) 25보다 작습니다");
		}
		//이렇게 다 다른 if문이면 조건에 충족하는 것 모두 출력됨
		
		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;
		
		//and &&만 있는 경우 false를 만나면 그 뒤는 쳐다도 안보고 끝남
		System.out.println(a1 && a3 && a2);
		//String b1 = "치킨";
		String b1 = null;
		if(b1!=null) {
			System.out.println(123);
			
			if(b1.length()>4) {
				System.out.println(b1);
			}
		}
		
		if(b1 != null && b1.length()>4) {
			System.out.println(b1);
		} 
		
		//or ||는 true를 만나면 더 이상 실행하지 않는다
		System.out.println(a1 || a3 || a2);
		
//		System.out.println(false|| true && true); &&연산자 먼저 비교, 
		System.out.println((false|| true) && true); //or먼저 비교되게 하려면 ()괄호!!
		
		if( (30<a)&&(a<50) ) {
			System.out.println("참");
		}
		
		System.out.println("6월 20일 목요일 심화반");
		//7%3 ==1;
		
		double rand = Math.random();
		//double 값1 = rand * 100; //int랑 double 곱하면 큰걸로 바뀜(자동형변환) 그래서 double
					//그리고 이건 항상 100보다 작은 수가 나옴
		//0 <= rand < 100.0 
//		(int)답1; //소수점을 버리니까 99 
		System.out.println( (int)-3.5 );
		
		//5~7까지 랜덤으로 뽑고 싶을 때 
		//5 + (0~2) 
		int a02 = (int)(rand*3);
		//만약 rand *3 괄호 안쓰면 rand변수만 int로 바꾼 후 그걸 3이랑 곱하게 됨
		//int 결과 = a02 + 5; //이러면 0부터 2까지 나온것에 5를 더하니까 5에서 7까지 
		//위처럼 써도 되고 아래처럼 써도 됨
		int 결과 = (int)(Math.random()*3)+5;
		
		int b02 = (int)(Math.random()*6849684)%3; //뭐가 나왔든 나머지는 3보다 작은 0~2
		
		//로또번호는 1~45 필요 그러니까 0~44 까지에 1을 더해 
//		int lotto = (int)(Math.random()*45);
//		lotto +=1;
		System.out.println(((int)(Math.random()*45))+1);
		System.out.println("---------");
		for(int i=0;i<6;i++) {
			System.out.println(((int)(Math.random()*45))+1);
		}
			
//		2,3,2,1
			//내림차순이나 오름차순으로 정렬 1,2,2,3
			//그러면 앞에 있는거랑 뒤에 있는 것만 비교하면 됨
		
		//내 주머니에 1만원있는데 
		//소주 마실 예정
		//소주 : 5000
		//과자 : 2000
		//컵라면 : 1500
		//족발 : 35000
		
		int minus =-7; 
		int plus =30;
//		Scanner scanner = new Scanner (System.in) ;
//		int scan = scanner.nextInt();
//		//0도 영하
//		if(scan>0) {
//			System.out.println("영상입니다");
//			
//		}else {
//			System.out.println("영하입니다");
//			}
		
		if(minus>0) {
		System.out.println("영상입니다");
		
	}else {
		System.out.println("영하입니다");
		}	
		
		if(plus>0) {
			System.out.println("영상입니다");
			
		}else {
			System.out.println("영하입니다");
			}
		
		//1500은 2000과 3000 사이의 값인가 아닌가
		//비교할 값을 2000과 3000사이에 넣기 
		//2000보다 크고, 3000보다 작다 비교연산자를 이용하기
		int aa = 1500;
		if(aa>2000 && aa<3000) {
			System.out.println(aa+"는 2000과 3000사이에 있습니다");
		} else  {
			System.out.println(aa+"는 2000과 3000사이에 없습니다");
		}
		
		//월이 입력되면 계절이 나오도록 
		//3,4,5봄 6,7,8여름 9,10,11가을 12,1,2겨울
//		Scanner scanner = new Scanner(System.in);
//		int scan = scanner.nextInt();
		
		//처음에 내가 한 방법
//		if(scan==3||scan==4||scan==5) {
//			System.out.println("봄");
//		}else if(scan==6||scan==7||scan==8) {
//			System.out.println("여름");
//		}else if(scan==9||scan==10||scan==11) {
//			System.out.println("가을");
//		}else {
//			System.out.println("겨울");
//		}
		
		
		//선생님이 도움주신 방법-or보다 작성할 것이 줄어든다
//		if(scan>=3 && scan<=5) {
//			System.out.println("봄");
//		}else if(scan>=6 && scan<=8) {
//			System.out.println("여름");
//		}else if(scan>=9 && scan<=11) {
//			System.out.println("가을");
//		}else {
//			System.out.println("겨울");
//		}
		
		
		//도움방법2 - 작성할 것이 더 줄어든다
		//1년 12개월이라는 전재하에 사용할 수 있음
//		if(scan <= 2 || scan==12) {
//			System.out.println("겨울");
//		}else if(scan <= 5) {
//			System.out.println("봄");
//		}else if(scan <= 8) {
//			System.out.println("여름");
//		}else if(scan<=11){
//			System.out.println("가을");
//		}
		
		//스캐너로 온도 입력받기 
		//온도 입력받으면 영상( )도 입니다, 영하 ( )도 입니다 출력되게 
		//만약 scan > 0 영상 scan 입니다, scan<=0 영하 scan입니다 
		Scanner scanner = new Scanner(System.in);
		int scan=scanner.nextInt();
		
		if(scan>0) {
			System.out.println("영상"+scan+"도 입니다");
		} else {
			System.out.println("영하"+(scan*-1)+"도 입니다"); 
		}
//switch는 같다만 들어간다 if처럼 >= 이런거 사용x
		
	}

}
