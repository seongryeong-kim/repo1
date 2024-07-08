package sec04.prac;

public class SignInExam {

	public static void main(String[] args) {
		//회원가입 
		SignIn signup = new SignIn("java00","pw1234"); 
//		SignIn signup = new SignIn(); 기본생성자가 없어서 이렇게 쓸 수 없음 
		
		//로그인
		System.out.println(signup.login("java","5132"));
		System.out.println(signup.login("java00","pw1234"));
		
		//새로운 회원가입
		SignIn signup2 = new SignIn("java01","pw4567");
		System.out.println(signup2.login("fjld", "null00"));
	}

}
