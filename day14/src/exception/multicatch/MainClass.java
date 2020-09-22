package exception.multicatch;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * main메서드에 실행 매개값을 주는 방법,
		 * - run탭 -> run configuration -> arguments -> ${string_prompt}
		 */
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			//parseInt = int java.lang.Integer.parseInt(String s) throws NumberFormatException
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			//앞으로 이런 메서드가 많겠지만 다 외우거나 알 수 없으니
			//이 메서드를 직접 한번 써보는게 중요하다(반환유형...형태, 사용법을 익혀라)
			
			System.out.println(num1 + num2);
			
			//or로 예외처리 연결 가능 
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) { //예외의 종류별로 따져가며 확인 할 수 있다.
			System.out.println("매개값은 반드시 2개를 전달해 주세요!");
		} catch (NumberFormatException e) {
			System.out.println("매개값은 반드시 숫자 형태로 전달하세요!");
		}catch (Exception e) {//ctrl + t로 상속확인 가능하다, ctrl + i = 단어 선택해줄
			//https://blog.outsider.ne.kr/243 -> 단축키
			System.out.println("기타 예외 입니다."); //모든 예외를 처리 가능
		}
		
		
		
		
		
		
		
		
		
	}
}
