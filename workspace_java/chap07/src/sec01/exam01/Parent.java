package sec01.exam01;

public class Parent {
	//7월 9일
	//332p 상속 
	String name = "Parent의 name";
	
//	Parent(){
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
