package quiz19;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수를 2개 받는다.  
		 * 2. 입력한 값이 정수라면 합계를 반환하면 된다. >>> ????
		 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메세지를 전달해주면 된다. 
		 * 4. scan.close() 또한 적절하게 처리해주세요.
		 */
//		Scanner sc = new Scanner(System.in);
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			//받고싶은 식을 생성 + try예외 처리
			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			System.out.print("정수2: ");
			int num2 = sc.nextInt();
			
			return num1 + num2;
			
		} catch (Exception e) {
			throw new Exception("정수만 입력하세요");
		}finally {
			sc.close();
		}

	}

}






















