package day04;

public class WhileEx03 {
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;		//숫자를 셀 변수
		
		while(i < 101) {		//100보다 작을 때 까지 ㅈ건이 성립
			
			if(i % 2 ==0) {
				count++;
			}
			
			i++;
			
			
		}
		
		 System.out.println("1~100까지의 짝수 갯수:" + count);
		
		
		
		
		
	}
}
