package quiz;

import java.util.Scanner;

public class Quiz32 {
	
	public static void main(String[] args) {
		
		/*
		 * up down
		 * 
		 * 1~100까지 임의 숫자를 생성.
		 * 스캐너를 통해서 값을 입력받슷빈다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답이라면 시도횟수: x회 를 출력하고 종료.
		 */
		
		
		System.out.println("UP! DWON!");
		System.out.println("1~100 임의의 숫자 생성됨!!!");
		System.out.println();
		
		int ran = (int)(Math.random()*100) + 1;	//1~100
		int count = 0;	//정답횟수
		
		Scanner sc = new Scanner(System.in);
		
		quiz:while(true) {
			
			System.out.println("정수 입력!");
			System.out.print("> ");
			int num = sc.nextInt();
			count++;
			if(num == ran) {
				System.out.println("정답입니다!!!");
				System.out.println();
				break quiz;	//편하고 좋구만
			}else if(num > ran) {
				System.out.println("더 작은수를 입력하세요!!!");
				System.out.println();
			}else {
				System.out.println("더 큰수를 입력하세요!!!");
				System.out.println();
			}
		}//while
		System.out.println("===================================");
		System.out.println("정답 시도횟수: " + count + "회");
		
		
		
		
		
	}
}









































