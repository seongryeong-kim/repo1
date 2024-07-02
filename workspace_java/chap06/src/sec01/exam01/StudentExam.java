package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {

		/*클래스 타입*/Student /*변수명*/s1 = new Student(); //아무것도 없던 클래스가 만들어진다
														//새로운 Student 객체를 생성해서 s1에 담기
		Student s2 = new Student(); 
		
		Student s3 = null; //변수는 만들었지만 연결되는 건 없음
		
		s3 = s1;
		System.out.println(s3==s1); //true 
		System.out.println(s1);
		System.out.println(s2); //같은 주소를 공유하느냐 마느냐
		System.out.println(s1==s2); //false 
		s2 = null; //null이 됐고 연결이 끊어졌으니까 garbage collector 가 데려감
		
	}

}
