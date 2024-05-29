package sec01.exam01;

public class For피라미드출력용 {
	public static void main(String[] args) {
	//7단계
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5-i;j++){
				System.out.print(".");}
				for(int k=1;k<=i*2-1;k++){
				System.out.print("+");
				}
				//이 아래 이해안감 풀이 해봐야할듯
				//아래 식으로도 출력 제대로 되는지 확인해보기 
				for(int l=1;l<=5;i++){
				System.out.print(".");}
			} System.out.println(" ");

}
}