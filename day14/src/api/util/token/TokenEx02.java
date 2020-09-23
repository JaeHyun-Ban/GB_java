package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {
	public static void main(String[] args) {
		
		String log = "2020.09.23, /bno=30, user=홍길동";
		
		StringTokenizer token1 = new StringTokenizer(log, ",./");
		//'>, . /' 으로 구분짓겟다
		//>>delim: 구분문자(, . / ....)
		
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		
		System.out.println();
		
		StringTokenizer token2 = new StringTokenizer(log, ".,", false);
		//>(검사할 것, "구분문자", 구분문자 토큰여부 판단)
		//>>true면  포함 한 구분문자를 "토큰에 포함한다" - 토큰으로 반환한다.
		//>>false 구분문자를 ""토큰으로 반환하지 않는다"
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		
		
		
		
		
		
	}
}












































