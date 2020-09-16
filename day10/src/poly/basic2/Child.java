package poly.basic2;

public class Child extends Parent{
	
	//접근 제한자까지도 똑같이 생성해야한다.
//	void method2() {
//		
//	}
	
	@Override
	public void method2() {
		System.out.println("자식의 오버라이딩 된 2번 메서드 실행!");
	}
	
	public void method3() {
		System.out.println("자식의 3번 메서드 실행!");
	}
	
	
	
	
}
