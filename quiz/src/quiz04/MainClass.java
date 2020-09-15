package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior wa = new Warrior("강한친구대한전사", 1000, 500);
		wa.info();
		wa.bash();
		
		System.out.println("----------------");
		
		Wizard wi = new Wizard("구르미그린달빛", 500, 1000);
		wi.info();
		wi.iceArrow();
		
		
	}
}
