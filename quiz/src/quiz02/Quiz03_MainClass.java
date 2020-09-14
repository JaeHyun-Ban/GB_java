package quiz02;

public class Quiz03_MainClass {
	
	public static void main(String[] args) {
		
		Quiz03_Person p1 = new Quiz03_Person("홍길동", 20, 100);
		p1.info();
		
		
		System.out.println("-------------------------------");
		
		Quiz03_Person p2 = new Quiz03_Person();
		p2.age = 40;
		p2.name = "김길동";
		p2.tall = 170;
		
		p2.info();
		
		
		
	}
}
