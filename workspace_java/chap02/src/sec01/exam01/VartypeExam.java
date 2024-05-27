package sec01.exam01;

public class VartypeExam {

	public static void main(String[] args) {
		//정수
		byte b = 127;
//		b = 128;이건 안됨 127까지만 있어서 
		
		char c = 97;
		System.out.println(c);
		c = 97 + 5;
		System.out.println(c);
		char c1 ='a'; //문자 하나만 저장하는 용도, 작은 따옴표로 감싼다
		
//명확하게 long 으로 지정하려면 숫자 뒤에 L또는 l을 붙여준다 안그러면 int랑 헷갈릴 수 있음
		long balance=3000000000L;
		
		//byte b21 = 1L; byte는 long 과 달라서 이렇게는 안됨
		
		String s ="문자\n열";
		System.out.println(s);
		s="문 문\t자";
		System.out.println(s);

		//실수
		float f = 0.1234567890123456789F;
		System.out.println(f); //소수점 7번째 자리까지 정확함

		double d = 0.1234567890123456789;
		System.out.println(d);//소수점 16번째 자리까지 정확함 
		
		//논리
		boolean b1 = true;
		boolean b2 = false;
		
		
	}

}
