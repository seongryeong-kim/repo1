package sec05.exam02;

public class ArrayExam {

	public static void main(String[] args) {

		Array arr = new Array(5); //5짜리 배열 만들어서 필드에 저장 
		System.out.println(arr.length);
		
//		arr.length=4; Array에서 필드에 final 쓰니까 이제 오류남 
//		System.out.println(arr.length);
//		
//		int[] a = new int[5];
//		a.length = 4; final필드라서 변경불가
	}

}
