package practice;

import java.util.Scanner;

public class JsPractice {

	public static void main(String[] args) {
//		++++*++++ a1 +b:4, *c:1, +:8
//		+++***+++ 2 +:3, *:3, +:6
//		++*****++ 3 +:2, *:5, +:4
//		+*******+ 4 +:1, *:7, +:2
//		********* 5 +:0, *:9, +:0
		 
		//원하는대로 나오긴 했는디..
		for(int a=1;a<=5;a++) {
			for(int b=5;b>a;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*a-1;c++) {
				System.out.print("*");
			} 
//			for(int b=5;b>a;b--) {
//				System.out.print("+");
//			}
			System.out.println("");
		}
		
		System.out.println("----------------------");
		for(int a=1;a<=9;a+=2) {
//			for(int b=5;b>a;b--) {
//				System.out.print("+");
//			}
			for(int c=1;c<=a;c++) {
				System.out.print("*"+a);
			} 
			System.out.println("");
		}
		
//		// 하나씩 +가 늘어나는 반복문
//		for(int a=1;a<=5;a++) {
//			for(int b=1;b<=a;b++) {
//				System.out.print("+");				
//			}
//			System.out.println("");
//		} 
//		
//		System.out.println("하나씩 +가 줄어드는 반복문");
//		for(int a=1;a<=5;a++) {
//			for(int b=5;b>=a;b--) {
//				System.out.print("+");				
//			}
//			System.out.println("");
//		} 
		
	int j=0;
	//10. 1부터 100까지 더하기 
	for(int i=1;i<=100;i++) {
		j=i+j;
	}System.out.println(j);
	//문제13.태양계-수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성


	//문제14. 3의 배수인가 
	//3의 배수인데 홀짝만 생각하느라 나머지2를 해서 3으로 수정함
//	int n=((int)(Math.random()*100));
//	System.out.println(n);
//	if(n%3==0) {
//		System.out.println("짝");
//	} else {
//		System.out.println(n);
//	}

//	Scanner scan = new Scanner(System.in);
//	int n = scan.nextInt();
//	for (int i = 1; i <= n; i++) {
//        for (int c = 1; c <= n - i; c++) {
//           System.out.print(" ");
//        }
//        for (int c = 1; c <= 2 * i - 1; c++) {
//           System.out.print("*");
//        }
//        System.out.println();
//     }
  
//  ++++*++++ a1 +b:4, *c:1, +:8
//  +++***+++ 2 +:3, *:3, +:6
//  ++*****++ 3 +:2, *:5, +:4
//  +*******+ 4 +:1, *:7, +:2
//  ********* 5 +:0, *:9, +:0
  
  for(int a=1;a<=5;a++) {
//     for(int b=5;b>a;b--) {
//        System.out.print("+");
//     }
     for(int c=1;c<=2*a-1;c++) {
        System.out.print("*");
     } 
     System.out.println("");
  }
	
	}

}
