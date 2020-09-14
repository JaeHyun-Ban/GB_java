package day08;

public class Variable {
	
	//멤버 변수: 초기화 하지 않으면 자동으로 초기화
	int a; 
//	a = 10; //값을 선언 하는 곳 일 뿐 작성할 수 없다.
	
	
	void printNum(int c) {
		
		int b = 1;
		System.out.println("멤버변수: " + a);		//자동 초기화 되어있어 사용 가능
		System.out.println("지역변수: " + b);		//초기화가 되어있지 않음
		System.out.println("매개변수: " + c);		

		
		
	}
	
	
	
	
	
	
}
