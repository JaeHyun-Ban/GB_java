package day05;

public class BreakEx01 {
	public static void main(String[] args) {
		
		/*
		 * 무한 반복문
		 * - 반복문의 횟수를 정확히 모를 때 주로 사용하고
		 *   자바에서는 while(true) 문장을 많이 사용합니다.
		 */
		
		
		int i = 1;
		while(true) {
			//true는 조건문과 함께 사용되면 좋다
			if(i == 15) {
				break;
			}
			
			System.out.println(i);
			i++;
		}
		
		
		
		
		
	}
}
