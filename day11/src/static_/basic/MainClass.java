package static_.basic;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 녹색 계산기와, 빨간색 계산기를 각각 생성
		 * 2. pi값을 사용해서 원의 넓이를 확인
		 * 3. circle() 를 사용해서 원의 넓이를 확인
		 * 
		 */
		Calculator green = new Calculator();
		green.setColor("green");
		Calculator red = new Calculator();
		red.setColor("red");
		
		System.out.println("원의 넓이: + " + Calculator.pi * 5 * 5);	
		
		System.out.println(Calculator.circle(5));
		
		String[] arr = {"가", "나"};
		int[] arr2 = {1, 2, 3};
		
		
		System.out.println(ArrayPrint.printArray(arr));
		System.out.println(ArrayPrint.printArray(arr2));
		
//		ArrayPrint ap = new ArrayPrint(); //객체 생성 안됨;
		
		
	}
}

































