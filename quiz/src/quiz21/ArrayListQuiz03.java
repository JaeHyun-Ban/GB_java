package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		
		
		while(true) {
			
			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료 ]");
			System.out.print("메뉴입력> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				//스캐너로 이름, 나이를 받고 User객체에 저장, list에 추가
				User u = new User();
				
				System.out.print("이름: ");
				u.setName(sc.next());
				System.out.print("나이: ");
				u.setAge(sc.nextInt());
				list.add(u);
				
			} else if(menu == 2) {
				//list길이만큼 회전하면서 모든 회원정보 출력
				for(int i = 0; i < list.size(); i++) {
					System.out.println("이름: " + list.get(i).getName()
									+ ", 나이: " + list.get(i).getAge());
				}
				
			} else if(menu == 3) {
				//찾을 이름을 입력받고, 이름이 있다면 이름, 나이를 출력
				//찾는 이름이 없다면 ~~~님은 목록에 없습니다 를 출력
				System.out.print("이름 입력: ");
				String name = sc.next();
				
				int count = 1; //검색 카운트

				for(int i = 0; i < list.size(); i++) {
					
					if(list.get(i).getName().contains(name)) { //이름이 있다면
						System.out.println("이름: " + list.get(i).getName()
								+ ", 나이: " + list.get(i).getAge());
						count--;
					}
				}
			
				if(count == 1) {
					System.out.println(name + "님은 목록에 없습니다.");
				}
				
			} else if(menu == 4) {
				//삭제할 이름을 입력받고, 입력받은 이름과 동일하면 User를 삭제
				System.out.print("이름 입력: ");
				String name = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().contains(name)) {
						System.out.println(list.get(i).getName() + "의 정보를 삭제했습니다");
						list.remove(i);
					}
				}
				
				
			} else if(menu == 5) {
				//종료
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			
		
		}
		
		
		
		
		
	}

}















