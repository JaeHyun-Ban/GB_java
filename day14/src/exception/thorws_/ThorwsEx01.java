package exception.thorws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThorwsEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * throws
		 * 메서드나, 생성자에서 발생되는 예외를 떠넘기는 코드가 throw입니다.
		 * throws구문이 붙어있는 메서드, 생성자를 호출할 때는, 예외처리를 대신 진행해야합니다.
		 * 즉, 예외처리를 강요할 때 사용합니다.
		 */
		try {
			//thorws가 존재하면 예외처리 문장 안에 생성해 주어야 한다.
			greet(10);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		
		//대표적인 throws메서드
		try {
			Class.forName("123"); //ClassNotFound예외를 핸들링
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		
		//대표적인 throws생성자
		try {
			new FileInputStream("#$%#$%");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
		
	}
	
	private static String[] greeting = {"헬로", "안녕", "니하오"};
	
	public static void greet(int index) throws Exception{ //예외를 던져서 넘겨준다.
		System.out.println(greeting[index]);
	}
	
}






















































