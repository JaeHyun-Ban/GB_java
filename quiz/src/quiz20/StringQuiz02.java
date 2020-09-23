package quiz20;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 주민번호 13자리를 입력받습니다.
		 * 2. 주민번호는 -를 포함해서 받을 수 있습니다.
		 * 3. 13자리가 아니라면 다시 입력받습니다.
		 * 4. 남자인지 여자인지 구분해서 출력해주면 됩니다.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주민번호를 입력하세요");
			System.out.print("> ");
			String ssn = sc.next();
			
			ssn = ssn.replace("-", "");
			
			
			if(ssn.length() != 13) {
				System.out.println("주민번호는 13자리 입니다.\n");
			}else {
				if(ssn.substring(6, 7).equals("1")) {
					System.out.println("남성입니다");
					break;
				}else {
					System.out.println("여성입니다");
					break;
				}
					
				
			}
			
			
		} //while
		
		
		
	}
}

























































