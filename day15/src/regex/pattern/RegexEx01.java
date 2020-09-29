package regex.pattern;

public class RegexEx01 {
	
	public static void main(String[] args) {
		
		
		//전화번호 형식만 찾아서 ***-****-****
		String info = "홍질자|30세|서울시 강남구|010-9999-1234";
		
		//`\`는 표현하고 싶다면 `\\`두개를 사용해라
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		//매개변수에 regex가 들어가있다면 정규표현 패턴을 적용할 수 있다는 뜻이다.
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
