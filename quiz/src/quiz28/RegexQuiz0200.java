package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz0200 {

	public static void main(String[] args) {

		// 강사님

		// https://m.blog.naver.com/PostView.nhn?blogId=hipchinja&logNo=220610997702&proxyReferer=https:%2F%2Fwww.google.com%2F
		// 정규표현식 퀴즈02
		// 상품번호, GS25, (도시락명), 가격 으로 분리해서 출력할 것

		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-33333333 MINISTOP(제육볶음) 5,500";

		String pattern1 = "\\d{6}-\\d{7}"; //제품 코드
		String pattern2 = "[A-Z]+[0-9]*"; //편의점 이름
		String pattern3 = "\\([가-힣]+\\)";//제품명(소괄호 포함)
		String pattern4 = "[0-9]+,[0-9]+원?";//가격 - 숫자여러개,숫자여러개 원(있을수도 있고 없을수도 있고)
		
//		Matcher c = Pattern.compile(pattern2).matcher(str3);
		
		String[] arr = {str, str2, str3};
		int i = 0;
		while(i < arr.length) {
			
			//하나의 문자에 4개의 패턴을 사용
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);
			//>i번 돌릴 때 4가지 패턴을 다 검사 한다.
			
			//검사 후 출력
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println("바코드: " + m1.group());
				System.out.println("편의점 이름: " + m2.group());
				System.out.println("제품명: " + m3.group());
				System.out.println("가격: " + m4.group());
				System.out.println();
			}
			i++;
				
		}

	}

}






































