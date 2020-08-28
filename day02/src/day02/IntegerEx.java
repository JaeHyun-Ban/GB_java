package day02;

public class IntegerEx {
	
	public static void main(String[] args) {
		
		//정수형
		
		//byte
//		byte a = 128; -> X
		byte a = 127;		//byte양수의 최대 저장 범위
		byte a1 = -128;		//byte음수의 최대 저장 범위
		
		//short
		short b = 32767;
		short b1 = -32768;
		
		//int형
		int c = 2147483647;
		int c1 = -2147483648;
		
		//long
		long d = 123123123123123L;		//숫자 뒤에 L을 추가한다.
		
		
		/*
		 - 2진수를 저장할 때는 0b를 붙임
		 - 8진수를 저장할 때는 0을 붙임
		 - 16진수를 저장할 때는 0x를 붙임
		 */
		
		int bin = 0b1010;				//2진수 저장
		System.out.println("2진수 1010: " + bin);
		
		int octa = 064;
		System.out.println("8진수 064: " + octa);
		
		int hexa = 0x3a4c;
		System.out.println("16진수 0x314c: " + hexa);
		
		System.out.println("----------------------------------------------------------");
		
		
		//실수형
		float f1 = 3.14F; //F를 붙여준다.
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415923F;
		double d2 = 3.1415921234;
		System.out.println(f2);		//float는 7자리까지 표현이 가능하다.
		System.out.println(d2);
		
		
		//지수형태 e표기법
		float f3 = 3.14159e-2F;
		float f4 = 0.00314e3F;
		System.out.println(f3);
		System.out.println(f4);
		
		System.out.println("----------------------------------------------------------");
		
		//논리형
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
		
		
		
		
		
	}
	
	
}





















