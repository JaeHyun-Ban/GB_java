package exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.print("> ");
				int num = sc.nextInt(); //엔터값을 포함하지 않고 값을 받는다.
				
				System.out.println("입력결과> " + num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				//무한 루프에 빠지는 이유는
				//숫자 입력 + '엔터' 에 엔터값이 또 있기때문이다
				
				sc.nextLine();//따라서 nextline()을 사용해 엔터값을 제거하자
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
