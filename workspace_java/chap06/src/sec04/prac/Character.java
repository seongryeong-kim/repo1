package sec04.prac;

public class Character {
//	배틀
//	class character
//	체력 100에서 시작
	int hp_a = 100; //a캐릭터의 체력
	int hp_b = 100; //b캐릭터의 체력
//	방어력: 특정 범위 안에서 random
	int depend_a = (int)(Math.random()*10); //0~9까지 
	int depend_b = (int)(Math.random()*10);
//	메소드 
//	attack (% 또는 수치)
	//a가 b를 공격하는 메소드 (b가 공격받는 메소드)
	//b의 체력이 5씩 줄어든다
	int attack_btoa() {
		hp_a-=5;
		return hp_a;
	}
	//b가 a를 공격하는 메소드 (a가 공격받는 메소드)
	//a의 체력이 5씩 줄어든다
	int attack_atob() {
		hp_b-=5;
		return hp_b;
	}
	
//	heal   (% 또는 수치)
	//but 언제 체력이 늘어날 건지..? 
	//a의 체력이 늘어남 
	int heal_a() {
		hp_a+=5;
		return hp_a;
	}
	//b의 체력이 늘어남 
	int heal_b() {
		hp_b+=5;
		return hp_b;
	}
	
//	내성이 있어서 회복 수치가 점점 줄어들 수도 있다
//	남은 체력을 출력
//	defense : 방어력을 제외한 상대의 attack 수치를 체력에서 깎음
	//체력=체력-(공격-방어력)
	//b가 a를 공격할 때
	//hp_a=hp_a-(attack_btoa-depend_a); ---- 이걸 메소드 안에 넣기??
	
//	체력이 0 이하가 되면 "사망" 출력
	//a가 사망
	void dead_a(){
		if(hp_a<0) {
			System.out.println("사망");
		}
	}
	
//	void dead_a(){
//		if(hp_a<0) {
//			//만약 hp_a가 0 이상이라면 (살아있을 때)
//			//또 다른 조건문 if-a가 공격을 받는 메소드가 실행되는 경우 
//			//hp_a체력이 줄어드는
//			if(b가 a를 공격했을 때) {
//				attack_btoa();
//			} else if(a체력 늘어날 때) { //but 방어력을 어떻게 해야할 지 모름..
//				heal_a();
//			}
//			
//		}
//	}
	
	//메소드
	//공격받는거 공격하는거 
	
	//현재상태
	void status() {
		System.out.println("a의 체력은 ");
	}

//	main에서 두 캐릭터를 생성해서 서로 싸워라!
	//캐릭터 a와 b가 있음
	//캐릭터 a가 공격을 하면 b의 체력이 줄어들게 

}
