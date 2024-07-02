package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {//이건 메소드 명이 main 
		//괄호안에 있는건 전달인자로 String으로 받겠다 arg를 a로 바꿔도 됨(변수니까)
		//void는 return할 게 없다 
		//public과 static 아직 안배움 

		Car myCar = new Car();
		//class이자 내가 만든 새로운 타입
		Car myCar2 = new Car();
		
		System.out.println(myCar.model); //임팔라
		
		myCar.model="흑팔라";
		System.out.println(myCar.model); //흑팔라
		
		System.out.println(myCar2.model); //임팔라

		System.out.println(myCar.speed); //0
		
	}

}
