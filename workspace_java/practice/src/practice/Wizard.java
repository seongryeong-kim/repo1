package practice;

public class Wizard {
	int health;
	int mana;
	int armor;
	
	Wizard(int a, int b, int c) {
		health = a;
		mana = b;
		armor = c;
	}
	
	void attack() {
		System.out.print(health+" "+ mana+" "+ armor+"\n");
		System.out.println("파이어볼");
	}
}
