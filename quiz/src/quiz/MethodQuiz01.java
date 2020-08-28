package quiz;

import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		//print
		print();
		
		//input 1,2
		int num1 = input1();
		int num2 = input2();
		
		//add
		int result = add(num1, num2);	
		
		//showResult
		showResult(result);
	}
	
	static void print() {
		System.out.println("정수 두개를 입력하세요");
	}
	
	static int input1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력: ");
		int num1 = sc.nextInt();
		
		return num1;
	}
	
	static int input2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2 입력: ");
		int num2 = sc.nextInt();
		
		return num2;
	}
	
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static void showResult(int result) {
		System.out.println("결과: " + result);
	}
	
}





























