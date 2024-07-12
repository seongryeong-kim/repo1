
public class for연습 {

	public static void main(String[] args) {

		//2부터 10까지 짝수끼리 더해보기 
	int a=0;
	int b=2;
			
	a=a+b; //값이 2
	b=b+2; //4 
	//6
	
	a=a+b;//6
	b=b+2; //6
	
	a=a+b; //12
	b=b+2; //8 
	
	if(b<=10) {
		a=a+b;
		b=b+2;
	}
	
	int r=0;
	for(int i=0;i<=10;i+=2) {
		r=i+r;
	}
	System.out.println("결과"+r);
	
	int j = 0;
	for(int i=1;i<=5;i++) {
		j+=i;
	}System.out.println(j);
	
	//0+1+2+3+4+5;
	int z=0;
	z+=1;
	System.out.println(z);
	System.out.println(z+=1);
	System.out.println(z+=1);	
	
//		for(int e=0;e<11;e+=2) {
//	    	  System.out.println(e);
//	      }

	
	//3부터 100까지 짝수가 몇개인지
	//짝수를 어떻게 표현할건지 n%2==0
	//시작 int s=0
	//100까지 
	//1씩 올라가게
	int count = 0;
	// 짝수를 만나면 count가 1씩 증가하게 
	for(int s=3;s<=100;s++) {
		if(s%2==0) {
			//3~100까지 짝수만 출력하기
			//s를 2로 나눈 나머지가 0이면(s가 짝수이면)
			//s를 출력해라 
			count++; 
			//System.out.println(s);
		}
	
	} System.out.println("총"+count);
	System.out.println("-----------");
	
//	int o = 3;
//	int c = 0; //count셀 변수
//	o+=1; //o=o+1
//	
//	3 % 2 ==1; //거짓. 이니까 패스 
//	4 % 2 ==0; /*참. 이니까*/   c++
//	5 % 2 ==1;
//	6 % 2 ==0; c++
//	
//	반복되는 것 
//	 o++ o가 하나씩 커지고
//	 o%2==0 이면 c++
	
	//1에서 10까지 출력 
	//1 2 3 4 5 6 7 8 9 10 1이 하나씩 늘어나고 있다 i++
//	for(int eg=1;eg<=10;eg++) {
//		System.out.println("예제"+eg+",");
		
	//구구단 출력
//	2*1=2
//	2*2=4
//	2*3=6
//	2*4=8
//	2*5=10
//	2*6=12
//	2*7=14
//	2*8=16
//	2*9=18
	//2는 고정이고, 
	//2에서 곱하는 수는 1부터 1씩 커진다 9까지 i++증감식 쓸 수 있겠고
	//결과는 2부터 곱하는 수 (결과 값에) 2씩 곱하기 
	//처음 시작하는 수를 int two=2로 저장해놓고 two*=2 two=two*2
	for(int t=1;t<=9;t++) {
		System.out.println("2 x "+t+" = "+t*2);
	}
	//한대 맞으면 -17 시작값이 100, 몇번 맞으면 죽을까 
	//한대 (100-17)=83
	//두대 100-34=66
	//세대 100-51=49
	//4) 100-68=32
	//5) 100-85=15
	//6) 100-102
	//100-(17*n) < 0
	// (100/17)< n
	//초기화를 100으로 하고 0보다 적어지면 종료 
	//한번에 17씩 마이너스 
	int f=0;
	for(int power=100;power>=0;power-=17) {
		f++;
	} System.out.println(f);
	
	//메이플스토리 400만원 원금회수하려면 얼마의 시간이 필요한가
	//일주일에 6만원씩 
	
	//한달에 벌 수 있는 돈 6*4 = 24
	//1년이면 12*(6*4) = 288
	//400-(6*4)*n개월 
	//아니면 400/ 6 = 
	System.out.println("결과"+400/6);
	//게임 파워 줄어드는 것처럼 
	
	int remain=0;
	for(int money=400;money>=0;money-=6) {
		remain++;
	}
	System.out.println("얼마나 걸리나"+remain);
	
	int week=0;
	for(int m=0;m<=400;m+=6) {
		week++;
	}
	System.out.println("몇주?"+week);
	
//	System.out.println("+++++++++++++++++++++++++++++++");
//	int yo = 1;
//	int result = yo++ + 10;
//	System.out.println(yo);
//	System.out.println(result);
//	yo++;
//	System.out.println(yo);
//	System.out.println(yo++ +10 );
//	System.out.println(yo++);
//	
//	int v = 1;
//	v++;
//	System.out.println(v);
	
	}
	 
	}