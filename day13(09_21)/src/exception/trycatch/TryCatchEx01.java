package exception.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		
		try {
			System.out.println(i / j);
			System.out.println("여기 있는 문장은 예외발생 시 실해오디지 않습니다.");
		//catch뒤에는 해당 예외를 처리할 예외의 종류가 들어간다. 
		//Exception은 모든 예외를 처리할 수 있다.
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다!");
		}
		
		
		
		System.out.println(i - j);
		
		
		
		
		
		
		
		
		
		
	}
}
