package static_.basic;

public class Calculator {
	
	/*
	 * - 계산기 마다 색깔이나 결과값은 다르기 때문에 일반 멤버변수가 된다.
	 * - 계산기 마다 원주율은 동일하기 때문에 static변수로 선언하는게 좋다.
	 */
	private String color;
	private int result;
	public static double pi = 3.14;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void add(int n) {
		result += n;
	}
	
	/*
	 * - 메서드 내부에서 일반멤버변수를 쓰지 않고
	 * 	 법용성 있게 사용하는 메서드는 static키워드를 사용하는 편이 좋다.
	 */
	public static double circle(int r) {
		return r * r * pi;//반지름 * 반지름 * 파이 = 원 넓이
	}
	
	
	
	
}






































