package quiz;

public class MethodQuiz030 {
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	//Quiz21
	static int sumNum(int a, int b) {
		
		if(a == b) return a;
		
		int sum = 0;
		for(int i = (a > b ? b : a); i <= (a > b ? a : b); i++) {
			sum += i;
		}
		return sum;
	}
	
	
	
	
	
}
