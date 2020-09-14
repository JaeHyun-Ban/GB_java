package quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {
		
//		int[] arr1 = {1,2,3,4};
//		int[] arr2 = {1,2,3,4};
//		//Arrays.equals = 배열을 비교해 true, false로 반환한다.
//		System.out.println(Arrays.equals(arr1, arr2));
		
		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
	
		long count = lottoRun(arr);
		System.err.println("결과: " + count);
		
		
	}
	
	
	static int[] lottoNum() {
		
		int[] arr = new int[6];
		
		int index = 0;
		start:while(true) {
			
			if(index == 6) {
				break;
			}
			
			int num = (int)(Math.random() * 45) + 1;
			
			//중복검사
			//매번 0~5까지 전체 숫자를 새로 뽑은 수자와 비교한다.
			for(int i = 0; i < index; i++) { //index대신 arr.length를 사용해도 괜찮다.
				if(arr[i] == num) {
					continue start;
				}
			}	
			arr[index] = num;
			index++;
		}
//		Arrays.sort(arr); //숫자를 정렬
		return arr;
	}
	
	
	static long lottoRun(int[] arr) {
		long count = 0;
		Arrays.sort(arr);
		
		//굉장히 짧고 신선한데?
		while(true) {
			
			int[] arr2 = lottoNum(); //새로운 랜덤번호를 다시 생성
			
			//뭔가 비교할 때는 항상 정렬 해 놓고 사용할 것
			if(Arrays.equals(arr, arr2)) {
				return count * 1000; //바로 반환 가능
			}
			count++;	
		}
	}//end
	
	
}













































