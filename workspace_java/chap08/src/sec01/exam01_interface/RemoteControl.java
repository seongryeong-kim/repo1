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
	
//	void search(String word); //사람들이 쓰던 인터페이스 수정-얘를 구현한 클래스에서 implement 해줘야함
	//메소드를 구현까지 해놓기 위해서는 
	//default 키워드를 적어준다
	//추상메소드인 경우 기존에 사용하던 클래스에서
	//무조건 구현해야하는 번거로움이 생기는데
	//실행블럭을 구현해 놓으면 사용하고 싶은 클래스만 사용할 수 있다
	default void search(String word) {
		System.out.println(word);
	} 
}
