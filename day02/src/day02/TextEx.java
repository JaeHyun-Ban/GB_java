package day02;

public class TextEx {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 char
		char c1 = 'A';
		char c2 = 65;				//아스키 코드
		System.out.println(c1);
		System.out.println(c2);
		
		
		//문자를 통일하기 위한 유니코드의 등장 -> 2byte의 크기로 확장하여 65536개를 표현 가능
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';				//\ u를 통해 유니코드로 나타내겟다는 의미
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c3 + c4 + c5);			//숫자 값이 계산되어 나온다
		System.out.println(c3 + "" + c4 + "" + c5); //중간중간에 문자열 빈 공 간을 넣어준다
													//문자열은 아주 강한 타입이라 문자   열 포함 을 해놓으면 문자열로 함께 처리해서 출력 해 준다.
		
		
		//문자열을 저장할 수 있는 String
		String s1 = "hell0~!";
		String s2 = "my name is park";
		System.out.println(s1 + s2);
				
		//문자열과 다른데이터 타입의 연산
		System.out.println(100 + 300);
		System.out.println("100" + 300);	//문자열에서는 다른 타입이 붙으면 -> 결과는 무조건 문자열
		
		System.out.println(100 + 300 + "world");
		System.out.println("hello" + 100 + 300);
		
		//캐릭터와 문자열의 연산방법법
		System.out.println("A" + 100);
		System.out.println('A' + 100);
		
		
		
		
	}
	
	
	
}


























