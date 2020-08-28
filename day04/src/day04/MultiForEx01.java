package day04;

public class MultiForEx01 {
	
	public static void main(String[] args) {
		
		//중복 반복문속 i와 j의 값에 따라 바뀌는 숫자를 잘 파악하자
		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " - " + j);
//			}
//		}
		
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i + " - " + j);
			}
		}
		
		
	}
	
}






























