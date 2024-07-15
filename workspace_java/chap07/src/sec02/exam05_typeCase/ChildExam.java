package sec02.exam05_typeCase;

import java.util.ArrayList;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		child.method1("차일드");
		System.out.println("결과 - 차일드의 field1: "+child.field1);
		
		Parent p = new Child();
		p.method1("자식이 오버라이드한 곳에 보내는 전달인자");
		System.out.println("결과 - p의 field1: "+p.field1);
		//p.field1은 부모 클래스의 필드를 가리킨다
		//Override는 메소드만 된다
		
		Child child2 = (Child)p; //괄호 생략 불가
		System.out.println("결과 - child2의 field1: "+child2.field1);
		
		//////////////////////////////////////////////////
		Parent p1 = new Child();
		Parent p2 = new Child101();
		
//		p1=p2; //타입이 같아 가능
		Child c = (Child)p1;
		
		//p2가 Child에서 왔는가?
		//p2는 Child의 instance인가?
		boolean isChild = p2 instanceof Child;
		System.out.println(isChild);
		if(isChild) {
			Child c2 =(Child)p2;
		}
		if(p2 instanceof Child101) {
			Child101 c3=(Child101)p2;
		}
		
//		Child c2 = (Child)p2;
		
		Object obj = new Parent();
		
		ArrayList list = new ArrayList();
		list.add(p1);
		list.get(0);
		Object obj1 = list.get(0);
		Parent p3 = (Parent) obj1; //형변환 해줘야함 
		p3.equals(obj1); //object 가 제공하는 equals를 Stirng이 오버라이드 한것 ?
		"".equals("abc");
		
		System.out.println(p1);
	
	}

}
