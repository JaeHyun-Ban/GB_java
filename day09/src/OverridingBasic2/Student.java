package OverridingBasic2;

public class Student extends Person{
	
	//자식은 부모의 기능을 모두 사용 가능하다.
	String studentId;
	
	//info메서드 오버라이딩(학번 정보 포함해서 리턴)
	String info() {
		return "이름: " + name + ", 나이: " + age + " ,학번: " + studentId;
	}
	
	
	
	
}
