package ramda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		list.add("홍길자");

		// Iterator - 나열해주는 함수
		Iterator<String> iter = list.iterator();// 컬렉션 ->반복자
		
		
		//반복자는 next()로 순차적인 접근을한다 ㅁ -> ㅁ -> ㅁ ->
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		Stream<String> stream = list.stream(); // 컬렉션 -> 스트림
		
//		stream.forEach(new Consumer<String>() { //추상메서드가 한개인 인터페이스 타입이다
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
		//위의 식을 람다로 바로 표현 할 수 있다.
		stream.forEach((t) ->System.out.println(t) ); //forEach() - 결과 출력
		list.stream().forEach( (t) -> System.out.println(t) );
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}











































