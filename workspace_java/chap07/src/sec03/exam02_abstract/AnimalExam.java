package sec03.exam02_abstract;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal a = dog;
		a.sound();
		
//		Animal a2 = new Animal(); //추상메소드라서 에러남
	}

}
