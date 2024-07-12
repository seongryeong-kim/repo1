package sec04.prac;

public class Student {
	//7월 5일 금요일 
	//값
	//이름, 나이, 주소, 성별, 전공, 안경착용여부
	public String name;
	public int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;

	//생성자(내가 만든) 
	public Student(String n, int a){
		name = n;
		age = a;
	}
	
	//기본 생성자
	//내가 위에 생성자를 만들어서 기본생성자가 자동으로 생성되지 않음 
	//기본생성자 필요하다면 아래처럼 만들면 됨
//	Student(){} 
	
	//생성자 오버로딩
	//this(n, 20); 전달인자 이름 하나만 작성해도 나머지는 초기화된 값으로 나오도록 
	public Student(String n){
		//이름 필수 작성, 나이 중요x 있어도 되고 없어도 됨 
		this(n, 20); //this 가 다른 생성자를 불러오는 것 
//		name = n;
	}
	//행동
	//공부, 식사, 수면, 게임
	
	//공부
	//공부한 내용 출력하고 
	//지식이 높아지고 
	//스트레스가 높아지고
	//체력 낮아지고 
	//공복감 높아지고
	//전달인자: String 공부한 내용 (과목)
	//리턴타입: 없음
	
	int intel = 0; //지식 
	//메소드 안에 있으면 값이 저장되지 않고 계속 0으로 초기화되니까 메소드 밖으로 꺼내기**
	int stress = 0; //스트레스 지수
	int hp=100;
	int hungry = 0;
	
	int study(String subject) {
		System.out.println(subject+"을(를) 공부했다");
		
		intel += 5; //공부할 때마다(호출할 때마다) 지식 intel이 5씩 올라감 
		stress += 10;
		hp--;
		hungry++;

		//intel을 return하는 코드를 완성하세요
		//but void에서는 return할 수 없음 그러니까 void를 int로 바꿔줌
		return intel;
	}
	
	//식사
	//먹음 음식 출력하고 String
	//체력 조금증가
	//스트레스 조금 감소
	//공복감 많이 감소
	//전달인자: String 음식
	//리턴타입: int 공복감 
	int lunch(String dish){
		System.out.println("맛있는"+dish+"을(를) 먹었다");
		
		hp+=3;
		stress-=10;
		hungry-=10;
		
		return hungry;
	}

	//수면 메소드 완성
	//숫자 적으면 몇시간 잤는지 알려주고 
	//체력을 리턴해줌
	//스트레스 -10
	//체력 +10 
	//공복감 +5
	//전달인자: int time 시간
	//리턴타입: int hp 체력
	int sleep(int time) {
		System.out.println(time+"시간 수면");
		
		stress-=10;
		hp+=10;
		hungry+=5;
		
		return hp; 
	}
	
	//수면 쌤이랑
//	void sleep() {
//		System.out.println("굿나잇");
//		hp+=30;
//		stress-=20;
//	}
	
	//게임 메소드 완성
	//단, 게임하면서 게임공부도 했다치고
	//(이미 만들어놓은) study 메소드 활용 
	void game(String sub) {
		System.out.println(sub+"하는중");
		study(sub);
		intel += 5; 
		stress += 5;
		hungry+=5;
	}
	//게임 쌤이랑
	//전달인자: 게임 이름
	//리턴타입: int 스트레스 수치 
	int doGame(String title) {
		System.out.println(title+"시작");
		
		study(title);
		stress -= 10;
		hungry += 3;

		return stress;
	} //게임 후 바뀐 스트레스를 돌려준다

	//study로 오버로딩
	//게임을 하면
	//(게임)지식이 올라가고 5
	//스트레스가 높아지고 10
	//공복감 높아지고 5
	//String subject 게임 이름과
	//time play 시간을 적는다
//	int study(String subject,int time) {
//		System.out.println(subject+"을(를)"+time+"시간 했다");
//		
//		intel += 5; //공부할 때마다(호출할 때마다) 지식 intel이 5씩 올라감 
//		stress += 10;
//		hungry+=5;
//
//	//intel 지식을 return하는 코드를 완성하세요
//		return intel;
//	}
	
	//doGame으로 오버로딩
	int doGame(String title, int hour) {
		System.out.println(title+" 시작 "+hour+"시간만 하자");
		
		//방어코딩 
		//hour시간이 0 이하인 경우 다시 입력해달라
		
		//hour시간이 정상인 경우
		//--반복문 연습
		//난이도1: 시간당 한번씩 "한번만 더하자" 출력 
		//난이도2: 30분에 한번씩 출력(단, syso두번 쓰지말고 반복을 두 배)
		//		  증감식에 0.5씩 더하기로 풀어보자
		
		//조건문 연습
		//2시간 이하- 오늘 좀 안됐다. 그만하자. 스트레스 +5
		//4시간 이하- 간단하게 한게임 했다, 스트레스 -10
		//4시간 초과- 오늘 신났다, 스트레스 -20
		
		//선생님 코드 
		if(hour<=0) {
			System.out.println("다시 입력");
			//return 0;
		}else {
			for(int i=0;i<hour;i++) {
				System.out.println(i+"시간밖에 안지났으니 한번만 더 하자 ");
			}
//			for(int i=hour;i>0;i--) {
//				System.out.println(i+"시간밖에 안지났으니 한번만 더 하자 ");
//			}
			//30분씩 출력하는 방법
//			for(double i=0;i<hour;i+=0.5) { //0.5는 소수점이니까 double
//				System.out.println(i+"시간밖에 안지났으니 한번만 더 하자 ");
//			}
		//hour가 0이상이라는 조건 	
		if(hour>0&& hour<=2) {
			System.out.println("오늘 좀 안됐다 그만하자");
			stress+=5;
		} else if(hour<=4) {
			System.out.println("간간하게 한게임 했다");
			stress-=10;
		} else {
			System.out.println("오늘 신났다");
			stress-=20;
		}
		
	}
		
		//내가 푼거
//		if(hour>=0) {
//			for(double h=0;h<hour;h+=0.5) {
//				//h=h+0.5
//				//처음에 for반복문 안에 조건을 int=0이라고 했는데 0.5(30분)을 더하면 
//				//h가 int이기때문에 계속 0이됨 -> 무한반복
//				//그래서 h의 타입을 double로 바꿔줌 
//			
//				System.out.println("한번만 더하자"); //전달인자에 5입력하면 한번만 더하자가 5번 출력
//			}
//			if(hour<=2) {
//				stress+=5;
//				System.out.println("오늘 좀 안됐다 그만하자 스트레스: "+stress);
//			} else if(hour>2 && hour<=4) {
//				stress-=10;
//				System.out.println("간단하게 한게임 했다 스트레스: "+stress);
//			} else {
//				stress-=20;
//				System.out.println("오늘 신났다 스트레스: "+stress);
//			}
//		} else if(hour<0) {
//			System.out.println("다시 입력해주세요");
//		}
		
		study(title);
		
		//stress -= 10; //위 조건에 따라 수치 변동
		hungry += 3+(hour*0.7);

		return stress;
	}
	
	//문제1
	//공부할 때랑 게임할 때랑 받는 스트레스가 다르니까 
	//스트레스를 전달할 수 있는 stress를 오버로딩한 메소드 만들기
	int study(String subject,int st) {
		System.out.println(subject+"을(를) 하면 스트레스가"+st+"만큼 늘어난다/ 줄어든다");
		
		stress += st;
		return stress;
	}
	
	//생성자
	//이름과 나이를 입력받지 않으면 생성 못하게 만들기 -- 생성자
	//나이는 중요하지 않아서 이름 있어도 생성할 수 있게 만들기
	//단, 두번째 생성자에서는 이름과 나이를 전달받는 생성자 호출하기-this?
	//Student(){}
	
	//학생 상태보는 메소드도 하나 만들기
	//자동완성 하는 방법: 마우스 오른쪽 버튼-source-generate toString 
	// @Override 이건 나중에 배울거 
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + ", major=" + major
				+ ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp + ", hungry="
				+ hungry + "]";
	}
}