package practice;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단 출력하기 
		/*aXb=결과
		 *2*1=2
		 *2*2=4
		 *
		 *3*1=3
		 *3*2=6
		 *3*3=9
		 *
		 *4*1=4
		 *4*2=8
		 *4*3=12
		 *
		 *반복문 a: 2~9까지 반복
		 *반복문 b: 1~9까지 반복
		 * 결과: a * b
		 */
		int a=0;
		for(a=2;a<=9;a++) {
			System.out.println(a+"단");
			for(int b=1;b<=9;b++) {
				System.out.println(a+"X"+b+"="+(a*b));
			}
			
		}
		
//		
	}

}
