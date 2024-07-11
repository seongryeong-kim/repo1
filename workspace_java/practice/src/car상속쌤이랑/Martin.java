package car상속쌤이랑;

public class Martin extends Car{
	
	Martin(){
		this.brand="마틴";
	}
	@Override
	void drive() {
		System.out.println("마틴 부릉부릉");
	}
	
	@Override
	int accel (int press) {
		System.out.println(press + " 만큼 마틴이 빨라집니다");
		return press * 4;
	}
	
	@Override
	int breaking (int press) {
		System.out.println(press + " 만큼 마틴이 느려지고 있습니다");
		return press * 5;
	}
	
	void shoot() {
		System.out.println("총을 쏩니다 탕탕");
		//이건 부모에 없고 Martin에만 있는 것 
	}
}
