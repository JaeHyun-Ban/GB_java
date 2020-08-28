package quiz;

import java.util.Scanner;

public class Quiz06 {
	
	
	//quiz04
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키: ");
		int tall = sc.nextInt();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("=============================");
		if(tall >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		}else {
			System.out.println("놀이기구 탑승이 불가능 합니다.");
		}
		
		sc.close();
		
		
	}
	
}
