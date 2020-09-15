package quiz04;

public class Wizard extends Player {

	Wizard() {
	}

	Wizard(String pName, int pHp, int pMp) {
		name = pName;
		hp = pHp;
		mp = pMp;
	}

	void iceArrow() {
		System.out.println("얼음화살 사용!");
	}
}
