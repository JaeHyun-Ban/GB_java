package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	
	//quiz10
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요> ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int i = 0;
		while(i < num) {
			
			for(i = 0; i < num; i++) {
				arr[i] = i+1;
				System.out.println(arr[i]);
			}	
		}
		
		System.out.println("배열 arr는: " + Arrays.toString(arr));
		sc.close();
		
		
	}
}


































