package quiz;

public class Quiz01 {
	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		//각각 값의 결과는 몇인지 유추해 보세요
		System.out.println(y += 10 - x++);				//15 -2 = 13
		System.out.println(x += 2);						//x = 3, = 5
		System.out.println(!('A' <= c && c <= 'Z'));	//= F
		System.out.println('C' - c);					//= 2			int보다 작은 연산은 int로 반환
		System.out.println(c + 1);						//= 66		x, 	계산은 int형으로 반환 한다
		System.out.println(++c);						//= B		x
		System.out.println(c++);						//= B		x		
		System.out.println(c);							//= C		x
		
		
		
	}
}
