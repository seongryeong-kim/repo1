package sec01.exam01;

public class Child extends Parent{ //extends 내가 상속받고싶은 부모

	//부모의 필드를 가리는 현상
	//overshadow 
	String name = "Child의 name";
	
	//기본생성자
	public Child() {
		//부모 생성자를 호출하는 것
		//맨 첫줄에 있어야만 한다 
		super(""); //상속을 받았을 땐 super자동으로 생김
	}
	
//	Child(){
//		System.out.println("Child의 기본 생성자");
//	}

	//실무에서 쓰는 방법은 아닌데 연습삼아
	//부모의 name을 변경하는 메소드 
	void setName(String name) {
		this.name=name; //부모건데 마치 내것처럼 this
	}
	void setName2(String n) {
		name=n; //상속받으면 부모것을 내것처럼 쓸 수 있다
	}
	
	//전달인자가 필드를 가리는 현상 
	//shadow
	void setName3(String name) {
		this.name = name;
	}
	
	void printName() {
		System.out.println("this.name: "+this.name);
		System.out.println("super.name: "+super.name);
	}
	
	
}
