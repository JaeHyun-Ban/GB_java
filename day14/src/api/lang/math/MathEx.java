package api.lang.math;

public class MathEx {
	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		System.out.println("");
		
		//올림
		double d1 = Math.ceil(1.1); //ceil: 천장 - 올림
		System.out.println(d1);
		
		
		//내림
		double d2 = Math.floor(1.5); //floor: 바닥 - 내림
		System.out.println(d2);
		
		//반올림
		double d3 = Math.round(1.5);
		System.out.println();
		
		//절대값
		int d4 = Math.abs(-10);
		System.out.println("d4: " + d4);
		
		
		//큰수
		int d5 = Math.max(5, 10);//둘 중 더 큰값을 리턴
		
		
	}
}









































