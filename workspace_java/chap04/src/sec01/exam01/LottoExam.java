package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {

		double rand = Math.random();
		// 0이상 1미만
		/*
		 * 0 <= rand && rand < 1
		 * 0 ~ 0.99999999999
		 * 0 * 45 <= rand * 45 < 1*45
		 * 0 ~ 45 * 0.999999 == 44.9999999
		 * int 로 바꾸면
	     * 0 ~ 44 까지 나오고 1을 더하면
	     * 1 ~ 45 까지 random한 숫자가 나온다	
		 */ 
		
		int number = (int)(rand * 45); //0부터 44까지
		number = number + 1; 			// 1부터 45까지
		number = (int)(rand*45) + 1; 	//그냥 위내용 한번에 쓴거
		/* number = (int)(rand*45) + 1; 
		 * 45곱하는 이유 ?
		 * 랜덤은 0부터 시작
		 * 1미만 0~0.999999999
		 * 44.99999999 나오니까 1더하고 
		 * 5부터 시작한다고 할 경우엔 +5
		 * 이해 안되면 하나하나 출력해보고 이해하기
		 */
		
		number = ( (int)(rand * 10000) ) % 45 + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int)(rand*45)+1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int)(rand*45)+1;
		System.out.println(number);

	}

}
