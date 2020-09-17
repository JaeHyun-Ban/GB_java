package static_.basic;

public class ArrayPrint {
	
	//1. 외부에서 객체를 생성하지 못하도록 접근제어자를 선언 
	//> 생성자를 막으세용 > 생성자를 private로 생성
	//2. static메서드로 변경해서 사용.

	//Arrays.toString 같은게 이런 형식으로 구성되어있다.
	private ArrayPrint() {
		// TODO Auto-generated constructor stub
	}
	
	static String printArray(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	static String printArray(int[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	
}
