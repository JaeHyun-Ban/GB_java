package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	//List<?> - 타입 상관없이 무엇이든 들어 갈 수 있음.
	//List<? extends String> - String의 자식클래스는 전달가능.(상위 클래스 제한)
	//List<? super Integer> - Integer의 형태를 가지고 있다면, 전달 가능(하위 클래스 제한)
	
	public static void add(List<?> list) {
		
		
	}
	
	public static void add2(List<? extends String> list) {
		
		
	}
	
	public static void add3(List<? super Integer> lsit) {
		
		
	}
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		//> add O, add2 O, add3 X
		List<Integer> list2 = new ArrayList<>();
		//> add O, add2 X, add3 O
		List<Object> list3 = new ArrayList<>();
		//> add O, add2 X, add3 O
		
		add(list1);
		add(list2);
		add(list3);
		
		add2(list1);
//		add2(list2); //Integer X
//		add2(list3); //String의 자식 타입이 아님 X
		
//		add3(list1); //>Integer X
		add3(list2);
		add3(list3);
		
		
		
	}
	
	
}






































