package quiz;

import java.util.Scanner;

public class Test01 {

	/*
	 - 스캐너를 통해서 정수를 입력받습니다.
	 - 1부터 해당 정수까지 소수들의 합을 구하는 코드를 작성
	 
	 ex) 10을 입력 받으면 2, 3, 5, 7
	 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 2; i <= num; i++) {
			
			int count = 0;					//소수 측정 계산기
			
			for(int j = 1; j <= num; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
	}
}
































