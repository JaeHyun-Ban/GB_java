package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass200 {

	public static void main(String[] args) throws Exception {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다. 
		 * 입력한 값이 1에서 100까지의 값이 아니라면
		 * 예외처리 구문으로 넘기고 다시 입력받도록 처리합니다. 
		 * -----------------요 위까지 try로 구문 작성 
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에 다시 입력받도록 처리합니다. 
		 * 단, 카운트는 처리 됩니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */
		int ran = (int) (Math.random() * 100) + 1;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("정답: " + ran);
			try {

				System.out.print("정답 입력: ");
				String n = sc.nextLine();
				int num = Integer.parseInt(n);
				count++;
				
				if (num < 0 || num > 100) {
					throw new Exception("1~100사이의의 수를 입력하시오\n");
					
				} else if (num == ran) {
					System.out.println("\n정답입니다!");
					System.out.println("도전횟수: " + count + "회");
					sc.close();
					break;
				} else {
					System.out.println("틀렷습니다!\n");
				}
				//예외처리하는 기능을 잘 이용해서 생성할 것
				//java.lang.execption -> 아래에 많은 종류의 예외처리기능들이 있다.
			}catch (NumberFormatException e) {
					System.out.println("반드시 숫자만 입력하세요!\n");
//			}catch (InputMismatchException e) {
//				System.out.println("반드시 숫자만 입력해 주세요");
//				//https://best421.tistory.com/10
//				//InputMismatchException = 정수로 입력해야하는데 문자를 입력한 경우 예외발생
			}
			catch (Exception e) {
				//throw new Exception에서 작성한 메세지를 가져와 읽어준다.
				System.out.println(e.getMessage());
			
		
			}
		}

	}
}


























