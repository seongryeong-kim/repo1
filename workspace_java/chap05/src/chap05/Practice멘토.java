package chap05;

//import java.util.Scanner;

public class Practice멘토 {

	public static void main(String[] args) {

		//7월 2일 화요일 
		//문제 1 
		//이름, 나이를 나타내는 변수를 선언하고 자신의 이름과 나이를 할당한 뒤 그 값을 출력해보세요.
		//예시 출력 : 김철수 25
//		String name="김성령";
//		int age = 25;
//		System.out.println(name);
//		System.out.println(age);
		
		//문제2
		//a=383, b=171일 때, a * b - a의 값을 출력하세요.
//		int a = 383;
//		int b = 171;
//		System.out.println(a*b-a);
		
		//문제3
		//두 정수 a=1000, b=457을 선언하고, a/b를 소수점 셋째 자리까지 출력하세요.
		//int로 했다가 double로 ?? 
//		double a=1000;
//		double b=457;
//		double c=a/b*1000;
//		System.out.println(c);
//		//2188.1838
//		//이걸 int 로 2188
//		int d=(int)c;
//		System.out.println(d*0.001);
//		
////		double dd = 10.123456789;
////		System.out.printf("%.5f",d);
//		
//		
//		//12를 1.2로 바꾸려면 12*0.1
//		System.out.println(12*0.1);
		
		//문제4
//		이름과 나이를 입력받아 아래 문장의 형태로 출력하는 프로그램을 작성하세요(따옴표도 출력되어야 합니다).
//		Hello, my name is "이름" and I'm 나이 years old.
//		Scanner scanner = new Scanner(System.in);
//		
//		String name=scanner.next();
//		int age=scanner.nextInt();
//		
//		System.out.println("Hello, my name is "+ '"' + name+'"'+" and I'm "+age+" years old.");

		//문제5
		//파이값을 상수로 선언하고(3.14), 반지름이 5인 원의 넓이를 구하여 출력하세요
		double c=3.14;
		System.out.println(c*5*5);
		//결과 78.5
		
		//문제6
		//int 변수 2개를 선언하고 임의의 양의 정수를 할당하세요.
		//이때 두 수의 합이 오버플로우를 발생시켜 그 결과가 음수가 되도록 설정하고, 그 합을 출력하세요.
		int i=Integer.MAX_VALUE;
		int o=1+i;
		int t=2;
		System.out.println(o+t);

		int td=2100000000;
		int to=211000000;
		System.out.println(td+to);
		//int 21억 
		
		//문제7
		//33~122 사이의 int 값을 입력받고, 해당 값에 해당하는 아스키코드 문자를 출력하세요.
//		char a=65
//		Scanner 
		int a=65;
		char aa= 65;
		System.out.println(aa);
		
		char ab=66;
		System.out.println(ab);
		
		//65~90
		for(char ask=65;ask<=90;ask++) {
			System.out.println("for문"+ask);
		}
	}

}
