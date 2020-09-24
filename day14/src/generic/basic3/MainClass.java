package generic.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//ITBank안에 있는 두가지 메서드를 사용.
		
		//1. student타입 객체 생성 
		//> 값을 넣고
//		Student s = new Student("홍길동", 20); //더 짧게 만들기
//		s.setAge(20);
//		s.setName("홍길동");
		
		//Course에 생성한 student타입 객체를 대입
		Course<Student> c = new Course<>();
		c.setNum("1");
		c.setStudent(new Student("홍길동", 20));
		//> 직접 생성해버리기 
		
		
		//매개변수가 제네릭타입인 메서드 실행
		ITBank it = new ITBank();
		it.info(c);
		
		//반환 유형이 제네릭 타입인 메서드를 실행
		Course<Student> c2 = it.get();
		System.out.println("번호: " + c2.getNum() 
						+ ", 이름: " + c2.getStudent().getName() 
						+ ", 나이: " + c2.getStudent().getAge());
		
		
		
		
		
	}
}












































