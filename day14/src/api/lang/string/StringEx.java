package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {

//		String str = new String("hello world");

//		char[] arr = {'h', 'e', 'l' ,'l', 'o'};
//		String str = new String(arr);
//		System.out.println(str);

		// charAt() - 문자열 인덱스 번호 자르기
		String str = "안녕하세요";
		System.out.println(str.charAt(0));
		char c = str.charAt(0);
		System.out.println(c);

		// indexof() - 문자열을 찾아서 인덱스를 반환(앞에서 부터 찾음)
		int n = str.indexOf("안");
		System.out.println(n);
		System.out.println("--------------------------------------");

		// lastIndexof() - 문자열을 찾아서 인덱스 반환(뒤에서 부터 찾음)
		int n2 = str.lastIndexOf("안");
		System.out.println(n2);
		System.out.println("--------------------------------------");

		// length() - 길이
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("--------------------------------------");

		// replace - 특정 문자열 변경
		str.replace("세", "새");
		String str2 = "자바의 유래를 아시나요? 자바는 커피집 이름입니다";

		String str3 = str2.replace("자바", "Java");
		System.out.println(str2);
		System.out.println(str3);
		str3 = str2.replace(" ", ""); // 공백 제거하기
		System.out.println(str3);
		System.out.println("--------------------------------------");

		str3 = str2.replace("자바", "Java").replace(" ", ""); // 여러개를 동시에 바꾸기
		System.out.println(str3);
		System.out.println("--------------------------------------");

		// substring() - 문자열 자르기
		String str4 = "123123-4564564";
		String a1 = str4.substring(7); // 매개갮을 하나 주면 앞 문자열의 제거
		System.out.println(a1);

		String a2 = str4.substring(7, str4.length());// 매개값을 2개 주면 문자열을 추출
		System.out.println(a2);
		System.out.println("--------------------------------------");

		// toUpperCase() - 대문자로 변경
		// toLowerCsee() - 소문자로 변경
		String str5 = "hello jack";
		str5 = str5.toUpperCase();
		System.out.println(str5);
		System.out.println("--------------------------------------");

		// trim() - 앞 뒤의 공백 제거
		String str6 = "       홍길동     ";
		str6 = str6.trim();
		System.out.println(str6);
		System.out.println("--------------------------------------");
		
		
		// valueOf() - 기본형데이터타입을 문자열로 변경함 
		//static타입(String.valueOf 가능)
		System.out.println(1 + 1);
		System.out.println(String.valueOf(1) + 1); //11
		System.out.println("--------------------------------------");
		
		
		//split() - 문자열 자르기(String[]로 잘라 넣어준다)
		String str7 = "010-1234-5678";
		String[] arr1 = str7.split("-");
		System.out.println(Arrays.toString(arr1));
		//배열의 최대값 2개
		String[] arr2 = str7.split("-", 2); 
		System.out.println(Arrays.toString(arr2));
		
		
		String q1 = "123456-1234567";
		System.out.println(q1.length());
	}
}

































