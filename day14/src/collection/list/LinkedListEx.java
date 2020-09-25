package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		//LinkedList는 Queue와 List를 동시에 구현하고 있기 때문에,
		//Queue에 저장하면 Queue처럼 동작, List에 저장하면  List처럼 동작한다.
		//FIFO - First In First Out
		
//		List<String> list = new LinkedList<>();
		Queue<String> list = new LinkedList<>();
		
		
		list.add("홍길동");
		list.add("홍길자");
		
		System.out.println("원래 크기: " + list.size());
		System.out.println(list.peek());// peek - 값을 꺼냄
		System.out.println("peek 이후: " + list.size());//크기 변화 확인
		
		System.out.println(list.poll()); // poll - 값을 꺼냄 + 지움
		System.out.println("poll 이후: " + list.size());
		
		//리스트와 동일하게 동작
//		List<String> list2 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("홍길동");
		list2.add("홍길자");
		list2.add("김길동");
		
		list2.addFirst("이순신"); //처음에 추가
		list2.addLast("김유신"); //마지막에 추가
		
		System.out.println(list2.toString());
		//>링크드 리스트는 " ㅁ -> ㅁ -> ㅁ -> ... "처럼 꼬리를 물어가며 추가된다 
		
		System.out.println("1번째 인덱스에 추가되어 있는 값: " + list2.get(1)); //값 얻기
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






























