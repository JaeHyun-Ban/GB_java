package day02;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		//부호 연산자 +, -
		int i = -3;
		int j = -i;
		System.out.println(j);
		
		
		//증감 연산자 ++, --
		int k = 1;
		int h = k++;				//k++, ++k는 다르다
									//k++는 대입 이후에 증가 한다.
									//++k는 대입 전에 증가한다.
		System.out.println("k의 값: "+k);
		System.out.println("k++된 h의 값: " + h);
		
		int x = 1;
		int y = ++x;
		System.out.println("x값: " + x);
		System.out.println("y값: " + y);
		
		x = 1;
		x++;
		++x;
		System.out.println(x);
		
		System.out.println("--------------------------------------------");
		
		x = 1;
		y = 1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		x = 10;
		y = 10;
		int result = (x++) + (++y) + 10;
		System.out.println(result);
		
		//예외적인 상황
		x = 10;
		y = 10;
		int result2 = x++ + x++ + x++;
		//int result = 10 + 11 + 12; 형식으로 식이 계산된다.
		//같은 항이 중복되서 작성되면 이렇게 진행한다.
		System.out.println(result2);
		
		System.out.println("------------------------------");
		
		//비트 연산자~ (비트값을 반대로 치환)
		byte b = 10; //0000 1010
		System.out.println(~b); //1111 0101
		System.out.println("------------------------------");
		
		
		//논리 반전 연산자: ! (반대의 의미)
		
		
		
		
	}
}





































