package practice;

public class ArrayForPractice {

	public static void main(String[] args) {
		//문제19. 제곱을 구하자 
		//a와 b가 주어지면, a의 b승 구하기 
		int a=3;
		int b=3;
		int d=1;
		//3*3*3 이니까 27 이 나와야 함 
		//a를 b번 곱하기 
		for(int c=0;c<5;c++) {
			d*=a;
			System.out.println("c:"+(c+1)+", d: "+d+", a: "+a);
//			a*=a;
			//1번쨰 a=3*3
			
			//반복문은 2번 도는데 
			//1번째 돌 때 3*3=9
			//2번째 돌 때 3*3*3=27 
			
			//지금 결과 이렇게 나오는디 
//			c:1d0
//			c:2d9
//			c:3d9
		} 
		System.out.println(d);
		//19번 모르겠다 넘어가 
		
		
		
		
		
		
		
	}

}
