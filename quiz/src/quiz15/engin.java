package quiz15;

import quiz15.Marine;

public class engin{
	
	private Marine m;
	
	public engin() {}
	
	void upAttack() {
		System.out.println("공격력을 업그레이드 합니다.");
		m.setAttack(1);
	}
	
	void upAmrmor() {
		System.out.println("방어력을 업그레이드 합니다.");
		m.setArmor(1);
	}
	
}
