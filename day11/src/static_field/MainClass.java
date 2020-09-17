package static_field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("c1");
		System.out.println("일반멤버변수: " + c1.a);
		System.out.println("정적멤버변수: " + c1.b);
		System.out.println("------------------------");
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("c2");
		System.out.println("일반멤버변수: " + c2.a);
		System.out.println("정적멤버변수: " + c2.b);
		System.out.println("------------------------");
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("c3");
		System.out.println("일반멤버변수: " + c3.a);
		System.out.println("정적멤버변수: " + c3.b);
		System.out.println("------------------------");
		
		/*
		 * - static은 클래스밖에 1개 생성된다.
		 * 	- (객체들 사이의 같은 값을 가지게 한다.)
		 * - 객체생성 없이 "클래스이름.변수명" 으로 사용한다.
		 */
		
		System.out.println("c3.b1~3");
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
		Count.b++; //>바로 클래스를 참조해서 사용할 수 있다.
		System.out.println(Count.b); //1증가됨
		
		
		
		//일반 멤버변수 a는 변수 생성 시마다 새로운 객체가 생성되는데
		//정적 멤버변수 b는 단 1개의 객체가 생성되며 클래스와 상관없이
		// 공용하며 사용된다.(정적 = 한개생성 후 안바뀜, 고정시키는 느낌)
		
		
		
		
		
		
	}
}
































