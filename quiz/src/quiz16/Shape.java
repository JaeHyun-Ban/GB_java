package quiz16;

public abstract class Shape {
	
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	//오버라이딩을 강제화 하는 추상메서드
	//>도형마다 넓이를 구하는 메서드
	public abstract double getArea();
	
	//오버라이딩을 강제화 하지 않는다면 일반메서드
	public String getName() {
		return "도형이름: " + name;
	}
	
	
	
}
