package generic.bad;

import api.lang.object.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 멤버변수를 Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 저장했던 값을 사용할 때, 타입별로 형 변환을 해야하는 문제가 발생한다.
		 * 
		 * 그리고 잘못 형 변환을 하면 예외를 발생시킨다.
		 */
		
		
		ABC abc = new ABC();
		
		abc.setObj("홍길자");
		
		//문자열을 저장했지만 String으로 캐스팅을 해주어야 한다
		String name = (String) abc.getObj(); 
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person());
		
		Person p = (Person) abc2.getObj();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}





































