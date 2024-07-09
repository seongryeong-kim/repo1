package quiz;

public class CharacterExam {

	public static void main(String[] args) {

		Character hong = new Character("홍길동"); //캐릭터1 생성
		Character lee = new Character("이순신"); //캐릭터2 생성
		
//		int dam = hong.attack();
//		boolean isAlive =lee.hit(dam); //hong이 보낸 수치만큼 이순신이 받을 것 
		
//		boolean isAlive =lee.hit(hong.attack());
//		if(isAlive) {
//			lee.hit(hong.attack());
//		}
		
//		hong.hit(lee.attack()); //이순신 어택이 홍길동으로 들어가는 것 
//		lee.hit(hong.attack()); //홍길동 어택이 이순신으로 들어가는 것 
//		lee.heal();
		
		boolean isAlive_hong = true;
		boolean isAlive_lee = true;
		
		//한명이 죽을 때까지 실행하는 반복문 
		while(isAlive_hong && isAlive_lee) {
			isAlive_hong = hong.hit(lee.attack());
			if(isAlive_hong) {
				isAlive_lee = lee.hit(hong.attack());
			}
		}
//		isAlive = hong.hit(lee.attack());
//		if(isAlive) {
//			isAlive = lee.hit(lee.hit(hong.attack()))
//		}
		
	}

}
