package generic.basic1;

import api.lang.object.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 제네릭 클래스를 이용하면, 객체를 생성할 때 타입을 지정할 수 있고, 
		 * 다목적 형태의 클래스를 안전하게 사용이 가능하다.
		 */
		
		
		//ABC생성시 바로<T>타입이 붙어 나온다
//		ABC<T> abc = new ABC<T>();
		ABC<String> abc = new ABC<String>(); //String타입을 저장할 용도의 Class
		ABC<String> abcc = new ABC<>();//생성자에는 타입을 스킵해도 된다. 
		
		abc.setT("홍길자");
		String name = abc.getT();
		//>String 제네릭으로 인해  문자열로 잘 저장이 되었고 빼낼 때도 문제가 없다.
		
		//제네릭에는 기본형 타입이 저장될 수 없다
//		ABC<int> abc = new ABC<String>; //> X
		ABC<Integer> abc2 = new ABC<>(); //> O 
		abc2.setT(1);
		
		int num = abc2.getT();
		
		//Person타입으로 생성
		ABC<Person> abc3 = new ABC<>();
		abc3.setT(new Person()); //Person타입만 들어간다.
		
		Person p = abc3.getT();
		
		
		
		
		
	}
}












































