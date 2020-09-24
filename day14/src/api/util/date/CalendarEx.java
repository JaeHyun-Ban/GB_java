package api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		//Calendar는 컴퓨터 운영체제에 있는 달력관련 기능을 사용
//		Calendar cal = new Calendar(); 
		//> new로 생성 할 수 없다.
		
		//Calendar는 추상클래스이다.
		Calendar cal = Calendar.getInstance();
		
		//get()에 필드값을 넣어준다.
		//현재 년도
		int year = cal.get(Calendar.YEAR);//get은 calendar의 필드값을 받는다.
		System.out.println(year);
		
		//현재 month
		int month = cal.get(Calendar.MONTH) + 1; //MONTH는 0부터 시작한다,
		System.out.println(month);
		
		//현재 date
		int date =cal.get(Calendar.DATE);
		System.out.println(date);
		
		
		int hour = cal.get(Calendar.HOUR);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월  %d일 %d시 %d분 %d초", year, month, date, hour, minute, second);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}















































