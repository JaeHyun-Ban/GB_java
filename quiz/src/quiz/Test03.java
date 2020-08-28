package quiz;

import java.util.Scanner;

public class Test03 {
	
	/*
	 1. 스캐너를 통해서 2개의 정수를 입력 받습니다.
	 2. 입력받은 값이 단순히 정수라면 두 값의 합을 출력하고 반복문을 종료
	 3. 입력받은 값이 문자열이라면 "정수로만 입력해주세요" 를 출력한 후에 다시 입력받습니다.
	 
	 */
	
	//?????????????????????????????????????????
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 입력: ");
		String num = sc.nextLine();
		if(!(0 <= Integer.parseInt(num)%10 && Integer.parseInt(num)%10 < 10)) {
			System.out.println("정수를 입력하세요!");
		}else {
			sum += Integer.parseInt(num);
		}
		
		System.out.println("숫자를 입력: ");
		String num2 = sc.nextLine();
		if(!(0 < Integer.parseInt(num2)%10 && Integer.parseInt(num2)%10 < 10)) {
			System.out.println("정수를 입력하세요!");
		}else {
			sum += Integer.parseInt(num2);
		}
		
		
		
		System.out.println(sum);
		
		
	}
}




















