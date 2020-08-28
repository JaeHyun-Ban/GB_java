package day05;

public class EnhancedForEx {
	
	//향상for문
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int a : arr) {//순서대로 값을 뽑아준다.
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("===================================");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String b : arr2) {
			System.out.print(b);
		}
		System.out.println();
		System.out.println("===================================");
		
		//향상 for문을 사용해 합계와 평균 구하기
		int[] score = {33, 55, 45};
		int sum = 0;
		
		
		for(int num : score) {
			sum += num;
		}
		double avg = (double)sum / score.length;
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.2f\n", avg);
		
		
	}
}


























