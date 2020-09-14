package day08;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone black = new Phone();	//이 상태에서 실행 하면 생성자 호출 문구가 작성 된다.
		black.info();
		
		//추가 생성자
		Phone white = new Phone("하얀색");
		white.info();
	
		
		Phone red = new Phone("빨강", 500000);
		red.info();
		
		
		//Phone에 모든 멤버변수를 받는 생성자를 생성
		//greem, 1000000, 아이폰 으로 객체를 생성.
		//생성자는 마치 단축키로 명령어를 새로생성할 때 자동으로 나오는 예시 같다
//		Phone green = new Phone(pColor, pPrice, pModel)
		Phone iphone = new Phone("green", 1000000, "아이폰");
		iphone.info();
		
		
		
		
	
	}
	
	
	
	
}
