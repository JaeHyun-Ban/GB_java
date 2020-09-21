package quiz17;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * - 인터페이스 형으로 선언하고, 무한반복문 안에서
		 * 추가, 재생, 종료 메뉴를 입력받아서 클래스의 각 기능을 실행해 보세요.
		 * 
		 * 벅스,,,지니,,,멜론,,,
		 */
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		Melon m = new Melon();
		
		
		start:while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.노래추가  2.재생목록  3.재생  4.다음  5.이전  6.종료");
			System.out.print("선택: ");
			
			String n = sc.next();
			System.out.println();
			
			//숫자 조건 판단
//			if(Integer.parseInt(n) == flag) {
//				System.out.println("잘못된 선택입니다.");
//				System.out.println();
//			}//문자일 시 조건은 뭘까요?
			//그냥 if로 해결하자...
			if (n.equals("1")) {
				m.add();
			} else if (n.equals("2")) {
				m.playlist();
			} else if (n.equals("3")) {
				m.play();
			} else if (n.equals("4")) {
				m.next();
			} else if (n.equals("5")) {
				m.prev();
			} else if (n.equals("6")) {
				m.end();
			}else {
				System.out.println("잘못된 입력입니다!\n\n");
			}
//			switch (m.select(n)) {
//			case "1":
//				m.add();
//				break;
//			case "2":
//				m.plylist();
//				break;
//			case "3":
//				m.play();
//				break;
//			case "4":
//				m.next();
//				break;
//			case "5":
//				m.prev();
//				break;
//			case "6":
//				m.end();
//				break start;
//			default:
//				System.out.println("잘못된 입력입니다");
//				break;
//			}
//			
			
		}
		
		
		
	}
	
}
