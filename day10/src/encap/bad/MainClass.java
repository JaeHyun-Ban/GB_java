package encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//멤버변수를 public으로 선언하면 잘못된 값이 저장될 수도 있음
		MyDate me = new MyDate();
		me.year = 2010;
		me.month = 10;
		me.day = 10;
		me.ssn = "211111";
		me.info();
		
		
		
	}
}
