package quiz15;

public class MainClass {
	
	public static void main(String[] args) {
		
		Marine m = new Marine();

		Tank t = new Tank();

		
		DropShip d = new DropShip();
		
		
//		m.move(3, 7);
		m.location();
		
		System.out.println("============================");
		
//		t.move(4, 5);
		t.location();
		
		System.out.println("============================");
		
		
		d.ride(m);
		d.ride(m);
		d.ride(m);
		d.ride(t);
		d.ride(m);
		
		d.ride(m);
		
		d.move(7, 4);//여기서 이동거리 출력됨
		
		d.location();
		m.location();
		t.location();
		
		System.out.println("============================");
		

		
		
		
		
		
		
		
		
	}
}
