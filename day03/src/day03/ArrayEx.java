package day03;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		//1. 배열의 선언 - Java는 타입에 []을 붙여준다
		int[] arr;
		//C언어에서 사용하는법 = 이름에 []를 넣음
//		int arr[];
		
		
		//2. 배열의 생성 - 배열의 생성시 크기를 명시함
		arr = new int[5];
		System.out.println(arr);	//배열의 0번째 인덱스의 주소값이 출력된다
		System.out.println("------------------------------------------");
		
		
		//3. 배열의 초기화
		arr[0] = 34;
		arr[1] = 100;
		arr[2] = 50;
		arr[3] = 56;
		arr[4] = 80;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 값: " + arr[2]);
		arr[2] = 123;
		System.out.println("배열의 3번째 값: " + arr[2]);
		System.out.println("------------------------------------------");
		
		
		//5. 배열의 저장된 값을 한눈에 문자열의 형태로 확인
		System.out.println(Arrays.toString(arr));	//toString을 이용해 문자열의 형태로 쭉 뽑아서 보여준다
		System.out.println("------------------------------------------");
		
		
		//6. 배열의 길이 - 배열명.length
		System.out.println("배열의 길이: " + arr.length);
		System.out.println("------------------------------------------");
		
		
		
		//7. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[10];
		
		
		//8. 배열의 선언가 생성 초기화를 동시에
		short[] arr3 = new short[] {1,2,3,4,5};
		System.out.println("arr3: " + Arrays.toString(arr3));
		short[] arr4 = {1,2,3,4,5,6};
		System.out.println("arr4: " + Arrays.toString(arr4));
		
		String[] arr5 = {"월", "화", "수", "목", "금", "토", "일"};
//		String[] arr5 = new String[4];
//		arr5[0] = "월";
		System.out.println("arr5: " + Arrays.toString(arr5));
		
		
		
		
		
		
		
		
		
		
		
	}
}










