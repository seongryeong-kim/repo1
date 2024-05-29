package sec01.exam01;

public class Operator연산자Exam {

	public static void main(String[] args) {
		
		int a = 10;
//		a = 11;
//		a = 10+1;
		int b = a + 1; 
		
		//a= 10 + 1
		a = a + 1; // a = 1 + a
		a += 1;	   // a = a + 1  과 같다
		a++;	   // a += 1와 같다	
		++a;
		
		a = 10;
		a++;
		System.out.println("a : "+a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--; 	  // a = a - 1과 같다
		--a;
		
		a = 10;
		a--;
		System.out.println("a : "+a);
		//현재 a가 9
		System.out.println("++a : "+ ++a); //출력 10
		//현재 a가 10
		System.out.println("a++ : "+ a++); //출력 10
		System.out.println("a : "+ a);
		//현재 a가 11
		
		System.out.println(a++ + ++a); 
		//11 + (a가 12가 된 상태)에다가 1 더하기  결과는 (11+13=)24
		//위 내용 풀어쓰기
		a = 11;
		int result = a; //a
		a = a + 1;		//a 다음에 오는 ++
		a = a + 1;		//두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : "+c);
		c = !c;
		System.out.println("!c : "+c);
		
		double d = 7.0;
		System.out.println(d / 3);
	//	System.out.println(3 / 0); //double 일 때는 infinity, int일 때는 /by zero 
		
		int f = 14; 
		int p = 5;
		System.out.println("몫 : "+ (f / p)); 		//출력값 2
		System.out.println("나머지 : "+ (f % p));	//출력값 4
		//나머지가 5 이상이 될 수 없음 그리고 double 이 아닌이상 나머지가 소수점으로 나오지 않음
		
		//돈 10,000원으로 4,500커피 몇 잔 살 수 있나
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println(count);
		int change = money % coffee;
		System.out.println("잔 돈: "+change);
		
		// 올리브영에서 전품목 15% 행사 
		// 1. 꿀홍차 5,000원을 샀을 때 얼마를 내야하나 
		// 2. 꿀홍차 5,000 과 립스틱 10,000을 샀을 때 얼마를 내야하나 
		/* 내가 푼 것 
		 * int tea = 5000;
		 *double sale = 0.85;
		 *		int lip = 10000;
		 *	*System.out.println(tea * sale);
		 *	System.out.println((tea+lip) * sale); 
		 */
	
		//아래 선생님이랑
		double percent = 0.15;
		int tea = 5000;
		double discount = tea * percent;
		System.out.println("할인받을 금액 : "+ discount);
		double pay = tea - discount;
		System.out.println("내야하는 돈 : "+ pay);
		
		//7234원이 있는데 5,000원 1,000원 500원 100원 50원 10원 1원으로
		//각각 몇 개까지로 표현할 수 있나요?
		int total =	7234 ;
		int 오천원= 5000 ;
		System.out.println("오천원: " +total/오천원);
		int 오천원갯수 = 1; 
		int 천원  =	1000 ;
		System.out.println("천원: " + (total-오천원*오천원갯수)/천원);
		int 천원갯수 = 2;
		int 오백원= 500 ;
		System.out.println("오백원: "+(total-오천원*오천원갯수-천원*천원갯수)/오백원);
		int 오백원갯수 = 0 ;
		int 백원  =	100 ;
		System.out.println("백원: "+(total-오천원*오천원갯수-천원*천원갯수-오백원*오백원갯수)/백원);
		int 백원갯수 = 2;
		int 오십원 = 50;
		 System.out.println("오십원: "+(total-오천원*오천원갯수-천원*천원갯수-백원*백원갯수)/오십원);
		int 오십원갯수 = 0;
		int 십원= 10;
		System.out.println("십원: "+(total-오천원*오천원갯수-천원*천원갯수-백원*백원갯수-오십원*오십원갯수)/십원);
		int 일원  =	1 ;
		int 십원갯수 = 3;
		System.out.println("일원: "+(total-오천원*오천원갯수-천원*천원갯수-백원*백원갯수-오십원*오십원갯수-십원*십원갯수)/일원);
				
		/* string left="수박"
		 * string right="멜론"
		 * 단, left = "멜론" 금지
		 * System.out.println(left); 결과:멜론
		 * System.out.println(right); 결과:수박
		 * 출력 값이 반대가 되어야함 left=멜론, right=수박
.		 */
		
		String left= "수박";
		String right= "멜론";
		
		String table = left;
		left = right;
		right = table;
		
		System.out.println(left); //결과: 멜론
		System.out.println(right); //결과: 수박
		//swap 바꾸다
		
		System.out.println(0.1== 0.1f); //결과: false
		//같은 타입으로 변경해서 비교하자
		System.out.println((float)0.1 == 0.1f);
		
		System.out.println("3 == 3 :" + (3 == 3));
		
		String str1 = "홍길동";
		String str2 = "홍길동";
/*		System.out.println(str1==str2); 
 * 		문자열은 '=='사용금지
 * 		String 변수나 ""에 .equals ( )붙여서 사용 ()안에 글씨와 비교
 */
		System.out.println( str1.equals(str2));
		
		System.out.println( 10 | 3 );
		
		int i1 = 7;
		int i2 = 15;
		int i3 = 17;
		
		System.out.println("i3이 가장 큰 값인가?" 
							+((i3 >= i1) && (i3 >= i2)) );
		boolean i4 = i3 > i2;
		System.out.println( i4 ? "i3이 크다" : "i3이 작거나 같다");
		
		
		int value =356; //151p 6번문제
		System.out.println(value-56);
		System.out.println((value/100)*100); //가장 보편적인 방법
		System.out.println(value-(value%100));
		
		//150p 5번문제
		int var1 = 5;
		int var2 = 2;
		double var3 = var1/ var2;			  //예상:2.5
		System.out.println("var3 :"+ var3);		// 출력:2.0
		int var4 =(int) (var3 * var2);
		System.out.println("var4 :"+var4);
	}

}
