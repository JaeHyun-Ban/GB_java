package day02;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산에서의 형 변환
		char c = 'C';
		int i = 2;
		
		//1. 서로다른 타입의 연산에서 큰타입에 맞추어 자동 형 변한 됩니다.
		char cc = (char) (c + i);		//코드는 좌에서 우로 순서대로 진행 한다.
		System.out.println(cc);
		int ii = c + i;					//
		System.out.println(ii);
		
		
		int j = 10;
		double d = 3.14;
		int result = (int) (j + d);
		System.out.println(result);
		
		
		//2. int형보다 작은 타입의 연산 결과는 int가 된다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte) (b1 + b2);		//int 보다 작은 타입은 계산 시 기준인 int 형태로 나온다
		
		
		
		//short, byte는 int보다 작기때문에 계산 결과는 기준인 int형으로 나온다
		short s1 = 100;
		byte br = 10;
		short ss = (short) (s1 + br);
		
		
		
	}
}























