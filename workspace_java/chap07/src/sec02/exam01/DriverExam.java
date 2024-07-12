package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Avante avante = new Avante();
		
		//대리기사 호출
		Driver driver = new Driver();
		
		//전달인자로 아반떼만 받고 운전시작
		Car car = (Car)avante; //타입변환, 아반떼 부모가 Car가 있으니까  
		driver.run(car); 
		
		//스파크 가져오기 
		Spark spark = new Spark();
//		//아까 그 대리기사가 스파크 운전
		driver.run(spark);
		
//		Car car1 = (Car)spark; 
//		driver.run(car1);
		
		
		//다형성- 
	}

}
