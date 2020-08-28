package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	//Quiz07 - switch
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"수박", "사과", "멜론", "포도", "귤"};
		
		System.out.println("구입할 메뉴는?");
		System.out.println(Arrays.toString(menu));
		System.out.print("> ");
		String choice  = sc.next();
		
		switch (choice) { 
		case "수박":
			System.out.println(choice + "의 가격은 2만원 입니다.");
			break;
			
		case "사과":
			System.out.println(choice + "의 가격은 1만원 입니다.");
			break;
			
		case "멜론":
			System.out.println(choice + "의 가격은 5만원 입니다.");
			break;
			
		case "포도":
			System.out.println(choice + "의 가격은 3만원 입니다.");
			break;
			
		case "귤":
			System.out.println(choice + "의 가격은 2만원 입니다.");
			break;
			
		default:
			System.out.println(choice + "는 메뉴에 없습니다.");
			System.out.println("다시 입력해 주세요.");
			break;
		}
		
		sc.close();
		
		
	}
	
	
}
