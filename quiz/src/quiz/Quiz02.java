package quiz;

public class Quiz02 {

	public static void main(String[] args) {

		//1~100까지 랜덤한 정수를 발생시킨 다음 짝수인지 홀수인지 출력하는 3항 연산식
		
		int num = (int)(Math.random() * 100) + 1;
		
		String result = num%2 == 0 ? "짝수 입니다!" : "홀수 입니다!";
		
		System.out.println("랜덤숫자: " + num + "는 " +result);
		//println에 바로 연산식을 작성해서 출력 할 수 도 있다.

	}

}
