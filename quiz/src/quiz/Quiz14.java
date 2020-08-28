package quiz;

import java.util.Scanner;

public class Quiz14 {
	
	//IfEx02와 구문이 동일하게 실행되도록 switch구문으로 변경
	//힌트: 점수를 10으로 나눈 몫을 이용해 처리해보자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력> ");
		int point = sc.nextInt();
		
		switch (point/10) {
		
		case 9:	//90~99
			if(point%10 >= 5) {
				System.out.println("A+학점!!!");
				break;
			}
			System.out.println("A학점!!!");
			break;
		case 8:	//80~89
			System.out.println("B학점!!!");
			break;
		case 7:	//70~79
			System.out.println("C학점!!!");
			break;
		case 6:	//60~69
			System.out.println("D학점!!!");
			break;			
		default:	//0~59
			if(point == 100) {	//애매한 100점을  default에서 처리 할 수 있다.
				System.out.println("100점 입니다!!");
			}else if(point > 100) {
				System.out.println("잘못된 입력 입니다!!");
			}else {
				System.out.println("F학점!!!");
			}
			break;
		}
		
		sc.close();
		
	}
}
