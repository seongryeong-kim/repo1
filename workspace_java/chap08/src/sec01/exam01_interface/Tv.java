package sec01.exam01_interface;

public class Tv implements RemoteControl{
	//add unimplemented method 누르면 오버라이드 자동완성됨
	
	int volume;
	//볼륨 조절하는데 볼륨 저장할 곳이 없으니까 필드 생성
	
	@Override
	public void turnOn() {
		System.out.println("TV 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME; //15가 들어오면 10으로 저장되게
		} else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} 
		this.volume = volume;
        
		System.out.println("현재 볼륨은"+this.volume);
	}

	
}
