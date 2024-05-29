package sec01.exam01;

public class For피라미드게임다시연습 {

	public static void main(String[] args) {
		
		System.out.println("3단계");
		for(int a=1; a<=5; a++){
			for(int b=1;b<=a;b++) {
				System.out.print("+");
				};	System.out.println(" ");
		}
		
		System.out.println("4단계");
		for(int a=1;a<=5;a++) {
			for(int c=1;c<=a;c++) {
				System.out.print("+");
			}		
			for(int b=1;b<=5-a;b++) {
				System.out.print(".");
			}
			System.out.println("");
		} 
		
		System.out.println("5단계");
		for(int a=1;a<=5;a++){
			for(int b=1;b<=5-a;b++) {
				System.out.print(".");	
			} for(int c=1;c<=a;c++) {System.out.print("+");}
			System.out.println(" ");
		} 

		System.out.println("6단계");
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5-a;b++) {
				System.out.print(".");
				}
			for(int c=1;c<=(a*2-1);c++) {System.out.print("+");
			} System.out.println(" ");
		}
		
		System.out.println("7단계");
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5-a;b++) {
				System.out.print(".");			
			} for(int c=1;c<=(a*2-1);c++) {
				System.out.print("+");
			}for(int d=1;d<=5-a;d++) {
				System.out.print(".");}
			System.out.println(" ");
	}
		
		

	}	
}
	
