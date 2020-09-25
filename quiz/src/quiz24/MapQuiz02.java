package quiz24;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 맵을 이용하는데 key:메뉴이름, value:가격
		Map<String, Integer> menu = new HashMap<>(); // 메뉴판

		while (true) {
			
			try {
				System.out.println("------메뉴 관리------");
				System.out.println("1. 신규 메뉴 등록");// 이미 등록된 메뉴인지 확인 후 메뉴 등록
				System.out.println("2. 메뉴판 전체 보기");// 메뉴와 가격을 전부 출력
				System.out.println("3. 메뉴판 수정");// 메뉴를 받아서 메뉴가 있다면 가격 수정
				System.out.println("4. 메뉴판 삭제");// 메뉴를 받아서 메뉴가 있다면 삭제
				System.out.println("5. 프로그램 종료");// 종료
				System.out.print("\n번호 선택: ");
				int num = sc.nextInt();

				if (num == 1) {// 이미 등록된 메뉴인지 확인 후 메뉴 등록
					System.out.print("이름: ");
					String name = sc.next();
					
					if (menu.containsKey(name)) {// 이미 등록됨
						System.out.println(name + "은 이미 등록된 메뉴 입니다.");
					} else {//신규 등록
						System.out.print("가격: ");
						int price = sc.nextInt();
						
						menu.put(name, price);
						System.out.println("메뉴가 등록되었습니다.");
					}

				} else if (num == 2) {// 메뉴와 가격을 전부 출력
					//Set-Entry형식으로 메뉴와 가격을 등록
					System.out.println("-----Entry 타입-----");
					System.out.println("-------메뉴판-------");
					Set<Entry<String, Integer>> entry = menu.entrySet();
					for(Entry<String, Integer> e : entry) {
						System.out.println("이름: " + e.getKey() + " /가격: " + e.getValue());
					}
					
					//Iterator(반복자) 방법
					System.out.println("-----Iterator(반복자) 타입-----");
					System.out.println("-------메뉴판-------");
					Set<String> keySet = menu.keySet(); //key를 Set타입으로 변경
					Iterator<String> iter = keySet.iterator(); //key를 iterator로 변경
					while(iter.hasNext()) {
						String key = iter.next();
						System.out.println("이름: " + key + " /가격: " + menu.get(key));
					}
					
					
				} else if (num == 3) {// 변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
					System.out.println("가격을 변경할 메뉴> ");
					String name = sc.next();
					
					if(menu.containsKey(name)) {//메뉴가 존재
						System.out.print("가격> ");
						int price = sc.nextInt();
						menu.put(name, price);
						System.out.print(name + "의 가격이 " + price + "원으로 변경되었습니다.");
					}else {//메뉴 x
						System.out.println("메뉴가 존재하지 않습니다.");
					}
					
				} else if (num == 4) {// 변경할 메뉴를 받아서 메뉴가 있다면 삭제
					System.out.print("삭제할 메뉴> ");
					String name = sc.next();
					
					if(menu.containsKey(name)) {//삭제
						menu.remove(name);
						System.out.println("메뉴가 삭제 되었습니다.");
					}else {
						System.out.println("메뉴가 존재하지 않습니다.");
					}
					
					
				} else if (num == 5) {
					System.out.println("종료합니다.");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				sc.nextLine();
			}
		}
			

	}
}




























