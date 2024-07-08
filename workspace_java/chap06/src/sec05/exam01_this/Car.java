package sec05.exam01_this;

public class Car {
	//7월 8일 월요일

	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){ 
		//model = m; //m은 지역변수(갈색), model은 필드(파란색)
		//model=model; //이렇게 하면 둘 다 지역변수(갈색) has no effect 
//		int a= 10;
//		a= a;
//		
//		Car c1 =  new Car();
//		c1.model = model;
		
		this.model = model; //new가 된 나 자신을 this라고 지칭
	}
	
	void setSpeed(int speed) {
		this.speed= speed; //이거 받아서 필드에 올려놓는다 
	}
	
	
}
