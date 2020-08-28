package day02;

public class CastingEx02 {

	public static void main(String[] args) {
		
		/*
		 - 큰타입 -> 작은 타입 형 변환
		 type캐스팅을 이용해서 명시적 형 변환을 해야 한다.
		 */
		
		int i = 70;
		char c = (char) i;		//직접 타입을 추가해 준다.
		short s = (short) i;
		
		
		float f = 3.14F;
		int j = (int) f;
		System.out.println("정수 j의 값: " + j);	//실수 부분을 제외되고 정수만 남는다.
		
		
		/*
		 # 강제 타입 변환 시 주의할 점
		 - 해당 값을 받을 수 없는 범위가 들어오면 잘려나간(쓰레기 값)을 저장하게 된다.
		 
		 */
		
		int a = 1000;
		byte b = (byte) a;
		System.out.println(b);		//1000은  byte에 담을 수 없는 값이기 때문에
									//쓰레기 값이 나오게 된다.
		
		/*
		 # 예외
		 - char형을 short형으로 바꿀 때도 명시적 형 변환이 필요하다.
		 */
		
		char cc = 'A';
		short ss = (short) cc;		//둘의 크기는 같지만
		System.out.println(ss
				);
		
		
		
		
	}
}



















