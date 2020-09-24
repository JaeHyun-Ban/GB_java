package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		
		Date date = new Date();
		
		//영어로된 날짜를 문자열 형식으로 출력
		System.out.println(date.toString());
		//>이 날짜에서 원하는 것만 빼서 변형해 사용한다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 입니다");
		//>포맷양식을 설정해준다
		
		//양식에 맞게 date를 집어 넣고 String으로 리턴
		String now = sdf.format(date);
		System.out.println(now);
		
		System.out.println("------------------------------");
		
		sdf.applyPattern("yyyy/MM/dd"); //패턴형식 변경
		String now2 = sdf.format(date);
		System.out.println(now2);
		
		System.out.println("------------------------------");
		
		sdf.applyPattern("오늘은 E요일입니다. YYYY년, ww월, E일");
		String now3 = sdf.format(date);
		System.out.println(now3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






































