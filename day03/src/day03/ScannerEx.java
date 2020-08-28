package day03;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner sc = new Scanner(System.in);		
//		System.out.print("당신의 이름을 입력하세요: ");
//		String name = sc.nextLine();
//		System.out.println("당신의 이름은: " + name + "입니다");
		
		
		//2. 스캐너가 가지고있는 입력기능을 사용해서 데이터를 입력받음
		System.out.print("이름> ");
		String name = sc.next();			//next: 공백을 포함하지 않는 문자열
		
		System.out.print("나이> ");
		int age = sc.nextInt();
		
		System.out.print("신장> ");
		double cm = sc.nextDouble();
		
		System.out.print("자기소개> ");
		sc.nextLine();//*여기에 nextLine를 작성해 위에서 남아있는 엔터값을 제거하고 입력 받는다
		String intro = sc.nextLine();		//엔터값 이전까지 또한 데이터값이여서 위에서 입력하며 
											//엔터를 누르게 되면 값이 들어왓다고 판단해 아무것도 입력 할 수가 없다.
		
		
		System.out.println("이름: " + name 
						+ ", 나이: " + age+"세" 
						+ ", 신장: " + cm + "cm");
		System.out.println("자기소개: " + intro);
		sc.close();	//다 사용했다면 닫아주는게 좋다.
		
		
		
		
		
		
		
		
		
	}
	
}



































