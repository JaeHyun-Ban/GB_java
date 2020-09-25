package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		//set계열 - 순서 x, 중복 x
		
//		HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//set의 추가 - add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA"); //중복 - X
		
		//set의 크기 - size()
		System.out.println(set.size()); //중복이 제거되 4가 나온다
		System.out.println(set.toString());
		
		//set에 저장된 객체를 확인 - 반복자(Iterator)를 통해 한번씩 확인한다.
		Iterator<String> iter = set.iterator(); //set을 반복자 타입으로 변경
		
//		iter.hasNext();//다음이 존재하는지 확인 boolean 리턴
		while(iter.hasNext()) { //다음에 대한 조회
			System.out.println(iter.next()); //다음에 접근
		}
		
		//set의 검색 - contains()
		if(set.contains("JSP")) {
			System.out.println("JSP가 포함되어 있음");
		}
		
		//set의 삭제 - remove()
		set.remove("JAVA");
		System.out.println(set.toString());
		
		
		
		
		
		
		
	}
}
















































