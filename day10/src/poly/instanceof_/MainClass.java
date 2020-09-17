package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
//		//다형성이 없다면???
//		Student hong = new Student("홍길동", 20, "123");
//		Student park = new Student("박찬호", 30, "234");
//		Student son = new Student("손흥민", 40, "222");
//		Teacher lee = new Teacher("이승철", 50, "음악");
//		Teacher kim = new Teacher("김유신", 500, "역사");
//		Employee choi = new Employee("최강창민", 20, "건물주");
//		
//		//이런식으로 3가지 타입의 배열을 따로따로 생성해줘야 한다.
//		Student[] arr1 = {hong, park, son};
//		Teacher[] arr2 = {lee, kim};
//		Employee[] arr3 = {choi};
//				
//		for(Student s : arr1) {
//			System.out.println(s.info());
//		}
		
		
		//다형성을 적용한다면??
		Person hong = new Student("홍길동", 20, "123");
		
		Person lee = new Teacher("이승철", 50, "음악");
		
		Person choi = new Employee("최강창민", 20, "건물주");
		
		printInfo(hong);
		
		
	}
	
	public static void printInfo(Person p) {
		
		//instanceof는 클래스 캐스팅 전에, 실제 클래스의 타입을 확인하기 위해 사용한다.
		//2. p의 인스턴스상태를 확인하고 사용한다
		if(p instanceof Teacher) {
			Teacher t = (Teacher)p; //1.hong는 Student 타입이다
			System.out.println(t.info());
			
		}else if(p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.info());
			
		}else if(p instanceof Employee) {
			
			Employee e = (Employee)p;
			System.out.println(e.info());
			
		}else if(p instanceof Person) { //부모타입은 항상 `제일 마지막에 검사한다!`
			
			Person pp = p;
			System.out.println(p.info());
		}
		
		
		
		
		
	}
	
}











































