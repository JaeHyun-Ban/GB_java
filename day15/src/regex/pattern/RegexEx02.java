package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {

		/*
		 * # 주요 정규표현 형식 
		 * \\d - 숫자를 찾음 
		 * \\d+ - 숫자 여러개 찾음 
		 * \\w - 문자를 찾음 (영어)
		 * \\w+ - 문자 여러개 찾음(영어)
		 * \\W - 문자를 찾음(한글)
		 * 
		 * \\d{3} - 숫자 3개
		 * \\d{3,4} - 숫자 3개 or 4개
		 *
		 *[0-9] - 0-9까지 문자 1개 찾음
		 *[A-Z] - A-Z까지 문자 1개 찾음
		 *[a-z] - a-z까지 문자 1개 찾음
		 *[가-힣] - 한글 1개 찾음
		 *
		 *[가-힣]+ - 한글 1개 이상 여러개
		 *[가-힣]* - 한글 0개 이상 여러개 
		 *[가-힣]? - 한글 0 or 1개
		 *
		 * [A-Za-z] - 알파벳 중 1개
		 * 
		 * 그리고 특수문자  ?,@,# 는 그 자체를 의미함
		 */
		
		String info = "30세/서울시 강남구/02-123-4566/010/1234/4567/kkk@naver.com";
		
		//1. 전화번호 형식
		//패턴 먼저 생성
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(pattern); //패턴타입에 패턴정보 입력
		Matcher m = p.matcher(info);//정보를 패턴과 매칭
		
		//m.find() , m.start(), m.end(), m.group()
		while(m.find()) {//info문자열에서 정규표현식에 패턴에 매칭되면 true, 아니면 false를 리턴
			
			System.out.println("찾은값: " + m.group());
			System.out.println("시작인덱스: " + m.start());
			System.out.println("끝인덱스: " + m.end()); 
		}
		System.out.println("----------------------------------------------");
		
		
		//2. 메일 형식
		String pattern2 = "\\w+@\\w+.\\w+";//문자여러개@문자여러개.문자여러개
		
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(info);
		
		while(m2.find()) {
			System.out.println("시작인덱스: " + m2.start());
			System.out.println("찾은값: " + m2.group());
			System.out.println("끝인덱스: " +m2.end());
			
		}
		
		//맨날쓰면 쉽지만 안그래서 까먹는 것 뿐이다.
		//중요한것만 기억하고 적용할 일이 있다면 찾아보자구
		
		
		

	}
}












































