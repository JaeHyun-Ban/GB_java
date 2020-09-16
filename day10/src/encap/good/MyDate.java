package encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때는 클래스 설계자가 미리 만들어 놓은
	 * getter / setter를 이용한다.
	 * 
	 * setter메서드 선언
	 * 1. 은닉변수에 값을 저장하기 위한 메서드
	 * 2. 접근제어자를 public으로 선언하고 이름은(set + 멤버변수)으로 지정
	 */
	public void setYear(int year) {
		
		if(year < 1 || year > 2020) {
			System.out.println("잘못된 값 입력입니다.");
		}else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입니다.");
		}else {
			this.month = month;
		}
	}
	
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입니다.");
		}else {
			this.day = day;
		}
	}
	
	public void setSsn(String ssn) {
		if(ssn.length() == 13) {
			this.ssn = ssn;
		}else {
			System.out.println("잘못된 입력 입니다!");
		}
	}
	
	/*
	 * getter메서드 선언
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. setter와 마찬가지로 접근제어자는 public선언하고 
	 * 이름은 get + 멤버변수명으로 지정한다.
	 */
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	
	/*
	 * 1. month, day, ssn에 getter, setter를 생성
	 * month - 1~12월 저장가능
	 * day - 1~31일 저장가능
	 * ssn - 13자리만 저장 가능 length()
	 * 
	 */
	
	
	
	
}



































