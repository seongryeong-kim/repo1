package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
//		dog = cat;
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		//같은 타입이니까 당연히 가능
//		aDog = aCat;
//		aDog.sound 만 쓸 수 있음 animal 클래스에 있는 메소드는 sound뿐이니까 
		
		a1.sound(); //멍멍
		a2.sound(); //야옹야옹
		
		Animal a3 = new Animal();
		a3.sound(); //소리를 냅니다가 실행될 것 
		
	}

}
