package quiz16;

public class MainClass {

	public static void main(String[] args) {

//		Circle c = new Circle("원원원", 5);
		Shape c = new Circle("원원원", 5);
		System.out.println(c.getName());
		System.out.println("넓이: " + c.getArea());
		
		System.out.println("----------------------------");
		
//		Rect r = new Rect("정사각형", 8);
		Shape r = new Rect("정사각형", 8);
		System.out.println(r.getName());
		System.out.println("넓이: " + r.getArea());
		
		

	}

}
