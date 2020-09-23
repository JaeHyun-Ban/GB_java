package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};
		
		//sort정렬
		Arrays.sort(arr);;
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		//BinarySearch() - 정렬이 선행되어야 한다.
		//(바이너리 검색)
		int index = Arrays.binarySearch(arr, 3); //int형 반환
		System.out.println("3이 있는 index: " + index);
		
		int index2 = Arrays.binarySearch(arr, 100);
		System.out.println(index2);
		//>값을 찾지 못했다면  -(마지막 index값 +1)을 리턴한다
		
		System.out.println();
		
		//배열 복사(배열 이름, 길이)
		int[] newArr = Arrays.copyOf(arr, arr.length); //전체 길이만큼 복사
		System.out.println("newArr: " + Arrays.toString(newArr));
		
		System.out.println();
		
		//배열 복사(배열 이름, 시작index, 끝index)
		int[] newArr2 = Arrays.copyOfRange(arr, 2, arr.length);
		System.out.println("newArr: " + Arrays.toString(newArr2));
		
		System.out.println();
		
		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열의 요소가 일치한다.");
		}
		
		
		
	}

}






















































