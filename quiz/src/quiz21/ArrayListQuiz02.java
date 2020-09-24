package quiz21;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz02 {
	
	/*
	 * 1. User클래스는 은닉된 클래스로 변수로 name, age를 선언하고 생성
	 * 
	 * 2. User클래스를 저장할 수 있는 List생성 선언
	 * 
	 * 3. User객체 2개를 생성해서 리스트에 추가하세요.
	 * 
	 * 4. list에 저장된 모든 name, age를 반복문으로 출력
	 * 
	 * 5. list에 홍길자가 있다면 홍길자의 이름, 나이만 출력
	 * 
	 * 6. list에 홍길동이 있다면 홍길동User객체를 삭체
	 * 
	 */
	
	public static void main(String[] args) {
		
		//2.
		List<User> list = new ArrayList<>();
		
		
		//3.
		User u1 = new User("홍길동", 20);
		User u2 = new User("홍길자", 21);
		list.add(u1);
		list.add(u2);
		
		//4.
		System.out.println("----------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("이름: " + list.get(i).getName() + ", 나이: " + list.get(i).getAge());
		}
		
		
		//5.
		System.out.println("-----------------");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().contains("홍길자")){
				System.out.println("이름: " + list.get(i).getName() + ", 나이: " + list.get(i).getAge());
			}
		}
		
		//5. 향상 for문
		for(User u : list) {
			if(u.getName().equals("홍길자")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}
		}
		
		
		
		//6.
		System.out.println("----------------");
		for(int i = 0; i < list.size(); i++) {
			
			//순 ㅡ 서
//			User u = list.get(i);
//			String name = u.getName();
//			if(name.equals("홍길동")) {
//				
//			}
			
		if(list.get(i).getName().contains("홍길동")){
			list.remove(i);
			System.out.println(list.get(i).getName() + "은 삭제되었습니다.");
		}
		System.out.println("list의 남은 정보 ");
		for(int j = 0; j < list.size(); j++) {
			System.out.println("이름: " + list.get(j).getName() + ", 나이: " + list.get(j).getAge());
		}
		
	}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
