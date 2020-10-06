package quiz28;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 가격형식만 찾아서 순서대로 출력 4,500원 6000원.....
		 */
		
		String str = "헠4,500원 헿~1,200원 엏? 6000원 윀 120000원";
		
		//패턴 만들기
//		String pattern = "[0-9]+,*[0-9]+원";//*뒤에 붙는건 필수
//		String pattern = "\\d+,*\\d+원";
		
		String pattern = "\\d+,\\d+원|\\d+원";
	
		Pattern p = Pattern.compile(pattern);//패턴 형식을 입력
		Matcher m = p.matcher(str);//형식으로 매칭
		
	
		
		while(m.find()) {
			System.out.println("찾은값: " + m.group());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}






































































