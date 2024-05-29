package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int count=0;
		while(true) {
		//	count++; <-여기에 작성하면 이건 무조건 세는거 
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 6) {
				break; //가장 가까운 반복문을 종료
				 //숫자가 6이 나오면 종료되는 것
			}
			count++; //를 여기에 작성하면 break를 안만났을 때만 세는거
		}
		System.out.println("게임종료 : 총"+count); //숫자가 6이 나오면 종료되는 것
		
		//for(int i=1;i<=10;i++) {
//		for(int i=1;i<=10;i = i+ 2) {
//			System.out.println(i);
//			
//		if(i==7) {
//			break;
//		}
//		System.out.println("한 턴 종료"); //break 안만나면 실행
//		}
//		System.out.println("for문 종료"); //break 만나면 실행
//	}
	
			for(int i=1;i<=10;i = i+ 2) {
				System.out.println(i);
				
			if(i>=4) {
				break;
			}
			System.out.println("한 턴 종료"); 
			}
			System.out.println("for문 종료"); 
			
			for(int i=0;i<5;i++) {
				System.out.println("i : "+i);
				
				for(int j=0; j<3; j++) {
				System.out.println("j : "+j);
				
				//i가 3일때 두번째 for문 출력 후 브레이크
				if(j>=1) {
					break; 
				}
			  }
				System.out.println( );
			}
			
			for(int i=0; i<10; i++) {
				if(i % 2 != 0) //홀수 건너뛰기?
				{	continue; // 이후 실행문은 무시
				}
				System.out.println("짝수? "+i);
			}
			
			//break 유튜브 종료
			//continue 유튜브 다음영상으로 넘어가기
		}

}
