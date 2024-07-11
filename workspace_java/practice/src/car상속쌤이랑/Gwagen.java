package car상속쌤이랑;

public class Gwagen extends Car {

	Gwagen(){
		this.brand="벤츠";
	}
	
	@Override
	void drive() {
		System.out.println("지바겐이 출발한다");
	}
}
