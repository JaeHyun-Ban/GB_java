package poly.basic3;

public class House {
	
//	//다형성이 없다면??? - 배열
//	private Student[] students;
//	private Teacher[] teachers;
//	private Employee[] employees;
//	
//	//배열 관리용 변수
//	private int count1 = 0;
//	
//	public House() {
//		students = new Student[100];
//		teachers = new Teacher[100];
//		employees = new Employee[100];
//	}
//	
//	
//	public void setIn(Student s) {
//		students[count1] = s;
//		count1++;
//	}
	
	
	//다형성이 있다면??? - 배열
	/*
	 * 1. 300개 크기의 Person배열 생성
	 * 2. count변수 선언
	 * 3. setIn() 모든 자식클래스를 받아서 Person배열에 저장되도록 선언
	 * 4. 메인클래스에서 6명의 Person을 전달
	 */
	
	private Person[] p;
	private Person[] students;
	private Person[] teachers;
	private Person[] employees;
	
	private int count = 0; //2
	
	public House() {
		p = new Person[300]; //1
		students = new Student[300];
		teachers = new Teacher[300];
		employees = new Employee[300];
		
	}
	
	//3
	public void setIn(Student s, Teacher t, Employee e) {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


































