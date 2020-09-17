package static_.init;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 클래스가 호출될 떄 정적초기화 자는 단 한번만 호출 됩니다.
		 * static키워드의 특징입니다.
		 */
		
		System.out.println(Computer.company);
		Computer c1 = new Computer(1000);
		Computer c2 = new Computer(1000);
		Computer c3 = new Computer(1000);
		
		
		
		
		
	}
}
