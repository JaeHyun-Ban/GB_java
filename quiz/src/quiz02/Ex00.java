package quiz02;

public class Ex00 {

	/*
	 * 현실에서 찾아볼 수 있는 물건 등을 생각해서 클래스로 표현
	 * 멤버변수 2개이상, 메서드 2개 이상
	 */
	
	
	int apple;
	int banana;
	int kiwi;
	
	Ex00(int napple, int nbanana, int nkiwi){
		apple = napple;
		banana = nbanana;
		kiwi = nkiwi;
	}
	
	void info() {
		System.out.println("사과: " + apple + "개");
		System.out.println("바나나: " + banana + "개");
		System.out.println("키위: " + kiwi + "개");
		
		System.out.println("총 금액: " + total(apple, banana, kiwi) + "원");
	}
	
	
	int total(int apple, int banana, int kiwi) {
		
		return apple*1000 + banana*1500 + kiwi * 500; 
	}
	
	
	
	
}
