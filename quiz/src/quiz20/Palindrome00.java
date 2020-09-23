package quiz20;

public class Palindrome00 {
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
	public static String palindromeCheck(String word) {
		
		//공백제거
		word = word.replace(" ", "");
		System.out.println(word);
		//word의 홀수/짝수 나눌 필요는 없다
		
		//for문을 통해 미리 절반으로 나눠두고 시작한다.
		for(int i = 0; i < word.length() / 2; i++) {
			
			//for문 안에서 조건문으로 판단해 주면 2개를 작성할 필요가 없어진다
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
			//0~절반, 맨 뒤~절반 두개를 하나 씩 비교할 때 다르다면 회문이 아니다
				return "회문이 아닙니다";
			}
			
		}
		return "회문 입니다";
		//오.... 짧고 좋다.

	}

}








































