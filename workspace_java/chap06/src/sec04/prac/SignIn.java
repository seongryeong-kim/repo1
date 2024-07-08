package sec04.prac;

public class SignIn {
//	로그인
	String id;
	String pw;

//	생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
	SignIn(String id1, String pw1) {
		id = id1;
		pw = pw1;
		System.out.println("아이디는 " + id + ", 비밀번호는 " + pw + " 입니다.");
		System.out.println("회원가입 되었습니다.");
	}

//	login(아이디, 패스워드) 실행하면
//	login메소드 안에서...
//	만약 같으면 "메인페이지" 출력하고 true 돌려줌
//	다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	boolean login(String id2, String pw2) {
		if (id2.equals(id) && pw.equals(pw2)) {
			System.out.println("메인페이지");
			return true;
		} else {
			System.out.println("로그인 화면으로 돌아감");
			return false;
		}
	}
}
