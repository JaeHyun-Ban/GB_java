package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		Computer com = new Computer();
		
		com.info();
		
		com.getmonitor().info(); //폴더 주소인데 / 대신 .으로 들어가서 꺼내준다고 인지하자
		
	}
}
