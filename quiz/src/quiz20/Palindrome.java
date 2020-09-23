package quiz20;

public class Palindrome {
	/*
	 * 문제 1. Palindrome클래스에 palindromeCheck()함수는 매개변수로 String 값을 받아
	 * , 회문 여부를 검사하는 static 메서드입니다. 
	 * 2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장. 
	 * 3. ex) 다시 합창 합시다, 다 같은 것은같다, 아 좋다 좋아 등 
	 * 4. 문장은 공백을 포함하여 받을 수 있습니다. 
	 * 5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를리턴합니다. 
	 * 6. 힌트) 함수를 이용하여 공백을 제거하세요. 
	 * 힌트: replace() 문장의 길이의 중간값을 구하세요. 
	 * 중간을 중심으로 앞, 뒤 문자열을 자르세요. 힌트 :substring() 
	 * for문에서 charAt()을 사용해서 반대로 잘라 붙이세요.(or 빌더를 이용 하여 문자를 뒤집어 비교)
	 */
	// 회문여부를 검사
	// 회문: 똑발 읽으나 거꾸로 읽으나 똑같은 단어나 문장
	public static String palindromeCheck(String str) {
		
		/*
		//공백 제거
		str = str.replace(" ", "");
		
		int num = 0; //중간, 구분숫자
		String rev = "";
		  
		//짝수/홀수 확인
		if(str.length()%2 == 0) {//짝수 회문
			
			//중간지점
			num = str.length()/2;
			String s1 = str.substring(0, num);
			String s2 = str.substring(num, str.length());
			System.out.println("기존 문장: " + str);
			System.out.println("s1: " + s1);
			System.out.println("s2: " + s2);
			System.out.println("s2길이: " + s2.length());
			
			//회문 확인 검사
			for(int i = s2.length()-1; i >= 0; i--) {
				char c = s2.charAt(i);
				rev += c;
			}
			System.out.println("s2뒤집기: " + rev);
			
			//회문 확인 검사
			if(s1.equals(rev)) {
				System.out.println(str + "은(는) 짝수 회문입니다.");
			}
	
		}else {//홀수 회문

			//중간지점
			num = str.length()/2 + 1; 
			String s1 = str.substring(0, num-1);
			String s2 = str.substring(num, str.length());
			System.out.println("기존 문장: " + str);
			System.out.println("s1: " + s1);
			System.out.println("s2: " + s2);
			System.out.println("s2길이: " + s2.length());
			
			for(int i = s2.length()-1; i >= 0; i--) {
				char c = s2.charAt(i);
				rev += c;
			}
			System.out.println("s2뒤집기: " + rev);
			
			//회문 확인 검사
			if(s1.equals(rev)) {
				System.out.println(str + "은(는) 홀수 회문입니다.");
			}
			
		}
		*/
		str = str.replace(" ", "");
		//신기하구만
		
		
		
		
		
		return new StringBuffer(str).reverse().toString().equals(str) ? "회문입니다" : "회문이 아닙니다.";
				//buffer변경 , 뒤집고, 문자열로 변경, 원본과 비교
		
	}

}








































