package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		//strea 중간처리
		List<Integer> list = new ArrayList<>();
		
		//랜덤한 값을 넣어보자
		Random ran = new Random();
		for(int i = 0; i < 100; i++) {
			list.add(ran.nextInt(100) + 1);
		}
		
		System.out.print("최초: " + list.toString());
		
		System.out.println("\n--------------------------------------------");
		//stream의 중간처리 메서드는 처리 결과를 다시 stream타입으로 반환한다.
		//중복제거 distinct() - 중간 처리 메서드
		list.stream().distinct().forEach((s) -> System.out.print(s + ", "));
		
		System.out.println("\n--------------------------------------------");
		//sort() - 정렬
		list.stream().distinct().sorted().forEach((s) -> System.out.print(s + ", "));
		
		System.out.println("\n--------------------------------------------");
		//filter() - 중간필터
		list.stream().distinct().sorted().filter( (t) -> {
			//....
			return t % 2 == 0; //짝수일 때만 출력
			
		}).forEach((s) -> System.out.print(s + ", "));
		
		System.out.println("\n--------------------------------------------");
		//map() - 람다안에 정의 된 새로운 stream타입으로 반환
		list.stream().distinct().sorted().map((i) -> {
			return i % 2 == 0 ? "짝수" : "홀수";
		})
		.forEach((s) -> System.out.print(s + ", "));
		
		
		
		System.out.println("\n--------------------------------------------");
		//최종처리 - collect() 스트림의 처리된 결과를 list로 반환
		List<Integer> result = list.stream().sorted().filter((t) -> {
			return t%3 == 0; //3의만 조건
		}) //중괄호를 빼고 작성해주면 하나의 리턴값이 된다.
		.collect(Collectors.toList());//리스트로 반환받겟다
		
		
		System.out.println(result.toString());
		
		//최종처리 - max() 큰값 찾기
		list.stream()
			.distinct()
			.sorted()
			.max(null);
		
	}
}





























