package api.lang.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		
		//https://coding-factory.tistory.com/547
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//Boxing: 기본 타입 -> 클래스형으로 변환하는 작업
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		//>프로그래밍을 하다 보면 기본타입의 데이터를 '객체'로 표현해야 하는경우가 종종 발생한다
		//>이럴 때 기본 자료타입을 객체로 다루기 위해 사용하는 클래스 = wrapper class
		
		
		//오브젝트 타입에 담을 수 있게된다
		Object[] arr = {val1, val2, val3, val4};
		
		
		//Unboxing: 포장된 객체를 다시 기본타입으로 변환하는 작업
		a = val1.intValue();
		b = val2.doubleValue();
		c = val3.charValue();
		d = val4.booleanValue();
		
		
	}
}
