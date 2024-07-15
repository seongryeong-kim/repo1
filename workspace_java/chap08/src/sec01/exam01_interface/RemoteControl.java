package sec01.exam01_interface;

public interface RemoteControl {

	//상수 : static final, 변수명을 모두 대문자로
	//interface에서는 public static final만 써야하기 때문에 
	//public static final 생략가능
	//interface에서는 private 불가 
	//아무것도 안써도 자동으로 public 
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	//public abstract 생략가능
	public abstract void turnOn();
	void turnOff(); //이건 public abstract 를 생략한 경우
	void setVolume(int volume);
	
}
