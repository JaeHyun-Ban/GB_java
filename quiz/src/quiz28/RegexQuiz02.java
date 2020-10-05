package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		//https://m.blog.naver.com/PostView.nhn?blogId=hipchinja&logNo=220610997702&proxyReferer=https:%2F%2Fwww.google.com%2F
		//정규표현식 퀴즈02
		//상품번호, GS25, (도시락명), 가격 으로 분리해서 출력할 것
		
		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-33333333 MINISTOP(제육볶음) 5,500";
		
		//배열로 생성하는 방법도 괜찮아 보이네
		
		//한번에 검사용
		String total = str + str2 + str3;
		
		//상품번호 패턴
		String pattern = "\\d{6}-\\d{7}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(total);
		
		//편의점 이름 패턴
		String pattern2 = "[A-Za-z]+\\d+|[A-Za-z]+"; //영어만+숫자 | 영어만
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(total);
		
		//도시락 이름 패턴
		String pattern3 = "\\(\\W+\\)";
		Pattern p3 = Pattern.compile(pattern3);
		Matcher m3 = p3.matcher(total);
		
		//가격 패턴 
		String pattern4 = "\\d,\\d+원|\\d,\\d+";
		Pattern p4 = Pattern.compile(pattern4);
		Matcher m4 = p4.matcher(total);
		
		
		//모든 조건을 만족시켯다면
		while(m.find() && m2.find() && m3.find() && m4.find()) {
			System.out.println(m.group() + ", "
							+ m2.group() + ", "
							+ m3.group() + ", "
							+ m4.group());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}


















































