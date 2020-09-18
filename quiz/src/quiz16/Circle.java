package quiz16;

public class Circle extends Shape{

	/*
	 * 원은 radius변수를 가지고
	 * 생성될 때 이름과, 변의 길이를 받아서 생성된다.
	 * 
	 * 상수 PI를 멤버변수로 가진다.
	 * 
	 * getArea()는 원의 넓이를 계산하도록 처리한다.
	 */
	public static final double PI = 3.141592;

	private int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	

	@Override
	public double getArea() {
		return radius * radius * PI;
	}
	
	
	
	
	
}
