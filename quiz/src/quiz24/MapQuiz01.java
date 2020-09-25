package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz01 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("kim1234", "kkk1234");
		map.put("lee5678", "lll5678");
		map.put("park4321", "ppp4321");
		
		/*
		 * 1. id를 입력받아서 해당 아이디가 map에 존재하는지 확인
		 * 2. 존재하면 다시한번 비밀번호값과 비교해서, 비밀번호도 일치하면 "로그인성공"을 콘솔에 출력
		 * 비밀번호가 다르다면 "비밀번호가 틀렸습니다" 를 출력
		 * 3. id가 map에 존재하지 않으면 "아이디가 없습니다" 를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id입력: "); 
		String id = sc.next();
		System.out.print("pwd입력: ");
		String pwd = sc.next();
		
		if(map.containsKey(id)) {//id가 있다면
//			String value = map.get(id); //과정 생략
			if(map.get(id).equals(pwd)) {//pwd가 같다면
				System.out.println("로그인 성공!");
			}else {//pwd가 틀리면
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else { //id가 없다면
			System.out.println("아이디가 없습니다.");
		}
		
		
		//다른방법??
		Set<Entry<String, String>> entry = map.entrySet();
		
		
		
		
		
		
		
		
	}
}














































