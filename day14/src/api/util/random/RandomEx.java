package api.util.random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		//Math.random이 아닌 Random util
		Random ran = new Random();
		
		int x1 = ran.nextInt(); //int가 표현하는 범위까지 랜덤값을 리턴 2^32
		System.out.println("x1: " + x1);
		
		int x2 = ran.nextInt(10); //0~10미만 랜덤 정수
		System.out.println("x2: " + x2);
		
		double d1 = ran.nextDouble(); //0~1.0미만 실수
		double d2 = Math.random(); //0~1.0미만 실수
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}








































