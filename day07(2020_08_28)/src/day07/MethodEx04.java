package day07;

import java.util.Arrays;

public class MethodEx04 {
	public static void main(String[] args) {
		
		//메서드의 매개변수, 반환유형으로 배열을 전달하는 방법.
		
		int[] arr = {1,2,3,4,5,6,7};
		method01(arr);
		
		//반환형을 잘 보고 만들어라
		String[] arr2 = method02();
		
		
	}
	
	
	//매개변수로 배열을 받는메서드
	static void method01(int[] arr) {	
		System.out.println(Arrays.toString(arr));
	}
	
	//반환유형으로 배열을 돌려주는 메서드
	static String[] method02() {
		
		String[] week = {"월", "화", "수" };
		
		return week;
	}
	
	
	
	
}








































