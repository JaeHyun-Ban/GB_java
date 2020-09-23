package quiz20;

public class StringQuiz03 {
	
	//quiz15번
	public static void main(String[] args) {
		
		//짝수 회문
		String str1 = "다가가다가 가다가 가다";
		
		//홀수 회문
		String str2 = "나 되면 가만히만 가면 되나";
		
//		//짧고 좋은 코딩 - 선생님
//		System.out.println(Palindrome00.palindromeCheck(str1));
//		System.out.println("---------------------------");
//		System.out.println(Palindrome00.palindromeCheck(str2));
		
//		System.out.println("===============================");
		
		System.out.println(Palindrome.palindromeCheck(str1));
		System.out.println(Palindrome.palindromeCheck(str2));
		
		
		
		
	}
	
}
