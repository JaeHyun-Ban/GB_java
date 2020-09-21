package exception.trycatch;

public class RuntimeEx {
	public static void main(String[] args) {

		// 실행 예외의 대표적인 종류
		// ArrayIndex
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[5]);
		
		//Classcasting
//		String s = (String)new Object();
		
		//NumberFormat
		String s = "10";
		int num = Integer.parseInt(s);//.을찍어서 사용하는거보니 너도 "static"으로 되어있구나
		System.out.println(num);
		
		
		//NullPointer
//		String s = null;
//		s.charAt(10);
		
	}
}






































