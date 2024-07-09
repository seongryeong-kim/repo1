package quiz;

public class Character {

	private String name; //캐릭터 이름
	private int hp; //체력
	private int def; //방어력-랜덤
	
	Character(String name){
		this.name= name;
		this.hp = 100;
		this.def = (int)(Math.random()*5)+3; //3부터 7?8?까지 방어력
	}
	/**
	 * attack: 내가 공격할 수치를 돌려줌
	 * @param 없음
	 * @return int 공격수치 
	 */
	int attack() {
		int damage = 10+(int)(Math.random()*5); //10부터 14 공격
		System.out.println(this.name+"이(가) "+damage+"만큼 공격 합니다");
		return damage;
	}
	/**
	 * hit: 내사 맞아서 체력이 줄어든다
	 * @param int 공격당한 수치
	 * @return 
	 * @return boolean 생사여부
	 */
	boolean hit(int damage) {
		System.out.println(this.name+"이(가)"+ (damage-def)+"만큼 공격을 받았습니다");
		boolean isAlive= true;
		//hp = hp - damage- def; 
		hp -= damage- def; //맞은거damage에서 방어def제외한 만큼 hp에서 뺌
		getHp(); //현재 체력확인
		if(hp<=0) {
			System.out.println(this.name +"이(가) 죽었습니다");
			isAlive = false;
		}
		return isAlive;
	}
	
	/**
	 * heal: hp를 일정량 회복
	 * @param 없음
	 * @return int hp
	 */
	int heal() {
		int heal = 5+ (int)(Math.random()*5); //5~9
		this.hp += heal;
		System.out.println(this.name+"이(가) "+heal+"만큼 회복했습니다");
		getHp();
		return this.hp;
	}
	
	int getHp() {
		System.out.println(this.name+"의 현재 체력은 "+this.hp+"입니다");
		return this.hp;
	}
}
