package inter.basic3;

public class Samsung implements Printed{

	@Override
	public void turnOn() {
		System.out.println("Samsung Galaxy On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung Galaxy Off");
		
	}

	@Override
	public void print(String document) {
		System.out.println("-------Galaxy Document-------");
		System.out.println("DocumentInfo: " + document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("-------Galaxy Document-------");
		System.out.println("Color: " + color);
		System.out.println("DocumentInfo: " + document);
		
	}

	@Override
	public int copy(int n) {
		System.out.println("-------Galaxy Document-------");
		for(int i = 0; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		return n;
	}

	
}

































