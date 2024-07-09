package quiz;

//은행 계좌 개설
public class Account {

	String bankName;
	long money=0; //입출금, 확인에서 공통으로 쓸 필드
//	boolean isDebug;
	
	Account(String bankName){
		this.bankName = bankName;
	}

//	확인 : 잔액 출력
	
	//입금: 단 음수 입력 막기
	//기존 잔액에 
	//입금액 더하기
	//전달인자가 음수인 경우 더하지 않는다
	//전달인자: int 입금액
	//리턴타입: 없음
	/**
	 * @param int 입금액
	 * @return void
	 */
	void income(long money) {
		if(money>0) { //만약 money가 0보다 클 경우
		System.out.println("입금받은 돈: "+money);
//		this.money = money; //이렇게 하면입금한 금액을 잔고액으로 바꿔버림 기존잔액 신경안쓰고
		this.money += money; //기존잔액에 입금액 더하기
		}
	}
	
	/**
	 * 출금: 단 음수, 잔액보다 큰 수 출금 막기
	 * 기존의 잔액에서 
	 * 전달인자(출금액)을 빼서 저장한다
	 * 단, 전달인자가 음수 또는 잔액보다 큰 경우 제외
	 * 
	 * @param int 출금액
	 * @return void
	 */
	void outcome(long money) {
		System.out.println("출금 금액: "+money);
		if(money>0) {
			if(this.money>= money) {
				this.money -= money;
			}
		}
	}
	/**
	 * 확인: 잔액 출력
	 * 
	 * @param 없음
	 * @return long 잔액
	 */
	long view() {
		System.out.println("은행 이름: "+this.bankName);
		System.out.println("현재 잔액: "+this.money);
		return this.money;
	}
	
}
