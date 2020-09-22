package api.lang.system;

public class MainClass {
	public static void main(String[] args) {
		
		
		System.out.println("~.~\n");
		
		
		//반환: long
		//1970 1월 1일 00시 부터 현재 시간 까지 경과시간을 밀리초로 환산.
		long start = System.currentTimeMillis(); //자주 유용하게 사용할 꺼임
		
//		System.out.println(start);
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("계산 경과 시간: " + (end - start) * 0.001 + "초");
		
		///////
		
//		String os = System.getProperties("os");
		
		
		
		
		
		
		
		
	}
}











































