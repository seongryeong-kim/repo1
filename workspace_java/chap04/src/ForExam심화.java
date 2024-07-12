
public class ForExam심화 {

	public static void main(String[] args) {

		//for( ; ; ){ } 
		int a = 1; //a를 초기화 했다 
		
		// 딱 세번만 실행하고 싶어
		//첫번째 실행
		a = a + 10;
		System.out.println(a);
		
		//첫번째와 같은 코드를 두번째 실행 
		a += 10;
		System.out.println(a);
		
		//계속 같은 코드를 두번째 실행 
		a += 10;
		System.out.println(a);
	
		// 첫번째 장소: 초기화식, 처음에 딱 한번만 실행됨
		// 두번째 장소: 조건식, 거짓이 아닐때 반복시키는 조건 
		//			 처음부터 조건이 맞아야 실행된다		
		// 세번째 장소: 증감식, 사실은 그냥 실행문 끝에 무조건 실행해야 하는 코드를 넣는 곳
		for(int b=1; b<=31; b+=10) { //b는 이 for문 안에서 지역변수 
			//b=b+10
			System.out.println("내용반복");
			//1부터 실행되고 조건에 맞으니까 +10
			//1 - 11- 21- 31
		}
		
		int i=0;
		for( ; i<3; i++) {
			
		}
		//i가 3이 되어 거짓이므로 탈출했다
		System.out.println(i); 
		
	    for (int a = 1; a < 11; a++) {
	         System.out.println(a);
	      }

	      System.out.println("----------------");

	      for (int b = 3; b < 8; b++) {
	         System.out.println(b);
	      }

	      System.out.println("----------------");

	      int num = 8;
	      for (int c = 1; c < num; c++) {
	         System.out.println((c));
	      }

	      System.out.println("----------------");

//	      Scanner scan = new Scanner(System.in);
//	      int num1 = scan.nextInt();
	//
//	      for (int i = 1; i < num1; i++) {
//	         System.out.println(i);
//	      }

	      System.out.println("----------------");

	      for (int y = 1; y < 11; y++) {
//	         y = y + 1;
	         y += 1;
	         System.out.println(y);
	      }

	      System.out.println("----------------");

	      for (int y = 2; y < 11; y += 2) {
	         System.out.println(y);
	      }

	      System.out.println("----------------");
	      // 1+2+3+4+5 정답15

	      int q = 0; // 결과값
	      int p = 1; // p가 더할 변수 -> 초기화

	      q = q + p; // 1
	      p = p + 1; // p 2

	      if (p <= 5) {
	         q = q + p; // 3
	         p = p + 1; // p 3
	      }

	      if (p <= 5) {
	         q = q + p; // 6
	         p = p + 1; // p 4
	      }

	      if (p <= 5) {
	         q = q + p; // 10
	         p = p + 1; // p 5
	      }

	      if (p <= 5) {
	         q = q + p; // 15
	         p = p + 1; // p 6
	      }

	      if (p <= 5) {
	         q = q + p; // 15
	         p = p + 1; // p 6
	      }

	      q = 0;
	      for (int i = 1; i <= 5; i += 1) {
	         q = q + i;
	      }
	      System.out.println(q);

	      System.out.println("----------------");
	      // 2+4+6+8+10
	      // 0+2=2
	      // 2+4=6
	      // 6+6=12
	      // 12+8=20
	      // 20+10=30

	      int t = 0; // 결과값
	      int r = 2; // 더할값

	      t = t + r; // 2
	      r = r + 2; // r 4

	      t = t + r; // 6
	      r = r + 2; // 6

	      t = t + r; // 12
	      r = r + 2; // 8

	      if (r <= 10) {
	         t = t + r;
	         r = r + 2;
	      }

	      t = 0;
	      r = 2;
	      for (int i0 = 0; i0 <= 10; i0 += 2) {
	         t = t + i;
	      }
	      System.out.println(t);
	      
	      //2부터 10까지 짝수끼리 더해보기 
	      for(int e=0;e<10;e+=2) {
	    	  System.out.println(e);
	      } 
	}

}
