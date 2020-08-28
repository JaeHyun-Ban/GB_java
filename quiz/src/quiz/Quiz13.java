package quiz;

import java.util.Scanner;

public class Quiz13 {
	
	public static void main(String[] args) {
		
		//정수를 하나 입력받고 
		//연산자를 선택한 후
		//또다른 정수를 입력받고
		//계산 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수01> ");
		int num1 = sc.nextInt();
		
		System.out.println("연산을 선택하세요[+, -, *, /]");
		System.out.print("> ");
		String calc = sc.next();
		
		System.out.print("정수02> ");
		int num2 = sc.nextInt();
		
		switch (calc) {
		case "+":
			System.out.println("두 수의 덧셈은: " + (num1 + num2));
			break;
		
		case "-":
			System.out.println("두 수의 뺄셈은: " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱셈은: " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (num1 / num2));
			break;
		default:
			System.out.println("잘못된 연산을 입력했습니다!!!");
			break;
		}
		
		sc.close();
		
		
		
	}
}






































