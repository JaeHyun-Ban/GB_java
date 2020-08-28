package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if뒤에 소괄호가 true면 if중괄호를 실행, false라면 else중괄호를 실행
		
		//&와 &&의 차이 -> 좌항의 결과에 따라 우항이 실행 될수도 안 될수도 있다.
		if(x != 10 && ++y == 21) {
			System.out.println("참 입니다!");
		}else {
			System.out.println("거짓 입니다!");
		}
		System.out.println("x의 값: " + x + ", y의 값: " + y);
		
		//|와 ||의 차이 -> 좌항의 결과에 따라 우항이 실행 될수도 안 될수도 있다.
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다!");
		}else {
			System.out.println("거짓 입니다!");
		}
		System.out.println("x의 값: " + x + ", y의 값: " + y);
		
		
		
		
		
		
		
		
	}

}
































