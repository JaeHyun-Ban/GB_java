package quiz02;

public class Quiz03_Person {
	
	//생성자 Quiz03
	//1. 다음은 사람 클래스 입니다.
	//2. 아래와 같이 실행 될 수 있도록 생성자를 만드세요
	
	String name;
	int age;
	int tall;
	
	//프로그래머가 인위적으로 생성자를 만들면(매개변수3개), 
	// 기본생성자를 자동으로 만들어 주지 않는다.
	
	//기본 생성자
	Quiz03_Person(){}
	
	//매개변수 3개를 입력받는 생성자
	Quiz03_Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
		
	}
	
	
	
}
