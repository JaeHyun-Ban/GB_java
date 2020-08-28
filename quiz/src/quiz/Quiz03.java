package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		
		//랜덤을 이용해서 -5 ~ 5의 랜덤 수를 발생시키세요
		//3항 연산식을 사용해서 절대값을 구하는 식을 세우세요
		
		int num = (int)(Math.random()*11) -5;
		
		int result = num < 0? num*-1 : num;
		System.out.println("랜덤값: " + num);
		System.out.println(num + "의 절대값: " + result);
		
		
		
	}
}
