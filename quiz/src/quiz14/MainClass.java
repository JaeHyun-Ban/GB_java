package quiz14;

public class MainClass {
	
	public static void main(String[] args) {
		MyCart mc = new MyCart(5000);
		
		Product tv = new Tv();
		Product radio = new Radio();
		Product computer = new Computer();
		
//		Computer computer = new Computer(); //부모타입에 포함이 되어있어서 가능함
		
		//buy할 때 직접불러서 사용해도 되고, 앞으로 자주보게 될 것이라고 한다.
//		for(int i = 0; i < 10; i++) {
//			mc.buy(new Computer());
//		}
		
		mc.buy(tv);
		mc.buy(computer);
		mc.buy(tv);
		mc.buy(radio);
		
		mc.info();
		
		
		
		
	}

}



































