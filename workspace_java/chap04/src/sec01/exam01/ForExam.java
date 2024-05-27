package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 것을 5번 할 예정
		int sum = 0;
		sum = sum + 1; // sum += 1; 과 sum++; 도 가능
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum); 
		//하지만 숫자가 커지면 시간이 너무 오래걸림 그래서 반복문을 사용

		//1+2+3+4+5
		sum = 0; //sum 숫자 초기화(변수)
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println(sum);
		
		//1, 2, 3..에 해당하는 걸 변수안에 넣어보자
		sum = 0;
		int i = 0;
		
		i++; // i == 1
		sum = sum + i;		//+1
		//sum = sum + i+1;	//+2
		i++; // i == 2
		sum = sum + i;		//+2
		
		i++; // i == 3
		sum = sum + i;		//+2
				
	}

}
