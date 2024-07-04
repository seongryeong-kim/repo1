package sec04.cexam04;

public class MemberJoinExam { // 7/4 목요일

	public static void main(String[] args) {
		//아이디, 비밀번호는 필수입니다 (내가 정한 규칙)
		//주소를 공개하고 싶지 않으면 null 넣어주세요
		//나이를 공개하고 싶지 않으면 -1을 넣어주세요
		//성별을 공개하고 싶지 않으면 -1을 넣어주세요
		MemberJoin member = new MemberJoin();
		
		member.join("id", "pw", "주소", 20, 1);
		
		member.join("아이디", "1234", null , -1, -1);
		member.join("아이디2", "qwerty", null , -1, -1);
		
		//아래기 오버로딩 된 것 
		member.join("아이디3", "abcd");
	}

}
