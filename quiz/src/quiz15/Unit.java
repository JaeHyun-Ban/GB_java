package quiz15;

public class Unit {

	private int x = 0;
	private int y = 0;
	private int hp;

	public Unit(int hp) {
		super();
		this.hp = hp;
	}

	// 현재 위치 출력
	void location() {
		System.out.println("------------------------------");
		System.out.println("현재 위치는" 
							+ "x: " + this.x 
							+ " y: " + this.y + " 입니다.");
	}

	// x,y값을 변경
	void move(int x, int y) {
		setX(x);
		setY(y);
		System.out.println("------------------------------");
		System.out.println("x: " + x + ", y: " + y +" 이동합니다");
	}

	// 현재 위치에 정지
	void stop() {
		System.out.println("------------------------------");
		System.out.println("유닛을 정지합니다!");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	

}
