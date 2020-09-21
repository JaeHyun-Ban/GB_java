package quiz15;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println((int)(Math.sqrt(100^2+ 100^2)));
		Marine m = new Marine();
		Marine m1 = new Marine();
		Marine m2= new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();

		Tank t = new Tank();
		Tank t1 = new Tank();

		
		DropShip d = new DropShip();
		
		
//		m.move(3, 7);
		m.location();
		
		System.out.println("============================");
		
//		t.move(4, 5);
		t.location();
		
		System.out.println("============================");
		
		
		d.ride(m);
		d.ride(m1);
		d.ride(m2);
		d.ride(t);
		d.ride(m3);
		
		d.ride(m4);
		
		d.move(7, 4);//여기서 이동거리 출력됨
		
		d.location();
		m.location();
		t.location();
		
		System.out.println("============================");
		

		
		
		
		
		
		
		
		
	}
}
