package quiz;

import java.util.Scanner;

public class Quiz34 {
	
	//Quiz16
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요> ");
		int money = sc.nextInt();
		
		//이름을 붙여서 탈출하기
		choice:while(true) {
			System.out.println("남은금액: " + money + "원");
			System.out.println("[1]데미소다: 400원, "
							+ "[2]밀키스: 500원, "
							+ "[3]코카콜라: 600원, "
							+ "[4]잔돈받기");
			System.out.print("음료수 선택> ");
			int num = sc.nextInt();
			
			
			
			switch (num) {
			
			case 1:
				if(money < 400) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					System.out.println();
				} else {
					money -= 400;
					System.out.println("데미소다를 받았습니다!");
					System.out.println();
				}
				break;
				
			case 2:
				if(money < 500) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					System.out.println();
				}else {
					money -= 500;
					System.out.println("밀키스를 받았습니다!");
					System.out.println();
				}
				break;
			
			case 3:
				if(money < 600) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					System.out.println();
				}else {
					money -= 600;
					System.out.println("코카콜라를 받았습니다!");
					System.out.println();
				}
				break;
				
			case 4://탈출
				System.out.println("남은 금액 " + money + "원 을 반환합니다.");
				System.out.println();
				break choice;
			
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요!");
				break;
			}//switch
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
	}
}





























