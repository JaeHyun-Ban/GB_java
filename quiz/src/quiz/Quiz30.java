package quiz;

import java.util.Arrays;

public class Quiz30 {

	public static void main(String[] args) {
		
		//자료구조  - 선택정렬
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};// 길이가 7
		
		
//		for(int i = 0;  i < arr.length; i++) {
//			
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[j] = arr[i];
//					arr[j] = tmp;
//				}	
//			}
//		}
		Arrays.sort(arr);	//Arrays.sort 기능을 통해 알아서 오름차순 정렬을 해 준다.
							//뭐든 정렬을 해놔야 하기 쉬워진다.
		
		System.out.println(Arrays.toString(arr));
		//내림차순 정렬은 자바에 없다
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}





