package ex11;

public class MainClass {
	
	public static void main(String[] args) {
		
		House h = new House();
		Person kim = new Person("김철수", 30);
		Person hong = new Person("홍길동", 30);
		
		
		h.getIn(hong);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.getIn(kim);
		h.print();
	}
}
