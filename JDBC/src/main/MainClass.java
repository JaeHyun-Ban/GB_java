package main;

import java.util.Scanner;

import member.dao.InterMember;
import member.dao.MemberDAO;
import member.dao.MemberVO;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//프로그램들 '중간'에 위치해 연결과 작업 처리를 도와주는 인터페이스
		InterMember dao = new MemberDAO(); 
		
		while(true) {
			
			System.out.println("1.추가, 2.조회, 3.삭제");
			String menu = sc.next();
			
			switch (menu) {
			case "1":
				
				System.out.print("id> ");
				String id = sc.next();
				
				System.out.print("pw> ");
				String pw = sc.next();
				
				System.out.print("name> ");
				String name = sc.next();
				
				System.out.print("email> ");
				String email = sc.next();
				
				//insertMember실행
				MemberVO vo = new MemberVO(id, pw, name, email);
				int result = dao.insertMember(vo);
				
//				int result = dao.insertMember(id, pw, name, email);
				//>memberDAO로 이동해서 처리하게 되는데 이걸 '모듈화'라고 한다
				
				if(result == 1) {
					System.out.println("DB저장 성공");
				}else {
					System.out.println("DB저장 실패");
				}
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;

			default:
				break;
			}
			
			
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
