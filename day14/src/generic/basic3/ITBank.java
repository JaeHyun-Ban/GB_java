package generic.basic3;

public class ITBank {

	//제네릭 클래스를 매개변수로 받을 수 있는 메서드
	public void info(Course<Student> t) { //타입을 명확하게 지정해 준다
		
		String num = t.getNum();
		Student s = t.getStudent();
		
		System.out.println("번호: " + num + ", 이름: "  + s.getName() + ", 나이: " + s.getAge());
		
	}
	
	//제네릭 클래스를 반환유형으로 돌려주는 메서드
	//>/*<V>*/에 반환하고 싶은 유형을 작성한다.
	public /*<V>*/ Course<Student> get(){
		
		Student s = new Student(); //student타입 생성
		s.setAge(10);//나이 저장
		s.setName("홍길동");//이름 저장
		
		Course<Student> c = new Course<>();//student타입을 가지는 c 생성
		c.setNum("1");
		c.setStudent(s);
		
		
		return c;
	}
	
	
}

















































