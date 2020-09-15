package OverridingBasic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		System.out.println("------------------------");
		
		Child c = new Child();
		c.method01();
		c.method02();	//오버라이딩 된 메서드가 먼저 실행된다!
		
	}
}
