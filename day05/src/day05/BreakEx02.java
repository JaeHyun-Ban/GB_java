package day05;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			int ran = (int)(Math.random()*10) + 1; //1~10
			
			System.out.println("5 x " + ran +  " = ?");
			System.out.print("> ");
			int answer = sc.nextInt();
			if(answer == 5*ran) {
				System.out.println("정답 입니다!!!");
				break;
			}else System.out.println("다시 입력하세요!!!");
			System.out.println();
		}
		
		
	}
}
