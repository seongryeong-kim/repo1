package sec04.prac;

public class Tv {

//	TV 만들기
//	전원
	// 전원상태 저장
	// 전원켜기
	boolean isOn = false;

	void powerOff() {
		System.out.println("전원off");
		isOn = false;
	}

	void powerOn() {
		System.out.println("전원on");
		isOn = true;
	}

//	볼륨 up/down 0~10
//	>> 볼륨의 범위를 벗어나지 못하게 해주세요
	// 볼륨설정
//	int vol;
	// up버튼을 누르면 볼륨이 1씩 증가되게
	int vol = 0;

	void volUp() {
		// volUp을 누르면 vol이 하나씩 늘어나도록
		System.out.println("볼륨" + ++vol);
	}

	void volDown() {
		// volUp을 누르면 vol이 하나씩 줄어들도록
		System.out.println("볼륨" + --vol);
	}

//	채널 up/down/직접입력
	int channel;

	void channel(int x) {
		if (x >= 1 && x <= 10) {
			System.out.println("채널 :" + x);
			channel = x;
		} else {
			System.out.println("지원불가");
			channel = -1;
		}
	}

//	정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력
	void info() {
		if (isOn == true) {
			System.out.println("전원on");
			System.out.println("볼륨: " + vol);
			if (channel != -1) {
				System.out.println("채널: " + channel);
			} else {
				System.out.println("채널: 지원불가");

			}
		} else {
			System.out.println("전원off");
		}
	}
}
