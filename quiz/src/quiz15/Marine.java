package quiz15;

public class Marine extends Unit {
	/*
	 * 1. 아래 클래스로부터 공통부분을 뽑하서 Unit이라는 클래스를 생성하고
	 *  이 클래스를 상속받도록 코드를 변경하시오
	 *  
	 *  2. Marine클래스의 객체들은 attack, armor가 객체마다 같은 값을 가지도록 선언하시오
	 */
	private int attack = 6;
	private int armor = 0;
	
	public Marine() {
		super(60);
		System.out.println("Marine이 생성되었습니다!");
	}
	
	void info() {
		System.out.println("공격력: " + attack);
		System.out.println("방러력: " + armor);
		
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack += attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor += armor;
	}
	

	
	
	
	
	

}






























