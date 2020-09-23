package quiz20;

public class MathQuiz01 {
	public static void main(String[] args) {

		/*
		 * 올림 메서드를 이용해서 1-10이 전달되면 1이 반환되는 page()를 생성
		 * 11-20값이 전달되면 2가 반환된다.
		 * 21-30값이 전달되면 3이 반환된다.
		 * ....~
		 */
		
		System.out.println(page(20));
		
	
	}
	
	public static int page(int num) {
		
		return (int)Math.ceil(num / 10.0);
		
	}

}

















