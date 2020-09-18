package abs.bad;

public class HeadStore { //부모클래스(본점)
	
	//부모클래스에 명시된 메서드는 반드시 자식클래스에서 각각 오버라이딩 해야합니다.
	public void apple() {
		System.out.println("서울 지점에 사과는 500원");	
	}
	
	public void banana() {
		System.out.println("서울 지점에 바나나 700원");
	}
	
	public void melon() {
		System.out.println("서울 지점에 멜론은 800원");
	}
	
	//프로그래머가 실수로 메서드 재정의를 빼먹었다면?
	public void orange() {
		System.out.println("각 지점에서 가격을 제시하세요");
	}
	
	
	
	
	
}
