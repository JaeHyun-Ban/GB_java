package quiz12;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Mouse mouse;
	private Monitor monitor;
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.key = new KeyBoard(); //key말고 this.key로 써주자
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	//모든 멤버변수를 받는 생성자
	public Computer(KeyBoard key, Mouse mouse, Monitor monitor) {
		super();
		this.key = key;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void info() {
		System.out.println("--------컴퓨터 정보--------");
		this.key.info();
		this.mouse.info();
		this.monitor.info();
	}
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKey() {
		return key;
	}
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	public Mouse getmouse() {
		return mouse;
	}
	public void setmouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Monitor getmonitor() {
		return monitor;
	}
	public void setmonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
	
	
	
	
	
}





















