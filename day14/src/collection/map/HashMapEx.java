package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//map에 저장 - put(key, value)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동"); //value의 값 - 중복 o
		
		System.out.println("맵의 크기: " + map.size());
		System.out.println(map.toString());
		
		// 맵에 같은 key를 저장할 경우, key에 있는 value를 수정한다.
		map.put(4, "신사임당");
		System.out.println(map.toString());//4번이 덮어 씌워짐
		
		//map에 저장된 value값 얻기 - get(key) >> String으로 리턴
		String value = map.get(3);
		System.out.println("3번 키에 저장된값: " + value);
		
		//map의 검색 - containsKey(key) >> boolean으로 리턴
		if(map.containsKey(1)) {
			System.out.println("1번 키가 존재함");
		}
		
		Set<Integer> set = map.keySet(); //Integer타입 Set
		for(int key : set) {
			System.out.println(map.get(key));
		}
		System.out.println("------------------------------");
		
		////////////////반복자/////////////////////////
		//Entry란 - 1=홍길동 >> 둘의 묶음
		//map에 저장된 값을 순서대로 출력하려면 - keySet, EntrySet
		Set<Integer> keySet =  map.keySet(); //key만 뽑아서 Set으로 변경
//		System.out.println(keySet.toString());
		Iterator<Integer> iter = keySet.iterator(); //iterator타입으로 리턴
		
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(map.get(key));
		}
		System.out.println("-------------------------------");
		
		//Entry = {key=value} 값을 지닌 형태
		Set<Entry<Integer, String>> entry =  map.entrySet();
		
		for(Entry<Integer, String> e : entry) {//Entry형태를 통째로 보내줌
			System.out.println(e.getKey() + ":" + e.getValue());//Entry e에서 key와 value를 하나씩 뽑는다.
			
		}
		
		
		
		
		
	}
	
}
















































