package this_basic;

public class Student extends Person{
	
	//자식은 부모의 기능을 모두 사용 가능하다.
	String studentId;
	
	//name, age, studentId를 받아서 초기화 하는 생성자를 this키워드를 사용해 생성
	public Student(String name, int age, String studendtId) {
//		super();
//		this.name = name;
//		this.age = age;
		super(name, age); //결국 super부모클래스이니 요렇게 해도 됨
		this.studentId = studendtId;
	}
	
	public Student(){}
	
	
	
	//info메서드 오버라이딩(학번 정보 포함해서 리턴)
	String info() {
//		return "이름: " + name + ", 나이: " + age + " ,학번: " + studentId;
		return super.info()+ " ,학번: " + studentId;
		
	}
	
	
	
	
}
