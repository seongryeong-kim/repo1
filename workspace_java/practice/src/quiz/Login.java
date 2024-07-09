package quiz;

public class Login {

	String id;
	String pw;
	
	Login(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	boolean login(String id, String pw) { //쌤이 헷갈리라고 일부러 스트링이름 같게하심..
		boolean result= false;
		if(this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("메인페이지로 이동");
			result=true;
		} else {
			System.out.println("로그인 화면으로 돌아감");
			result= false;
		}
		
		return result;
	}
	
	
}
