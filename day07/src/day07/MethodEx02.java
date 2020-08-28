package day07;

public class MethodEx02 {
	public static void main(String[] args) {
		
		/*
		 * 매개변수(Parameter)
		 * 1. 매개변수는 메서드를 호출할 때, 실행에 필요한 값을 전달하는 매개체 입니다.
		 * 2. 매개변수를 몇개를 받을지는 메서드 선언시에 결정합니다.
		 * 3. 매개변수를 여려개 받고 싶다면, 로 연결하고, 
		 * 		받지 않는다면 ()를 비워두면 됩니다.
		 */
		
		int result = calSum(10);
		System.out.println("1~10까지 합: " + result);
		
		
		int result2 = calSum(20);
		System.out.println("1~20까지 합: " + result2);
		
		int result3 = calSum2(10, 20);
		System.out.println("10~20까지 합: " + result3);
		
		
		String result4 = calsSum3(1,10,"가");
		System.out.println("결과: " + result4);
		
	}
	
	static int calSum(int end) {
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String calsSum3(int start, int end, String s) {
		
		String str = "";
		for(int i = start; i <= end; i++) {
			str += s;
		}
			
		return str;
	}
	
	
	
}




























