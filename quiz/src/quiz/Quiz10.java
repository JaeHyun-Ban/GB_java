package quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		/*
		 - 정수 3개를 받아서, 큰값, 중간, 작은값을 구분하면 됩니다.
		 (단, 세 값이 같은 경우는 존재하지 않는다)
		 */
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세가지 정수를 입력!");
		System.out.print("> ");
		int num1 = sc.nextInt();
		System.out.print("> ");
		int num2 = sc.nextInt();
		System.out.print("> ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {			//num1이 가장 큰 경우
			max = num1;
			if(num2 > num3) {		
				mid = num2;
				min = num3;
			}else {
				mid = num3;
				min = num2;
			} 
		}else if(num2 > num1 && num2 > num3) {		//num2가 가장 큰 경우
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
		
			}else {
				mid = num3;
				min = num2;
			}
		}else if(num3 > num1 && num3 > num2) {		//num3이 가장 큰 경우
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
		
			}else {
				mid = num2;
				min = num1;
			}
		}
		System.out.println("큰값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("작은값: " + min);
		
		sc.close();
	
	}
}































