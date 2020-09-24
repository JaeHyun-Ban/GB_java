package api.util.token;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {

		/*
		 * 1. nextLine() 문장을 받는다. 
		 * 2. 토크나이저를 이용해 공백 기준으로 분리 
		 * 3. 토큰 갯수를 확인 
		 * 4. 분리완 토큰에 숫자를붙여서 세로형태로 출력. 
		 * - 1. 안녕 
		 * - 2. 하세요. 
		 * - 3. 오늘은 
		 * 5. 분리된 문자열을 배열에 저장
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("문장을 입력하세요");
		System.out.print("> ");
		String s1 = sc.nextLine();// 엔터를 포함해 받는다

		// 1. 2.
		StringTokenizer token1 = new StringTokenizer(s1, " "); //공백기준 토큰 분리

		// 3. 갯수
		int tNum = token1.countTokens();
		String[] arr = new String[tNum];

//		System.out.println(tNum);
//		System.out.println(token1.nextToken());

		// 4.
		//토큰을 이용해 한번에 출력하고싶다면 String에 저장해서 사용하면 된다.
		int count = 0;
		while (token1.hasMoreTokens()) {
			String word = token1.nextToken();
			arr[count] = word;
			System.out.println(++count + ". "+ word);
		}
		
		System.out.println(Arrays.toString(arr));


		// 안녕하세요! 잘부탁드려요, 반가워요/

	}
}

































