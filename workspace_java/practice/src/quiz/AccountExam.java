package quiz;

public class AccountExam {

	public static void main(String[] b) {
		Account a1 = new Account("KB국민은행");
		a1.view(); //현재잔액확인
		a1.income(10000); //입금 10000원
		a1.view(); //현재잔액확인
		a1.outcome(4000); //출금 4000원
		a1.view(); //현재잔액확인

		a1.outcome(10000); //현재 잔액 6000원인데 10000원 뺄 수 없으니까 행안됨
		a1.view();
		a1.outcome(4000);
		
		Account a2 = new Account("신협"); //또 다른 계좌 만들기
		a2.income(20000);
		a2.outcome(5000);
		a2.view();
		
		a1.view();
		
	}

}
