package sec01.exam04_super_food;

public class CarExam {

	public static void main(String[] args) {

		Car아이오닉 car = new Car아이오닉(); //자식 생성자 불러오기
		car.drive();
		car.seat();
		car.speed(200);
		car.fuel();
		
		Car아반떼 car2 = new Car아반떼();
		car2.drive();
		car2.seat();
		car2.speed(100);
		car2.fuel();
	}

}
