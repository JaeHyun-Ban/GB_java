package static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반메서드 - 일반, 정적변수 모두 사용가능하다.
	public int method1() {
		
		a = 10;
		
		return ++b;
	}
	
	//정적메서드 - static이 붙은 변수나 메서드만 사용이 가능.
	//			 단, 객체 생성을 통해서는 일반 변수도 사용이 가능.
	//			기본적으로 일반변수 사용 X
	public static int method2() {
		
		Count c = new Count();
		c.a = 10;
		
		return ++b;
	}
	
	
	
	
}





































