package quiz11;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass00 {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		
		User u = new User();
		u.setName("홍길동");
		u.setRrn(123123);
		u.setAge(20);
		System.out.println("name: " + u.getName());
		System.out.println("rrn: " + u.getRrn());	
		System.out.println("age: " + u.getAge());
	
		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		User[] uarr = new User[2];
		User u2 = new User("김길동", 456456, 30);
		
		uarr[0] = u;
		uarr[1] = u2;
		
//		for(int i = 0; i < uarr.length; i++) {
//			System.out.println(uarr[i].getName());
//			System.out.println(uarr[i].getRrn());
//			System.out.println(uarr[i].getAge());
//			System.out.println("-------------------");
//		}
		
		for(User a : uarr) {
			
			System.out.println(a.getName());
			System.out.println(a.getRrn());
			System.out.println(a.getAge());
			System.out.println("---------------------");
		}
		
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		Scanner sc = new Scanner(System.in);
		User[] uarr2 = new User[5];
		
		int count = 0;
		while(count != 5) {
			
			System.out.print("Name입력: ");
			String name = sc.next();
			System.out.print("Rrn입력: ");
			int rrn = sc.nextInt();
			System.out.print("Age입력: ");
			int age = sc.nextInt();
			
			User u3 = new User(name, rrn, age);
			uarr2[count] = u3;
			count++;
			
			System.out.println(Arrays.toString(uarr2));
		}
		
		
		
	}
}
























