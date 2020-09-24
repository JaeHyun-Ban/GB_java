package quiz21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {
	
	//list에 1~20까지 정수 저장
	//저장한 값을 반복문으로 출력
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i < 21; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		
		System.out.println();
		
		for(int i = 0; i < 20; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
		
	}
	
	
	
}
