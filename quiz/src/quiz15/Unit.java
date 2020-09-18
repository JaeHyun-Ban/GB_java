package quiz15;

public abstract class Unit {
	
	
	private int x;
	private int y;
	private int hp;
	private String name;

	public Unit(int x, int y, int hp, String name) {
		super();
		this.x = x;
		this.y = y; 
		this.hp = hp;
		this.setName(name);
	}
	
	//각각 오버라이딩 해야하는 메서드는 추상메서드로 선언
	// 현재 위치 출력
	public abstract void location();
	// x,y값을 변경
	public abstract void move(int x, int y);
	// 현재 위치에 정지
	public void stop() {
		System.out.println("정지");
	}
	
	//getter, setter
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
