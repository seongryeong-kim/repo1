package chap05;

public class Java심화반보충0613 {

	public static void main(String[] args) {

		int a2=2;
		int a3= a2++ + ++a2 - --a2 - a2-- + --a2;
		System.out.println("a3: "+a3);
		System.out.println("a2: "+a2);
	}

}
