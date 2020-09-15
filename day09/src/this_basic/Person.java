package this_basic;

//부모클래스
public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	
	Person(String name){
		this(name, 1); //this() = 나를 지칭
//		this.name = name;
//		this.age = 1;
	}
	
	//기본 생성자
	Person(){
		this("이름미정", 1);
//		this.name = "이름미정";
//		this.age = 1;
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
	
}


































