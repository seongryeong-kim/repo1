package sec01.exam01;

public class ThrowsTest {

	void method2(String name) throws ClassNotFoundException {
		Class clazz = Class.forName(name); 
	}
	
	void method1() {
		//try catch를 여기서 잡아줘야함 
		try {
			method2("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void throwException() {
		System.out.println("아무거나 출력");
		throw new NumberFormatException("글씨"); //throw: 강제로 exception 발생시키는 것
	}
	
	void human(int e) throws HumanException{
		System.out.println("human 실행: e "+e);
		
		if(e < 5) {
			throw new HumanException("EC05");
		} else if(e > 10) {
			throw new HumanException("EX10");
		} else {
			System.out.println("5이상 10이하로 정상입니다");
		}
	}
}