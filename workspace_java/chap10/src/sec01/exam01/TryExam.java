package sec01.exam01;

public class TryExam {
	//466p 예외클래스 Exception

	public static void main(String[] args) {
		try {

		String s1 = null;
//		System.out.println(s1.length()); //에러 NullPointerException
		System.out.println(s1);		//실행안됨
		
		int[] a = new int[2];
//		a[100] = 3; //100번지에 3을 넣는다
//		ArrayIndexOutOfBoundsException
//		Index 100 out of bounds for length 2
		//에러남 2개짜리 배열인데 100번에 3을 넣으니까
		
		String s2 = "20"; 
//		String s2 = "20a"; 
		int age=0;
		
			
			age= Integer.parseInt(s2); //NumberFormatException
			System.out.println(age+1);
			
			ThrowsTest tt = new ThrowsTest();
//			tt.throwException(); - 에러를 그냥 발생시킴 
			
			tt.human(3); //이건 조건에 따라서 에러를 발생시킬지 말지 - Throw Test 작성한거
			
		}catch (HumanException he) {
			
			String message = he.getMessage();
			if("EC05".equals(message)) {
				System.out.println("5미만을 입력하셨군요. 확인해주세요");
			} else if("EC10".equals(message)) {
				System.out.println("10초과해서 입력하셨군요. 확인해주세요");
			}
			
		}catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("------------");
			
			e.printStackTrace(); //기록,흔적 출력
			
			System.out.println("------------");
			System.out.println(e.getMessage());
		}
		
		System.out.println("완료");
		
	}

}
