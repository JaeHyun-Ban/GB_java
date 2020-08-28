package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 타입을 큰 타입에 넣을 때는
		  자바 가상 머신JVM이 자동으로 형 변환을 해줍니다.(UpCasting)
		 */
		
		byte b = 10;
		short s = b;			//shor는 byte의 크기보다 크다 따라서 자동 형 변환
								//JVM이 운영체제 위에서 실행하여 알아서 형 변환을 도와준다.
		
		int i = b;				//byte -> int
		long l = b;				//byte -> long
		
		char c = '가';			//2byte
		int j = c;				//char -> int 변환(유니코드 숫자로 변경해서 들어간다.)
		System.out.println("가 의 유니코드 숫자값: " + j);	//형 변환이 되었단증거
		
		int k = 1000;			
		double d = k;			//정수 -> 실수 형 변환
		System.out.println("정수 -> 실수의 형 변환 값: " + d);
		
		
		
	}
}










