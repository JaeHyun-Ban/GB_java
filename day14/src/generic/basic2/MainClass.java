package generic.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		//key - Integer, value - String
		Basic<Integer, String> basic = new Basic<>();
		
		basic.put(1, "홍길동"); 
		String name = basic.get(1); //key = 1인 value를 리턴
		
		System.out.println(basic.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
















































