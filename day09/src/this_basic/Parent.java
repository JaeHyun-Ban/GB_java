package this_basic;

public class Parent {
	
	String father;
	String mother;


	//기본생성자가 없는경우
	public Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}
	
	public Parent() {
		this("김철수", "김영희");
	}
	
	
	void info() {
		System.out.println("아버지:" + this.father + "어머니:" + this.mother);
	}
	
	
	
	
	
	
	
}
































































