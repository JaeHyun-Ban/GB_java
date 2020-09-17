package static_.method;

import java.util.Arrays;

public class MainClass {
	
//	int x;
	static int x;
	
	
	public static void main(String[] args) {
		
		Count.b++;
		Count.method2();
		
		Count c = new Count();
		c.a = 10;
		c.method1();
		
		System.out.println(Count.b);
		
//		MainClass m = new MainClass();
//		m.x = 10;
		x = 10;
		/*
		 * # static메서드가 사용되는 곳
		 * - Arrays.toString(a);
		 * - Math.random();
		 * 
		 * 이렇게 어디에서나 불려서 사용해야하는 자바 내장 객체들이 바로
		 *  static으로 만들어져있다.
		 */
		
	}
	
}
