package quiz07;

public class ArrayPrint {
	
	//메서드 오버로딩, 문자열 배열을 받아서, 배열요소를 문자열의 형태로 리턴
	String printArray(int[] arr) {
		String str = "[";
//		str += "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		return str;
	}
	
	String printArray(String[] arr) {
		String str = "[";
//		str += "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		return str;
	}
	

	
}
