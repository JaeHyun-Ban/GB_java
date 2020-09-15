package quiz04;

public class Warrior extends Player {
	
	Warrior(){}
	
	Warrior(String pName, int pHp, int pMp){
		name = pName;
		hp = pHp;
		mp = pMp;
	}
	
	void bash() {
		System.out.println("때리기 스킬 사용!");
	}
}
