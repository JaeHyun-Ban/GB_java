package quiz;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중 7의 배수를 가로로 출력
		System.out.println("7~100까지 정수 중 7의 배수");
		for(int i = 7; i < 101; i++) {
			if(i%7 == 0) {
				System.out.printf("%d ", i);
			}
		}
//		for(int i = 7; i <101; i+=7)	//증감식을 7씩증가하게 해도 된다
		System.out.println();
		System.out.println("=============================");
		
		
		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		System.out.println("1~100까지 정수 중 12의 배수");
		for(int i = 1; i < 101;i++) {
			if(i%12 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		System.out.println("=============================");
		
		
		//3. 1~200까지 정수 중 9의 배수의 개수
		int count = 0;
		for(int i = 1; i < 201; i++) {
			if(i%9 == 0) {
				count++;
			}
		}
		System.out.println("1~200까지 정수 중 9의 배수의 개수: " + count);
		System.out.println("=============================");
		
		
		//4. 50~100까지 두 수 사이의 합
		int sum = 0;
		for(int i = 50; i < 101; i++) {
			sum += i;
		}
		System.out.println("50~100까지 두 수 사이의 합: " + sum);
		System.out.println("=============================");
		
		
		//5. char를 이용해서 A~Z까지 가로로 출력(A유니코드 = 65)
		System.out.println("A~Z까지 가로로 출력");
//		for(chat i  = 'A'; i <= 'Z'; i++)
		for(char i = 65; i < 91; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=============================");
		
		
		//6. 입력받은 정수 까지 팩토리얼 값 5! = 5x4x3x2x1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		int fac = 1;
		for(int i = num; i > 0; i--) {
			fac *= i;
		}
		System.out.println("입력받은 정수 까지 팩토리얼 값: " + fac);
		
		
		
		
		
		
		
		
	}
	
	
}

















