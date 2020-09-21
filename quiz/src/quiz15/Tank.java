package quiz15;

public class Tank extends Unit {
	
	private final static int SIZE = 4;
	private static final String NAME = "Tank";
	
	
	public Tank() {
		super(0, 0, 100, NAME);
	}
	
	
	
	@Override
	public void location() {
		System.out.print("탱크 위치: ");
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
		
	}
	@Override
	public void move(int x, int y) {
		int preX = x - getX();
		int preY = y - getY();
		setX(preX);
		setY(preY);
		System.out.println("탱크이동 거리: " 
		+ (int)(Math.sqrt((int)Math.pow(getX(), 2) + (int)Math.pow(getY(), 2))));
	}


	public static int getSize() {
		return SIZE;
	}



	
	
	
	
	
	
	
	
	
	
	
}
