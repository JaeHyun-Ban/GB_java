package day03;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		
		//입력받은 수가 소수 인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int num = sc.nextInt();
		
		int x = 2;
		//조건을 스스로 생각해 보자
		//소수는 1 과 나 자신으로만 나누어지는 수 이므로
		//2부터 시작해 num까지 나누어서 나머지가 나오는 것이 존재한다면 그 수는 소수가 아니다.
		while(num % x != 0) { //나머지가 있다면
			
			x++;
		}
		
		System.out.println(num == x ? num + "은 소수입니다!" : num + "은 소수가 아닙니다!");
		
		
		
		
		
		
	}
}




















