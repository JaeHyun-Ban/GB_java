package exception.trycatch;

public class TryCatchEx02 {
	
	public static void main(String[] args) {
		
		//반복문의 에러 처리
		String[] arr = {"홍길동", "이순신", "강감찬"};
		
		int i = 0;
		while(i < 4){ //4번째에서 에러 발생유도
			
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("while문에서 에러가 발생했습니다.");
				System.out.println("배열의 범위를 벗어났습니다.");
			}finally {
				System.out.println("finally는 문장의 예외아 상관없이 항상 출력합니다.");
			}
			
			i++;			
		}
		
		
		
		
		
		
		
		
		
	}
}
