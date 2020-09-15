package quiz10;

public class MainClass {
	public static void main(String[] args) {
		
		MyCart mc = new MyCart(5000);
		
		mc.add("tv");
		mc.add("tv");
		mc.add("tv");
		mc.add("radio");
		mc.add("radio");
		mc.add("radio");
		mc.add("com");
		mc.add("com");
		mc.add("com");
		
		mc.info();
	}
}
