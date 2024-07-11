package car상속쌤이랑;

public class CarExam {

	public static void main(String[] args) {

		Martin car1 = new Martin();
		Gwagen car2 = new Gwagen();
		
		car1.drive();
		int speed = car1.accel(4);
		System.out.println("지금 가속도"+speed);
		
		speed = car1.breaking(4);
		System.out.println("지금 감속도"+speed);
		
		car1.shoot();
		//Car2에서는 총을 쏘지 못함 
		//부모 메소드가 아니라 Car1에서만 메소드 생성했기 때문에 
		
		car2.drive();
	}

}
