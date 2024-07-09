package quiz;

public class LoginExam {

	public static void main(String[] args) {
		Login l1 = new Login("admin","1234");
		boolean result = l1.login("test", "test"); //틀렸으니까 로그인화면 
		if(!result) {
			l1.login("admin","1234"); //맞으니까 메인페이지 
		}
		
	}

}
