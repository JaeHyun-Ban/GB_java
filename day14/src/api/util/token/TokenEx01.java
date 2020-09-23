package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	
	public static void main(String[] args) {
		
		//StringTokenizer 클래스 - 특정문자 기준으로 문자열을 잘라서 사용.
		String str1 = "오늘 날씨는 맑고, 매우 시원합니다";
		String str2 = "2020/09/23";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		System.out.println(token1.countTokens());
		//>토큰 사용전에 몇개의 토큰이 있는지 확인
		System.out.println();
		
		//오늘 / 날씨는 / 맑고, / 매우 / 시원합니다 
		//이 처럼 토큰을 구성한다.
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
		
		//남은 토큰이 있는지 확인 - boolean type
//		System.out.println(token1.hasMoreTokens());
		
		//토큰 O: true, 토큰 X: false
		while(token1.hasMoreTokens()) {
			//토큰이 있다면, 다음 토큰으로..
			System.out.println(token1.nextToken());
			//>토큰이 없을 때까지 쭉쭉 뽑아낸다.
			//>>한번 접근하면 뒤로 되돌릴수 없음
		}
		
		System.out.println("-------------------------------");
		
		
		// '/'를 기준으로 자름
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		
		
		
	}
}




































