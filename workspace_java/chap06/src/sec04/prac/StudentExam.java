package sec04.prac;

public class StudentExam {

	public static void main(String[] args) {
//학생을 관리하는 학원 행정팀 
		Student s1 = new Student("", 1); //클래스 타입 변수에 담기
									//이력서 양식 원본이라고 생각,, 구조를 가지고 있음  
		
		//초기값 아무것도 설정하지 않았을 때 
		//필드는 초기화 없는 경우 null, 0, false
		//new하는 순간 자동 초기화 됨
		System.out.println(s1.name); //String은 null
		System.out.println(s1.age); //int는 0
		System.out.println(s1.hasGlasses); //boolean은 false 
		
		//아무것도 설정하지 않은 s1클래스에 값을 설정하기  
		s1.name="김영희";
		s1.age =20;
		s1.hasGlasses= true; //안경쓰는 경우 true
		
		//내가 설정한 값이 잘 들어갔는지 출력해서 확인해보기 
		System.out.println(s1.name); 
		System.out.println(s1.age); 
		System.out.println(s1.hasGlasses);
		
		//s1.name; s1의 이름 
		//s1.name과 내 지역변수 name은 아무 관계 없음
		String name="아무거나"; //이건 현재클래스에서만 저장
		
		//지역변수는 초기화 없이 사용 불가능
		//int a;
		//System.out.println(a); 이걸 출력하면 오류남
		
		Student s2 = new Student("", 1);
		System.out.println(s2.name); //null
		
		s2.name="박춘보";
		s2.age=50;
		
		System.out.println(s2.name); //s2.name에는 박춘보가 들어감
		System.out.println(s2.age);
		System.out.println(s1.name); //이건 바뀌지 않고 그대로 김영희
		//원본을 복사해서 복사본1과 복사본2를 만들고 복사본들을 수정했다
		
		System.out.println(s1); //학생의 이름부터 상태까지 모든 필드가 나옴
		//s1.study("java 클래스"); //"java 클래스"라는 과목을 공부했다
		
		//void에서 int타입 메소드로 변경 후 
		int intel = s1.study("java 클래스"); //돌아오는 값을 intel이라는 변수에 담을거야
		System.out.println("공부했더니 지식:"+intel);
		//System.out.println(s1); //지식+5, 스트레스+10, 체력-1, 공복감+1
		
		//s1.lunch("떡볶이"); // 먹은 음식이 출력되고 hp↑ ,stress↓,hungry↓
		
		//쌤이랑 
		int h = s1.lunch("떡볶이");
		System.out.println("식사 후 공복감은"+h);
		
		//수면
		int s =s1.sleep(5); //수면시간 출력됨
		System.out.println("수면 후 체력은"+s);
		
		//게임
		s1.game("테트리스"); //game메소드에 study메소드 활용 
		//게임 쌤이랑
		int r=s1.doGame("루미큐브");
		System.out.println("현재 스트레스는"+r);
		
		//오버로딩
//		int g = s1.study("메이플스토리",5); //메소드 이름이 study로 같지만 전달인자 수가 다름
//		System.out.println("게임 후 지식은"+g);
		
		System.out.println("----------오버로딩 실습----------");
		
		//게임오버로딩 doGame
		r = s1.doGame("게임",2);
		System.out.println("현재 스트레스는"+r);
		
		s1.study("java",-20);
		//System.out.println(s1); //학생정보의 모든 것이 나옴
		System.out.println(s1);
		
		Student stu =new Student("김철수",20); //클래스를 가져오는 것
		System.out.println(stu);
		
		Student stu1 =new Student("김철수"); 
		// 이름은 김철수 나이는 this로 다른 생성자를 불러와서 나이를 따로 작성하지 않는 경우 나이는 20
		System.out.println(stu1);
		Student stu2 =new Student("김철수",23); 
		System.out.println(stu2);
		
		view(s1);
	}

	//main에서 쓰려면 static을 붙여줘야하는데 다음시간에 배울것
	static void view(Student s) {//전달인자로 Student
		int stress = s.doGame("오버워치");
		System.out.println("이 학생의 스트레스 수치는: "+stress);
	}
}
