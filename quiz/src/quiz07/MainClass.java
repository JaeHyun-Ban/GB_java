package quiz07;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(ap.printArray(arr));
		
		System.out.println("==================================");
		
		String[] arr2 = {"가", "나", "다", "라"};
		System.out.println(Arrays.toString(arr2));
		System.out.println(ap.printArray(arr2));
		
	}
	
}
