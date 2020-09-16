package poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		//1.0패치
		Parent p = new Parent();
		p.method1();
		p.method2();
		System.out.println("----------------");
		
		//1.0기반 + ?.0, 1.? 가능
		Child c = new Child();
		c.method1();
		c.method2();//1.1패치
		c.method3();//2.0패치
		System.out.println("----------------");
		
		//1.?패치만 사용 가능
		Parent p2 = new Child();
		p2.method1();
		p2.method2();
		//오버라이딩이 아닌 메서드는 사용할 수 없다.
//		p2.method3(); 
		System.out.println("----------------");
		
		Parent p3 = c;
		
		System.out.println(p);
		System.out.println(c);
		System.out.println(p == p3);
		
		System.out.println("------클래스 캐스팅------");
		/*
		 * # 클래스 캐스팅
		 * - 다형성 적용시 자식이 원래 가지고 있던 멤버에 접근 할 수 없는 문제가 발생하는데, 
		 *  클래스 캐스팅으로 본래의 변경이 가능하다.
		 * - 단, 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 에러가 방생한다.
		 */
		Child cc = (Child)p3;
		cc.method1();
		cc.method2();
		cc.method3();
		
		
		
	}
}




































