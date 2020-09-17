package quiz13;

public class Wizard extends Player {

	Wizard() {
	}

	Wizard(String Name) {
		name = Name;
		hp = 500;
		mp = 1000;
	}

	void iceArrow() {
		System.out.println("얼음화살 사용!");
	}
	
	void Blizzard(Player[] players) {
		System.out.println("-------------------------");
		System.out.println(name + "님의 눈보라 시전!\n");
		//1. 향상된 for문으로 회전
		//2. for문안에서는 10~15사이의 랜덤 난수를 발생
		//3. 
		
		for(Player p : players) {
			
			int damage = (int)(Math.random()*6)+ 10; //10~15사이의 랜덤난수
			p.hp -= damage;
			System.out.println(p.name + "님이 " + damage + "피해를 입었습니다!");
		}
		System.out.println("-------------------------");
	}
	
	
}









































