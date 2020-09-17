package quiz13;

public class Warrior extends Player {
	
	//1. 생성자: name만 전달받아서 hp = 1000, mp = 500, attack = 10 초기화
	
	
	Warrior(){}
	
	Warrior(String Name){
		name = Name;
		hp = 1000;
		mp = 500;
		attack = 10;
		
	}
	
	//2. bash스킬은 player타입을 받아서 각각의 직업에 따라 해당 객체의 hp를 다르게 감소.
	void bash(Player p) {
		
		if(this.mp < 100) {
			System.out.println("마나가 부족합니다!");
			return;
		}
		
		System.out.println(p.name + "님 배쉬 스킬 적중!");
		System.out.println("100의 피해를 입음!");
		System.out.println("----------------------");
		this.mp -= 100;
		
		//p가 어떤 인스턴스인지 확인, 상황에 따라 다른 행동작성
		if(p instanceof Warrior) {
			p.hp -= 100;
		}else if(p instanceof Wizard) {
			p.hp -= 200;
		}
		
	}
	
}


















