package sec01.exam01;

public class For구구단Exam {

	public static void main(String[] args) {	
		
		System.out.println("구구단 문제 1단계");
		for(int a=1;a<=9;a++) {
			System.out.print("2x"+ a +"="+(2*a));
		}
		System.out.println( );
		
		//3단의 경우
		int d =2;
		for(int a=1;a<=9;a++) {
			System.out.print((d+1)+"x"+ a +"="+((d+1)*a)+" ");
		}
		System.out.println( );
			
		//피라미드 2단계 참고하여 작성해보기
//		for(int j=1; j<=3; j++){
//			for(int i=1; i<=5; i++) {
//			System.out.print("+");
//			}
//		System.out.println( );
//		}
		
		// 드디어 했다!!!!!!!!!!!!!!!!!
		System.out.println("반복문");
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {System.out.print(a+"x"+b+"="+(a*b)+" ");
				
			} System.out.println(" ");
		}
				
		System.out.println("2단계 문제");
		//n앞에 숫자가 1씩 올라가고 n*1=n
		for(int n=2;n<=9;n++){
			System.out.print((n*1)+"x1="+(n*1)+" ");
			//이렇게 하고 한줄에 3개씩 출력되도록 바꾸려면 if 문을 사용
			if(n%3 ==0) {
				 System.out.println();}
				}
		
		System.out.println("2단계 문제 다시-wrong");
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				System.out.print(a+"x"+b+"="+(a*b)+" ");
			if(b %3 ==0) {
				 System.out.println();}
		}
			}
		
		System.out.println("-----------------");
		System.out.println("2단계 다시");
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				System.out.print(a+"x"+b+"="+(a*b)+" ");
			if(b %3 ==0) {
				 System.out.println();}
		}
			}
		
		
		
		
		}
		
}
