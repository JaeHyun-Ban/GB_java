package quiz;

import java.util.Scanner;

public class Quiz16 {
	
	//quiz11
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 단수를 입력하세요: ");
		int dan = sc.nextInt();
		
		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("-------------------------------------");
		
		int i = 1;		//매개변수
		while(i < 10) {
			
			System.out.println(dan + " X " + i + " = " + (dan*i));
			
			i++;
		}
		
		
	}
}




































