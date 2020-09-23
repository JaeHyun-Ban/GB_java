package api.lang.wrapper;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		//AutoBoxing: 기본타입을 자동으로 객체형으로 변환
		Integer val1 = 100;
		Double val2 = 3.14;
		
		//그냥 다시 기본타입에 바로 넣으면 된다.
		int a = val1;
		double b = val2;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES); //4byte
		
		//AutoBoxing 이후에는 wrapper클래스는 문자열을 기본형으로 변환하는데 많이 사용된다.
		
		int v1 = Integer.parseInt("3");//문자열 숫자를 받아 int형으로 변환
		double v2 = Double.parseDouble("3.14");//문자열로 소수점를 받아 double형으로 변환
		long v3 = Long.parseLong("10");
		
		System.out.println(v1 + v2 + v3);
		
		
		
	}
}





















































