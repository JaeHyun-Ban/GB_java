package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//ArrayList객체 생성
//		ArrayList<String> list = new ArrayList<>();
		//>제네릭 클래스를 가지고 있다.
		
		//List의 상위인 Collection 인터페이스도 가능하긴하다
//		Collection<String> list = new ArrayList<>();
		
		//ArrayList의 상위에는 List가 존재한다
		List<String> list = new ArrayList<>(); //이렇게 생성 가능
		//>주로 사용하는 방식
		//>>List계열들이 다양하게 들어갈 수 있다(편하다)
		
		//list의 값 추가 - add()
		list.add("JAVA");
		list.add("DataBase");
		list.add("JSP");
		list.add("SPRING");
		list.add("JAVA");
		
		//list의 크기 - size()
		System.out.println("list의 크기: " + list.size());
		
		//list의 저장된 객체를 문자열로 확인 - toString()
		System.out.println(list.toString());
		
		//list의 중간에 값을 추가 - add(index, 값)
		list.add(2, "ORACLE");
		System.out.println(list.toString());
		
		//list의 값을 얻기 - get(index)
		String value = list.get(2);
		System.out.println("2번째 인덱스의 값: " + value);
		
		//list의 특정값의 포함 여부 - contains(값)
		if(list.contains("JSP")) {
			//boolean으로 리턴
			System.out.println("JSP가 포함되어 있다");
		}
		
		
		//list의 삭제 - remove(값) or remove(index)
		list.remove(0);
		System.out.println(list.toString());
		list.remove("JSP");
		System.out.println(list.toString());
		
		//list에 컬렉션을 전체 추가 - addAll(리스트)
		String[] arr = {"React", "AWS"};
		List<String> list2 = Arrays.asList(arr); //List<String>으로 반환해준다
		list.addAll(list2); //list에 list2를 전부 추가한다.
		System.out.println(list.toString());
		
		
		
		
	}
}










































