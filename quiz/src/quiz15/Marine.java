package quiz15;

public class Marine extends Unit {
	/*
	 * 1. 아래 클래스로부터 공통부분을 뽑하서 Unit이라는 클래스를 생성하고
	 *  이 클래스를 상속받도록 코드를 변경하시오
	 *  
	 *  2. Marine클래스의 객체들은 attack, armor가 객체마다 같은 값을 가지도록 선언하시오
	 */
	
	private static int attack = 6;
	private static int armor = 0;
	private final static int SIZE = 1;
	private final static String NAME = "Marin";
	
	
	public Marine() {
		super(0 , 0, 60, NAME); //x,y,hp
		
	}
	
	/*
	 * location()의 기능
	 * - 마린의 현재 위치 x,y를 출력
	 * 
	 * move()의 기능
	 * 1. 현재 좌표값에서 매개변수의 좌표만큼의 이동한 거리를 구한다.(피타고라스의 정의) 루트(제곱 + 제곱)
	 * ->루트근사값은 Math.sqrt(제곱근)을 이용하면 된다
	 * 
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 
	 * 3. 이동한 거리를 정수형으로 출력
	 */
	
	@Override
	public void location() {
		System.out.print("마린 위치: ");
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
		
	}
	@Override
	public void move(int x, int y) {
		int preX = x - this.getX();//세로길이
		int preY = y - this.getY();//가로길이
		setX(preX);
		setY(preY);
		System.out.println("마린이동 거리: " + (int)(Math.sqrt(getX()^2 + getY()^2)));
		
	}
	
	//getter, setter
	public static int getAttack() {
		return attack;
	}

	public static void setAttack(int attack) {
		Marine.attack = attack;
	}

	public static int getArmor() {
		return armor;
	}

	public static void setArmor(int armor) {
		Marine.armor = armor;
	}

	public static int getSize() {
		return SIZE;
	}

	

	

	
	
	
	
	
	
	
	

}






























