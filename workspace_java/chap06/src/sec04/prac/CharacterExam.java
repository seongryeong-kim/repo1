package sec04.prac;

public class CharacterExam {

	public static void main(String[] args) {

		Character c1=new Character();
		int a = c1.attack_atob(); //공격받음
		System.out.println("a캐릭터의 체력은 "+a);
		
		Character c2=new Character();
		int b = c2.attack_btoa();
		System.out.println("b캐릭터의 체력은 "+b);
		
		System.out.println("a캐릭터의 체력은 "+a);
	}

}
