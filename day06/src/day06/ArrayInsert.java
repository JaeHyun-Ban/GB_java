package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	//Quiz-16-1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		int count = 0;	//입력받은 
		
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("# 먹고싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");
		menu:while(true) {
			
			System.out.print("> ");
			String menu = sc.nextLine();
			if(menu.equals("그만")) {
				System.out.println("입력종료!!");
				break menu;
			}
			
			arr[count] = menu;
			count++;
			
		}
		System.out.println("================================");
		System.out.print("내가 먹고싶은 음식들: [");
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		
		
		
		
		
		
	}
}
















































