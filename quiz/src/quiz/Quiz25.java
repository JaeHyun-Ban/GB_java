package quiz;

import java.util.Arrays;

public class Quiz25 {
	
	//숙제
	public static void main(String[] args) {
		/*
		int x = 1;
		int y = 5;
		
		//swap
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x의 값: " + x + ", y의 값: " + y);
		*/
		
		//1. 1~9까지 배열의 값중에 *절대 중복되지 않는 숫자로* 만들어진 3개의 크기의 배열을 만들어내는 프로그램
		//	*arr에서 절대 중복되지 않게 3개의 숫자를 추출.* (길이만큼 돌면서 랜덤으로 값을 섞음)
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		 
		int[] ranArr = new int[3];	//3개 저장할 배열
		
		for(int i = 0; i < arr.length; i++) {
			
			int ranNum = (int)(Math.random()*arr.length);	//0~9미만의 랜덤 숫자
			
			int tmp = arr[i];
			arr[i] = arr[ranNum];
			arr[ranNum] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < ranArr.length; i++) {
			ranArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(ranArr));
		
		
//		for(int j = 0; j < 3; j++) {
//			
//			//랜덤으로 섞어주기(swap)
//			for(int i = j; i < arr.length; i++) {	//i = j를 통해  중복값을 방지
//				
//				int ranNum = (int)(Math.random()*arr.length);	//0~9미만의 랜덤 숫자
//				
//				int tmp = arr[i];
//				arr[i] = arr[ranNum];
//				arr[ranNum] = tmp;
//			}
//			
//			ranArr[j] = arr[j];
//			
//		}
//		System.out.println(Arrays.toString(ranArr));
//		System.out.println("=========================================");
		
		
		//for문을 다시 한번 이용해서 0,1,2인덱스 값을 새로운 배열에 이동시키자.
		
		
		
	}
}








































