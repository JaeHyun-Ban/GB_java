package inter.basic;

import java.io.Serializable;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		System.out.println(b.PI);
		System.out.println(b.ABC);
		
		
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
		
		System.out.println("---------------------");
		/*
		 * - 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
		 * - 인터페이스를 부모형 타입으로 사용할 때, 다형성의 형태와 동일하게 실행
		 */
		Inter1 i1 = b; //Inter1 i1 = new Basic()
		i1.method1(); //오버라이딩 된 메서드
//		i1.method2();
//		i1.method3();
		
		Inter2 i2 = b;
//		i2.method1();
		i2.method2(); //오버라이딩 된 메서드
//		i2.method3();
		
		//인터페이스를 추가해 속성을 넣어놓는 느낌?/ 사용방법을 추가한다
		Basic bb = (Basic)i1;
		String s = new String("홍길동");
		Serializable ss = new String("홍길동");
		
	}
	
}





































