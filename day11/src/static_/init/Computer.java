package static_.init;

public class Computer {
	
	public static String company;
	public static String model;
	public int price;
	
	//static변수의 초기화 -> static블럭
	//static변수는 정적 초기화자에서 초기화
	static {
		System.out.println("정적 초기화자 호출됨!");
		//여기다 초기화 하나, 생성시에 바로 정해주나 똑같다.
		company = "LG";
		model = "gram";
	}
	
	
	//일반 멤버변수만 생성자에서 초기화
	public Computer(int price) {
		System.out.println("Computer 생성자 호출됨!");
//		company = "LG"; //생성자를 거치지 않으면 실행 할 수 없음
		this.price = price;
	}
	
	
	
}







































