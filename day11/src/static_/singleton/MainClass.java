package static_.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
		
		
		//static으로 생성한 get이라서 여러번 불려나가도 
		// 한개의 똑같은 객체를 이용할 뿐이다.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
//		Calendar cal = Calendar.getInstance();
//		Connection con = DriverManager.getConnection(url);
	
//		System.out.println(s1.name);
		
		System.out.println(s1 == s2);
	
	}
}



















