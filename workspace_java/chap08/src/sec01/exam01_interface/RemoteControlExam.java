package sec01.exam01_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoteControlExam {

	public static void main(String[] args) {

		RemoteControl tv = new Tv(); //부모타입 변수에 저장 
		Audio audio = new Audio();
		RemoteControl audio2 = (RemoteControl)audio; //부모타입 형변환
		
//		RemoteControl rc = new RemoteControl 이건 인터페이스라서 new 안됨 

		tv.turnOn();
		audio.setVolume(15);
//		System.out.println( audio2.volume); //이건 안됨 
//		System.out.println( audio.volume); //이건 가능 
		
		List list = new ArrayList();
		
	}

}
