package sec01.exam01;

public class Parent {
	//7월 9일
	//332p 상속 
	String name = "Parent의 name";
	
//	Parent(){
	//super(); //부모의 생성자
 	//this("a")//내 생성자
	//super()와 this()는 모두 첫줄에 적어야 하므로 같이 사용할 수 없다 
//		System.out.println("Parent 기본 생성자");
//	}
	Parent(String name){
		//부모 생성자가 있는 상태 
		System.out.println("Parent 기본 생성자");
	}
	
	
	String getName() {
		System.out.println("Parent의 getName 실행");
		return this.name;
	}
	
}
